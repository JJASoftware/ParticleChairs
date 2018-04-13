package com.jjasoftware.particlechairs.chair.particles;

import com.jjasoftware.particlechairs.main.Main;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class Particles {

    private static Main main = Main.getMain();

    public static void doParticles(Player player) {
        String shape = main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getString("particle-shape");
        for (Entity entity : player.getNearbyEntities(2, 2, 2)) {
            if (entity.getType().equals(EntityType.ARMOR_STAND)) {
                if (!(player.getVehicle() == null)) {
                    switch (shape.toUpperCase()) {
                        case "HALO":
                            Shapes.playHalo(player);
                            break;
                        case "HELIX":
                            Shapes.playHelix(player);
                            break;
                        case "CIRCLE":
                            Shapes.playCircle(player);
                            break;
                        default:
                            Shapes.playHelix(player);
                            break;
                    }
                }
            }
        }
    }
}