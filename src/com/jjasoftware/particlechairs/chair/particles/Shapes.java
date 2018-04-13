package com.jjasoftware.particlechairs.chair.particles;

import com.jjasoftware.particlechairs.main.Main;
import org.apache.commons.lang3.EnumUtils;
import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class Shapes {

    private static Main main = Main.getMain();

    public static void playCircle(Player player) {
        if (EnumUtils.isValidEnum(Effect.class, main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getString("particle-effect"))) {
            main.getServer().getScheduler().scheduleSyncRepeatingTask(main, new Runnable() {
                public void run() {
                    Effect effect = Effect.valueOf(main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getString("particle-effect"));
                    String shape = main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getString("particle-shape");
                    Float r = (float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-r");
                    Float g = (float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-g");
                    Float b = (float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-b");
                    if (effect.equals(Effect.COLOURED_DUST)) {
                        if (shape.toUpperCase().equals("CIRCLE")) {
                            if (r.equals((float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-r")) && g.equals((float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-g")) && b.equals((float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-b"))) {
                                if (!(player.getVehicle() == null)) {
                                    new BukkitRunnable() {
                                        Location playerLoc = player.getVehicle().getLocation();

                                        double x, y, z;

                                        Float r = (float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-r");
                                        Float g = (float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-g");
                                        Float b = (float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-b");

                                        public void run() {
                                            if (!(player.getVehicle() == null)) {
                                                for (int i = 0; i < 20; i++) {
                                                    double angle, x, z;
                                                    angle = 2 * Math.PI * i / 20;
                                                    x = Math.cos(angle);
                                                    z = Math.sin(angle);
                                                    playerLoc.add(x, 2, z);
                                                    player.getWorld().spigot().playEffect(playerLoc, effect, 0, 0, r / 255, g / 255, b / 255, 1, 0, 50);
                                                    playerLoc.subtract(x, 2, z);
                                                    this.cancel();
                                                }
                                            } else {
                                                this.cancel();
                                            }
                                        }
                                    }.runTaskTimer(main, 0, 0);
                                }
                            }
                        }
                    } else {
                        if (shape.toUpperCase().equals("CIRCLE")) {
                            if (r.equals((float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-r")) && g.equals((float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-g")) && b.equals((float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-b"))) {
                                if (!(player.getVehicle() == null)) {
                                    new BukkitRunnable() {
                                        Location playerLoc = player.getVehicle().getLocation();

                                        double x, y, z;

                                        public void run() {
                                            if (!(player.getVehicle() == null)) {
                                                for (int i = 0; i < 20; i++) {
                                                    double angle, x, z;
                                                    angle = 2 * Math.PI * i / 20;
                                                    x = Math.cos(angle);
                                                    z = Math.sin(angle);
                                                    playerLoc.add(x, 2, z+0.02);
                                                    player.getWorld().spigot().playEffect(playerLoc, effect, 0, 0, 0, 0, 0, 1, 0, 50);
                                                    playerLoc.subtract(x, 2, z+0.02);
                                                    this.cancel();
                                                }
                                            } else {
                                                this.cancel();
                                            }
                                        }
                                    }.runTaskTimer(main, 0, 0);
                                }
                            }
                        }
                    }
                }
            }, 0, 0);
        } else {
            player.sendMessage(main.prefix + ChatColor.RED + "There was an error with your playerdata file. Don't worry we reset it back to default for you!");
            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-effect", "COLOURED_DUST");
            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-shape", "none");
            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-r", 255);
            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-g", 1);
            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-b", 1);
            main.save();
        }
    }

    public static void playHalo(Player player) {
        if (EnumUtils.isValidEnum(Effect.class, main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getString("particle-effect"))) {
            main.getServer().getScheduler().scheduleSyncRepeatingTask(main, new Runnable() {
                public void run() {
                    Effect effect = Effect.valueOf(main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getString("particle-effect"));
                    String shape = main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getString("particle-shape");
                    Float r = (float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-r");
                    Float g = (float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-g");
                    Float b = (float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-b");
                    if (effect.equals(Effect.COLOURED_DUST)) {
                        if (shape.toUpperCase().equals("HALO")) {
                            if (r.equals((float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-r")) && g.equals((float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-g")) && b.equals((float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-b"))) {
                                if (!(player.getVehicle() == null)) {
                                    new BukkitRunnable() {
                                        Location playerLoc = player.getVehicle().getLocation();

                                        double x, y, z;

                                        Float r = (float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-r");
                                        Float g = (float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-g");
                                        Float b = (float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-b");

                                        public void run() {
                                            if (!(player.getVehicle() == null)) {
                                                for (int i = 0; i < 10; i++) {
                                                    double angle, x, z;
                                                    angle = 2 * Math.PI * i / 10;
                                                    x = 0.5*Math.cos(angle);
                                                    y = 3;
                                                    z = 0.5*Math.sin(angle);
                                                    playerLoc.add(x, 3, z);
                                                    player.getWorld().spigot().playEffect(playerLoc, effect, 0, 0, r / 255, g / 255, b / 255, 1, 0, 50);
                                                    playerLoc.subtract(x, 3, z);
                                                    this.cancel();
                                                }
                                            } else {
                                                this.cancel();
                                            }
                                        }
                                    }.runTaskTimer(main, 0, 0);
                                }
                            }
                        }
                    } else {
                        if (shape.toUpperCase().equals("HALO")) {
                            if (r.equals((float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-r")) && g.equals((float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-g")) && b.equals((float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-b"))) {
                                if (!(player.getVehicle() == null)) {
                                    new BukkitRunnable() {
                                        Location playerLoc = player.getLocation();

                                        double x, y, z;

                                        public void run() {
                                            if (!(player.getVehicle() == null)) {
                                                for (int i = 0; i < 10; i++) {
                                                    double angle, x, z;
                                                    angle = 2 * Math.PI * i / 10;
                                                    x = 0.5*Math.cos(angle);
                                                    z = 0.5*Math.sin(angle);
                                                    playerLoc.add(x,2, z+0.02);
                                                    player.getWorld().spigot().playEffect(playerLoc, effect, 0, 0, 0, 0, 0, 1, 0, 50);
                                                    playerLoc.subtract(x, 2, z+0.02);
                                                    this.cancel();
                                                }
                                            } else {
                                                this.cancel();
                                            }
                                        }
                                    }.runTaskTimer(main, 0, 0);
                                }
                            }
                        }
                    }
                }
            }, 0, 0);
        } else {
            player.sendMessage(main.prefix + ChatColor.RED + "There was an error with your playerdata file. Don't worry we reset it back to default for you!");
            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-effect", "COLOURED_DUST");
            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-shape", "none");
            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-r", 255);
            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-g", 1);
            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-b", 1);
            main.save();
        }
    }

    public static void playHelix(Player player) {
        if (EnumUtils.isValidEnum(Effect.class, main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getString("particle-effect"))) {
            main.getServer().getScheduler().scheduleSyncRepeatingTask(main, new Runnable() {
                public void run() {
                    Effect effect = Effect.valueOf(main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getString("particle-effect"));
                    String shape = main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getString("particle-shape");
                    Float r = (float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-r");
                    Float g = (float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-g");
                    Float b = (float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-b");
                    if (effect.equals(Effect.COLOURED_DUST)) {
                        if (shape.toUpperCase().equals("HELIX")) {
                            if (r.equals((float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-r")) && g.equals((float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-g")) && b.equals((float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-b"))) {
                                if (!(player.getVehicle() == null)) {
                                    new BukkitRunnable() {
                                        Location playerLoc = player.getVehicle().getLocation();

                                        double radius = 1;
                                        double time = 0;
                                        double x, y, z;

                                        public void run() {
                                            if (!(player.getVehicle() == null)) {
                                                time = time + Math.PI / 16;
                                                x = radius * Math.cos(time);
                                                y = time;
                                                z = radius * Math.sin(time);
                                                playerLoc.add(x, y, z);
                                                player.getWorld().spigot().playEffect(playerLoc, effect, 0, 0, r / 255, g / 255, b / 255, 1, 0, 50);
                                                playerLoc.subtract(x, y, z);
                                                if (time > Math.PI) {
                                                    this.cancel();
                                                }
                                            } else {
                                                this.cancel();
                                            }
                                        }
                                    }.runTaskTimer(main, 0, 0);
                                }
                            }
                        }
                    } else {
                        if (shape.toUpperCase().equals("HELIX")) {
                            if (r.equals((float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-r")) && g.equals((float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-g")) && b.equals((float) main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).getInt("particle-color-b"))) {
                                if (!(player.getVehicle() == null)) {
                                    new BukkitRunnable() {
                                        Location playerLoc = player.getVehicle().getLocation();

                                        double radius = 1;
                                        double time = 0;
                                        double x, y, z;

                                        public void run() {
                                            if (!(player.getVehicle() == null)) {
                                                time = time + Math.PI / 16;
                                                x = radius * Math.cos(time);
                                                y = time;
                                                z = radius * Math.sin(time);
                                                playerLoc.add(x, y, z);
                                                player.getWorld().spigot().playEffect(playerLoc, effect, 0, 0, 0, 0, 0, 1, 0, 50);
                                                playerLoc.subtract(x, y, z);
                                                if (time > Math.PI) {
                                                    this.cancel();
                                                }
                                            } else {
                                                this.cancel();
                                            }
                                        }
                                    }.runTaskTimer(main, 0, 0);
                                }
                            }
                        }
                    }
                }
            }, 0, 20 * 2);
        } else {
            player.sendMessage(ChatColor.RED + "There was an error with your playerdata file. Don't worry we reset it back to default for you!");
            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-effect", "COLOURED_DUST");
            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-shape", "none");
            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-r", 255);
            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-g", 1);
            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-b", 1);
            main.save();
        }
    }
}