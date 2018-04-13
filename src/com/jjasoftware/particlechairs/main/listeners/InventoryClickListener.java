package com.jjasoftware.particlechairs.main.listeners;

import com.jjasoftware.particlechairs.main.Main;
import com.jjasoftware.particlechairs.main.util.Utils;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;


public class InventoryClickListener implements Listener {

    private static Main main = Main.getMain();

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (event.getInventory().getTitle().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Settings:")) {
            event.setCancelled(true);
            if(event.getCurrentItem() == null) return;
            ItemStack block = event.getCurrentItem();
            switch (block.getType()) {
                case RECORD_11:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.closeInventory();
                            Utils.openParticleShapeInventory(player);
                        }
                    }.runTask(main);
                    break;
                case STRING:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.closeInventory();
                            Utils.openParticleShapeInventory(player);
                        }
                    }.runTask(main);
                    break;
                case MELON_SEEDS:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.closeInventory();
                            Utils.openParticleEffectInventory(player);
                        }
                    }.runTask(main);
                    break;
                case BOOK:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.closeInventory();
                            Utils.openParticleEffectInventory(player);
                        }
                    }.runTask(main);
                    break;
                case POTION:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.closeInventory();
                            Utils.openParticleEffectInventory(player);
                        }
                    }.runTask(main);
                    break;
                case MOB_SPAWNER:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.closeInventory();
                            Utils.openParticleEffectInventory(player);
                        }
                    }.runTask(main);
                    break;
                case WEB:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.closeInventory();
                            Utils.openParticleEffectInventory(player);
                        }
                    }.runTask(main);
                    break;
                case EMERALD:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.closeInventory();
                            Utils.openParticleEffectInventory(player);
                        }
                    }.runTask(main);
                    break;
                case SNOW_BALL:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.closeInventory();
                            Utils.openParticleEffectInventory(player);
                        }
                    }.runTask(main);
                    break;
                case ARROW:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.closeInventory();
                            Utils.openParticleEffectInventory(player);
                        }
                    }.runTask(main);
                    break;
                case WATER_BUCKET:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.closeInventory();
                            Utils.openParticleEffectInventory(player);
                        }
                    }.runTask(main);
                    break;
                case LAVA_BUCKET:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.closeInventory();
                            Utils.openParticleEffectInventory(player);
                        }
                    }.runTask(main);
                    break;
                case FIREBALL:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.closeInventory();
                            Utils.openParticleEffectInventory(player);
                        }
                    }.runTask(main);
                    break;
                case ENDER_PEARL:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.closeInventory();
                            Utils.openParticleEffectInventory(player);
                        }
                    }.runTask(main);
                    break;
                case SLIME_BALL:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.closeInventory();
                            Utils.openParticleEffectInventory(player);
                        }
                    }.runTask(main);
                    break;
                case APPLE:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.closeInventory();
                            Utils.openParticleEffectInventory(player);
                        }
                    }.runTask(main);
                    break;
                case INK_SACK:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.closeInventory();
                            Utils.openParticleEffectInventory(player);
                        }
                    }.runTask(main);
                    break;
                case GOLD_RECORD:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.closeInventory();
                            Utils.openParticleEffectInventory(player);
                        }
                    }.runTask(main);
                    break;
                case FIREWORK:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.closeInventory();
                            Utils.openParticleEffectInventory(player);
                        }
                    }.runTask(main);
                    break;
                case BLAZE_POWDER:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.closeInventory();
                            Utils.openParticleEffectInventory(player);
                        }
                    }.runTask(main);
                    break;
                case WOOL:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.closeInventory();
                            Utils.openParticleColourInventory(player);
                        }
                    }.runTask(main);
                    break;
                case BARRIER:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.closeInventory();
                        }
                    }.runTask(main);
                    break;
                case STAINED_GLASS_PANE:
                    break;
            }
        }

        if (event.getInventory().getTitle().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Effects:")) {
            event.setCancelled(true);
            if(event.getCurrentItem() == null) return;
            ItemStack block = event.getCurrentItem();
            switch (block.getType()) {
                case MELON_SEEDS:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-effect", "COLOURED_DUST");
                            main.save();
                            player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle effect has been set to Coloured Dust!");
                            player.closeInventory();
                        }
                    }.runTask(main);
                    break;
                case BOOK:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-effect", "FLYING_GLYPH");
                            main.save();
                            player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle effect has been set to Flying Glyph!");
                            player.closeInventory();
                        }
                    }.runTask(main);
                    break;
                case POTION:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-effect", "POTION_SWIRL");
                            main.save();
                            player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle effect has been set to Potion Swirl!");
                            player.closeInventory();
                        }
                    }.runTask(main);
                    break;
                case MOB_SPAWNER:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-effect", "MOBSPAWNER_FLAMES");
                            main.save();
                            player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle effect has been set to Spawner Flames!");
                            player.closeInventory();
                        }
                    }.runTask(main);
                    break;
                case WEB:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-effect", "SMOKE");
                            main.save();
                            player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle effect has been set to Smoke!");
                            player.closeInventory();
                        }
                    }.runTask(main);
                    break;
                case EMERALD:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-effect", "HAPPY_VILLAGER");
                            main.save();
                            player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle effect has been set to Happy Villager!");
                            player.closeInventory();
                        }
                    }.runTask(main);
                    break;
                case SNOW_BALL:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-effect", "SNOW_SHOVEL");
                            main.save();
                            player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle effect has been set to Snow!");
                            player.closeInventory();
                        }
                    }.runTask(main);
                    break;
                case ARROW:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-effect", "CRIT");
                            main.save();
                            player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle effect has been set to Crit!");
                            player.closeInventory();
                        }
                    }.runTask(main);
                    break;
                case WATER_BUCKET:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-effect", "WATERDRIP");
                            main.save();
                            player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle effect has been set to Water Drip!");
                            player.closeInventory();
                        }
                    }.runTask(main);
                    break;
                case LAVA_BUCKET:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-effect", "LAVADRIP");
                            main.save();
                            player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle effect has been set to Lava Drip!");
                            player.closeInventory();
                        }
                    }.runTask(main);
                    break;
                case FIREBALL:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-effect", "LAVA_POP");
                            main.save();
                            player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle effect has been set to Lava Pop!");
                            player.closeInventory();
                        }
                    }.runTask(main);
                    break;
                case ENDER_PEARL:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-effect", "PORTAL");
                            main.save();
                            player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle effect has been set to Portal!");
                            player.closeInventory();
                        }
                    }.runTask(main);
                    break;
                case SLIME_BALL:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-effect", "SLIME");
                            main.save();
                            player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle effect has been set to Slime!");
                            player.closeInventory();
                        }
                    }.runTask(main);
                    break;
                case APPLE:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-effect", "HEART");
                            main.save();
                            player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle effect has been set to Heart!");
                            player.closeInventory();
                        }
                    }.runTask(main);
                    break;
                case INK_SACK:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-effect", "CLOUD");
                            main.save();
                            player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle effect has been set to Cloud!");
                            player.closeInventory();
                        }
                    }.runTask(main);
                    break;
                case GOLD_RECORD:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-effect", "NOTE");
                            main.save();
                            ;
                            player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle effect has been set to Note!");
                            player.closeInventory();
                        }
                    }.runTask(main);
                    break;
                case FIREWORK:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-effect", "FIREWORKS_SPARK");
                            main.save();
                            ;
                            player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle effect has been set to Firework Spark!");
                            player.closeInventory();
                        }
                    }.runTask(main);
                    break;
                case BLAZE_POWDER:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-effect", "FLAME");
                            main.save();
                            player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle effect has been set to Flame!");
                            player.closeInventory();
                        }
                    }.runTask(main);
                    break;
                case BARRIER:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.closeInventory();
                            Utils.openParticleInventory(player);
                        }
                    }.runTask(main);
                case STAINED_GLASS_PANE:
                    break;
            }
        }
        if (event.getInventory().getTitle().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Shapes:")) {
            event.setCancelled(true);
            if(event.getCurrentItem() == null) return;
            ItemStack block = event.getCurrentItem();
            switch (block.getType()) {
                case RECORD_11:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-shape", "CIRCLE");
                            main.save();
                            player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle shape has been set to a Circle! (You need to dismount to see the changes)");
                            player.closeInventory();
                        }
                    }.runTask(main);
                    break;
                case STRING:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-shape", "HELIX");
                            main.save();
                            player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle shape has been set to Helix! (You need to dismount to see the changes)");
                            player.closeInventory();
                        }
                    }.runTask(main);
                    break;
                case DOUBLE_PLANT:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-shape", "HALO");
                            main.save();
                            player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle shape has been set to Halo! (You need to dismount to see the changes)");
                            player.closeInventory();
                        }
                    }.runTask(main);
                    break;
                case BARRIER:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.closeInventory();
                            Utils.openParticleInventory(player);
                        }
                    }.runTask(main);
                    break;
                case STAINED_GLASS_PANE:
                    break;
            }
        }

        if (event.getInventory().getTitle().equals(ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Colours:")) {
            event.setCancelled(true);
            if(event.getCurrentItem() == null) return;
            ItemStack block = event.getCurrentItem();
            switch (block.getType()) {
                case WOOL:
                    switch (ChatColor.stripColor(block.getItemMeta().getDisplayName().toUpperCase())) {
                        case "RED":
                            new BukkitRunnable() {
                                @Override
                                public void run() {
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-r", 255);
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-g", 1);
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-b", 1);
                                    main.save();
                                    player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle colour has been set to Red!");
                                    player.closeInventory();
                                }
                            }.runTask(main);
                            break;
                        case "ORANGE":
                            new BukkitRunnable() {
                                @Override
                                public void run() {
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-r", 255);
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-g", 140);
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-b", 1);
                                    main.save();
                                    player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle colour has been set to Orange!");
                                    player.closeInventory();
                                }
                            }.runTask(main);
                            break;
                        case "YELLOW":
                            new BukkitRunnable() {
                                @Override
                                public void run() {
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-r", 255);
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-g", 255);
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-b", 1);
                                    main.save();
                                    player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle colour has been set to Yellow!");
                                    player.closeInventory();
                                }
                            }.runTask(main);
                            break;
                        case "GREEN":
                            new BukkitRunnable() {
                                @Override
                                public void run() {
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-r", 1);
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-g", 255);
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-b", 1);
                                    main.save();
                                    player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle colour has been set to Green!");
                                    player.closeInventory();
                                }
                            }.runTask(main);
                            break;
                        case "DARK BLUE":
                            new BukkitRunnable() {
                                @Override
                                public void run() {
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-r", 1);
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-g", 1);
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-b", 255);
                                    main.save();
                                    player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle colour has been set to Dark Blue!");
                                    player.closeInventory();
                                }
                            }.runTask(main);
                            break;
                        case "LIGHT BLUE":
                            new BukkitRunnable() {
                                @Override
                                public void run() {
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-r", 1);
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-g", 255);
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-b", 255);
                                    main.save();
                                    player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle colour has been set to Light Blue!");
                                    player.closeInventory();
                                }
                            }.runTask(main);
                            break;
                        case "PURPLE":
                            new BukkitRunnable() {
                                @Override
                                public void run() {
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-r", 255);
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-g", 1);
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-b", 255);
                                    main.save();
                                    player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle colour has been set to Purple!");
                                    player.closeInventory();
                                }
                            }.runTask(main);
                            break;
                        case "VIOLET":
                            new BukkitRunnable() {
                                @Override
                                public void run() {
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-r", 255);
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-g", 1);
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-b", 255);
                                    main.save();
                                    player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle colour has been set to Violet!");
                                    player.closeInventory();
                                }
                            }.runTask(main);
                            break;
                        case "PINK":
                            new BukkitRunnable() {
                                @Override
                                public void run() {
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-r", 255);
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-g", 192);
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-b", 203);
                                    main.save();
                                    player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle colour has been set to Pink!");
                                    player.closeInventory();
                                }
                            }.runTask(main);
                            break;
                        case "BLACK":
                            new BukkitRunnable() {
                                @Override
                                public void run() {
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-r", 1);
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-g", 1);
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-b", 1);
                                    main.save();
                                    player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle colour has been set to Black!");
                                    player.closeInventory();
                                }
                            }.runTask(main);
                            break;
                        case "DARK GREY":
                            new BukkitRunnable() {
                                @Override
                                public void run() {
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-r", 105);
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-g", 105);
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-b", 105);
                                    main.save();
                                    player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle colour has been set to Dark Grey!");
                                    player.closeInventory();
                                }
                            }.runTask(main);
                            break;
                        case "LIGHT GREY":
                            new BukkitRunnable() {
                                @Override
                                public void run() {
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-r", 192);
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-g", 192);
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-b", 192);
                                    main.save();
                                    player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle colour has been set to Light Grey!");
                                    player.closeInventory();
                                }
                            }.runTask(main);
                            break;
                        case "WHITE":
                            new BukkitRunnable() {
                                @Override
                                public void run() {
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-r", 255);
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-g", 255);
                                    main.getPlayersFile().getConfigurationSection("users").getConfigurationSection(player.getUniqueId().toString()).set("particle-color-b", 255);
                                    main.save();
                                    player.sendMessage(main.prefix + ChatColor.AQUA + "Your particle colour has been set to White!");
                                    player.closeInventory();
                                }
                            }.runTask(main);
                            break;
                    }
                    break;
                case SIGN:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.sendMessage(main.prefix + ChatColor.AQUA + "You can set a custom RGB colour value in your playerdata file.");
                            player.sendMessage(main.prefix + ChatColor.AQUA + "File Location: /plugins/ParticleChairs/players/" + player.getUniqueId().toString() + ".yml");
                            player.closeInventory();
                        }
                    }.runTask(main);
                case STAINED_GLASS_PANE:
                    break;
                case BARRIER:
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.closeInventory();
                            Utils.openParticleInventory(player);
                        }
                    }.runTask(main);
                    break;
            }
        }
    }
}