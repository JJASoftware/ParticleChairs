package com.jjasoftware.particlechairs.main;

import com.jjasoftware.particlechairs.chair.ChairsManager;
import com.jjasoftware.particlechairs.chair.listeners.ChairListener;
import com.jjasoftware.particlechairs.chair.nms.NMS;
import com.jjasoftware.particlechairs.chair.nms.v1_8_R3;
import com.jjasoftware.particlechairs.main.commands.ParticleChairsCommand;
import com.jjasoftware.particlechairs.main.listeners.InventoryClickListener;
import com.jjasoftware.particlechairs.main.listeners.PlayerJoinListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Main extends JavaPlugin {

    private static Main main;

    public static Map<Integer, ChairsManager> list = new HashMap<>();
    public static List<UUID> disableList = new ArrayList<>();
    public static List<UUID> playerUUIDList = new ArrayList<>();

    private static FileConfiguration config;
    private static FileConfiguration players;
    private static File configFile;
    private static File playersFile;

    public String prefix;

    public static NMS nms;

    public void onEnable() {
        main = this;
        if (setUpNms()) {
            getLogger().info("NMS hooked !");
        } else {
            getLogger().severe("Failed to setup nms !");
            getLogger().severe("Your server version is not compatible with this plugin!");
            Bukkit.getPluginManager().disablePlugin(this);
            return;
        }

        registerListeners();
        registerCommands();
        setupFiles();
        getPrefix();
    }

    private void registerListeners() {
        getServer().getPluginManager().registerEvents(new ChairListener(), this);
        getServer().getPluginManager().registerEvents(new InventoryClickListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
    }
    private void registerCommands() {
        getCommand("particlechairs").setExecutor(new ParticleChairsCommand());
        getCommand("pc").setExecutor(new ParticleChairsCommand());
    }

    private Boolean setUpNms() {
        String version;
        try {
            version = Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(",")[3];
        } catch (ArrayIndexOutOfBoundsException whatVersionAreYouUsingException) {
            return false;
        }
        getLogger().info("Your server is running version " + version);
        switch (version) {
            case "v1_8_R3":
                nms = new v1_8_R3();
                break;
        }
        return nms != null;
    }
    public void onDisable() {
        for (ChairsManager cm : list.values()) {
            if(cm.getPlayer() != null) {
                Player player = cm.getPlayer();
                player.teleport(cm.getLocation());
            }
        }
    }

    public static Main getMain(){
        return main;
    }

    public static Collection<Entity> getNearbyEntities(Location location, double x, double y, double z) {
        List<Entity> list = location.getWorld().getEntities();
        Collection<Entity> finalColl = new ArrayList<>();
        for (Entity entity : list) {
            Location l = entity.getLocation();
            if (location.getX() - x < l.getX() && location.getX() + x > l.getX())
                if (location.getY() - y < l.getY() && location.getY() + y > l.getY())
                    if (location.getZ() - z < l.getZ() && location.getZ() + z > l.getZ())
                        finalColl.add(entity);
        }
        return finalColl;
    }
    public static Integer getEntityId(Entity entity) {
        try {
            Class<?> CraftEntity = Class.forName("org.bukkit.craftbukkit." + nms.getVersion() + ".entity.CraftEntity");
            Class<?> EntityNMS = Class.forName("net.minecraft.server." + nms.getVersion() + ".Entity");
            Method getHandle = CraftEntity.getDeclaredMethod("getHandle");
            Method getId = EntityNMS.getDeclaredMethod("getId");
            getHandle.setAccessible(true);
            Object nms = getHandle.invoke(entity);
            getId.setAccessible(true);
            int id = (int) getId.invoke(nms);
            getId.setAccessible(false);
            getHandle.setAccessible(false);
            return id;
        } catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    private void setupFiles() {
        if(!getDataFolder().exists()) getDataFolder().mkdirs();

        configFile = new File(getDataFolder(), "config.yml");
        playersFile = new File(getDataFolder(), "players.yml");
        if(!configFile.exists()){
            try{
                configFile.createNewFile();
                Bukkit.getLogger().info("'config.yml'. created");
            }catch(IOException ex){
                Bukkit.getLogger().severe("Cannot create 'config.yml'. Plugin disabled!");
                Bukkit.getPluginManager().disablePlugin(this);
            }
        }
        config = YamlConfiguration.loadConfiguration(configFile);

        if(!playersFile.exists()){
            try{
                playersFile.createNewFile();
                Bukkit.getLogger().info("'players.yml'. created");
            }catch(IOException ex){
                Bukkit.getLogger().severe("Cannot create 'players.yml'. Plugin disabled!");
                Bukkit.getPluginManager().disablePlugin(this);
            }
        }
        players = YamlConfiguration.loadConfiguration(playersFile);
    }

    public FileConfiguration getConfig(){
        return config;
    }

    public FileConfiguration getPlayersFile(){
        return players;
    }

    public static void save() {
        try{
            config.save(configFile);
        }catch(IOException ex){
            Bukkit.getLogger().severe("Cannot save 'config.yml'. Plugin disabled!");
            Bukkit.getPluginManager().disablePlugin(main);
        }

        try{
            players.save(playersFile);
        }catch(IOException ex){
            Bukkit.getLogger().severe("Cannot save 'players.yml'. Plugin disabled!");
            Bukkit.getPluginManager().disablePlugin(main);
        }
    }
    public String getPrefix() {
        if(prefix == null) {
            getConfig().set("prefix", "&dParticleChairs&8&l» ");
            save();
            prefix = ChatColor.translateAlternateColorCodes('&', getConfig().get("prefix").toString());
            return prefix;
        } else {
            prefix = ChatColor.translateAlternateColorCodes('&', getConfig().get("prefix").toString());
            return prefix;
        }
    }
}