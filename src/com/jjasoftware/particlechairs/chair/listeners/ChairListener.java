package com.jjasoftware.particlechairs.chair.listeners;

import com.jjasoftware.particlechairs.chair.Blocks;
import com.jjasoftware.particlechairs.chair.ChairsManager;
import com.jjasoftware.particlechairs.main.Main;
import com.jjasoftware.particlechairs.chair.particles.Particles;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.material.Stairs;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Collection;

import static com.jjasoftware.particlechairs.main.Main.*;

public class ChairListener implements Listener {

    private static Main main = Main.getMain();

    @EventHandler
    public void spawnStairs(PlayerInteractEvent event) {
        Player player = event.getPlayer();

        if (disableList.contains(player.getUniqueId()))
            return;
        if (!event.getAction().equals(Action.RIGHT_CLICK_BLOCK))
            return;
        Block block = event.getClickedBlock();
        if (!(block.getState().getData() instanceof Stairs))
            return;
        if (block.getState().getData().toItemStack().getDurability() > 3)
            return;
        if (Blocks.from(block.getType()) == null)
            return;
        if (player.isSneaking())
            return;
        if (playerUUIDList.contains(player)) {
            return;
        }
        event.setCancelled(true);

        Location blockLoc = block.getLocation().add(0.5, -1.2, 0.5);

        if (!(player.getLocation().distance(block.getLocation().add(0.5, 0, 0.5)) < 2))
            return;
        if (ChairsManager.beingUsed(block.getState())) {
            player.sendMessage(main.prefix + ChatColor.RED + "Somebody is already sitting in that chair!");
            return;
        }

        Location playerLoc = player.getLocation();

        short data = block.getState().getData().toItemStack().getDurability();
        switch (data) {
            case 0:
                player.teleport(new Location(player.getWorld(), player.getLocation().getX(), player.getLocation().getY(), player.getLocation().getZ(), 90f, 0f));
                blockLoc.setYaw(90f);
                break;
            case 1:
                player.teleport(new Location(player.getWorld(), player.getLocation().getX(), player.getLocation().getY(), player.getLocation().getZ(), -90f, 0f));
                blockLoc.setYaw(-90f);
                break;
            case 2:
                player.teleport(new Location(player.getWorld(), player.getLocation().getX(), player.getLocation().getY(), player.getLocation().getZ(), -180f, 0f));
                blockLoc.setYaw(-180f);
                break;
            case 3:
                player.teleport(new Location(player.getWorld(), player.getLocation().getX(), player.getLocation().getY(), player.getLocation().getZ(), 0f, 0f));
                blockLoc.setYaw(0f);
                break;
            default:
                break;
        }
        ArmorStand stand = nms.spawn(blockLoc, player);
        if(stand == null)
            return;
        list.put(getEntityId(stand), new ChairsManager(block.getState(), player, playerLoc));
        Particles.doParticles(player);
        if (!playerUUIDList.contains(player.getUniqueId()))
                playerUUIDList.add(player.getUniqueId());
                final Player pf = player;
        new BukkitRunnable() {
            @Override
            public void run() {
                if (playerUUIDList.contains(pf.getUniqueId()))
                    playerUUIDList.remove(pf.getUniqueId());
            }
        }.runTaskLater(Main.getMain(), 2L);
    }

    @EventHandler
    public void onChairBreak(BlockBreakEvent event) {
        if(ChairsManager.beingUsed(event.getBlock().getState())) {
            event.setCancelled(true);
        }
    }
    @EventHandler
    public void onPlayerBreak(BlockBreakEvent event) {
        for (Entity entity : event.getPlayer().getNearbyEntities(2, 2, 2)) {
            if (entity.getType().equals(EntityType.ARMOR_STAND)) {
                event.setCancelled(true);
            }
        }
    }
    @EventHandler
    public void onPlayerPlace(BlockPlaceEvent event) {
        for (Entity entity : event.getPlayer().getNearbyEntities(2, 2, 2)) {
            if (entity.getType().equals(EntityType.ARMOR_STAND)) {
                event.setCancelled(true);
            }
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onSpawn(EntitySpawnEvent event) {
        if(!(event.getEntity() instanceof ArmorStand))
            return;
        ArmorStand entity = (ArmorStand) event.getEntity();
        if(nms.check(entity)) {
            event.setCancelled(false);
        }
    }
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onSpawn2(CreatureSpawnEvent event) {
        if (!(event.getEntity() instanceof ArmorStand))
            return;
        ArmorStand entity = (ArmorStand) event.getEntity();
        if (nms.check(entity)) {
            event.setCancelled(false);
        }
    }
    @EventHandler
    public void onTeleport(PlayerTeleportEvent event) {
        Location location = event.getTo();
        Collection<Entity> list = Main.getNearbyEntities(location, 0.1, 0.1, 0.1);
        for (Entity entity : list) {
            if (entity instanceof Player) {
                Player targetPlayer = (Player) entity;
                if (ChairsManager.isSitting(targetPlayer)) {
                    event.setTo(location.add(0, 1, 0));
                    break;
                }
            }
        }
        if (ChairsManager.isSitting(event.getPlayer())) {
            if (event.getPlayer().getVehicle() instanceof ArmorStand) {
                ArmorStand armorStand = (ArmorStand) event.getPlayer().getVehicle();
                if (nms.check(armorStand)) {
                    Main.list.remove(getEntityId(armorStand));
                    nms.kill(armorStand);
                }
            }
        }
    }
    @EventHandler(priority = EventPriority.LOWEST)
    public void quit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        if (ChairsManager.isSitting(player)) {
            if (player.getVehicle() != null) {
                Integer id = getEntityId(player.getVehicle());
                if (Main.list.containsKey(id)) {
                    ChairsManager cm = Main.list.get(id);
                    player.teleport(cm.getLocation());
                    Main.list.remove(id);
                }
            }
        }
    }
}
