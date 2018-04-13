package com.jjasoftware.particlechairs.main.listeners;

import com.jjasoftware.particlechairs.main.Main;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener {

    Main main = Main.getMain();

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        ConfigurationSection cs = main.getPlayersFile().getConfigurationSection("users");
        if(cs == null) {
            main.getPlayersFile().createSection("users");
            cs = main.getPlayersFile().getConfigurationSection("users");
            cs.createSection(player.getUniqueId().toString());
            cs.getConfigurationSection(player.getUniqueId().toString()).set("particle-effect", "COLOURED_DUST");
            cs.getConfigurationSection(player.getUniqueId().toString()).set("particle-shape", "none");
            cs.getConfigurationSection(player.getUniqueId().toString()).set("particle-color-r", 255);
            cs.getConfigurationSection(player.getUniqueId().toString()).set("particle-color-g", 1);
            cs.getConfigurationSection(player.getUniqueId().toString()).set("particle-color-b", 1);
            main.save();
        }
    }
}
