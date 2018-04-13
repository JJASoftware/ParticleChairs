package com.jjasoftware.particlechairs.main.util;

import com.jjasoftware.particlechairs.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Utils {

    private static Main main = Main.getMain();

    public static void openParticleInventory(Player player) {

        Inventory particleSettings = Bukkit.getServer().createInventory(null, 27, ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Settings:");

        ItemStack circle = setName(Material.RECORD_11, ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Shape", ChatColor.GRAY + "Choose your Particle Shape.");
        ItemStack helix = setName(Material.STRING, ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Shape", ChatColor.GRAY + "Choose your Particle Shape.");

        ItemStack colouredDust = setName(Material.MELON_SEEDS, ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Effect", ChatColor.GRAY + "Choose your Particle Effect.");
        ItemStack flyingGlyph = setName(Material.BOOK, ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Effect", ChatColor.GRAY + "Choose your Particle Effect.");
        ItemStack potionSwirl = setNameLoreShort(Material.POTION, 8258, ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Effect", ChatColor.GRAY + "Choose your Particle Effect.");
        ItemStack spawnerFlames = setName(Material.MOB_SPAWNER, ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Effect", ChatColor.GRAY + "Choose your Particle Effect.");
        ItemStack smoke = setName(Material.WEB, ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Effect", ChatColor.GRAY + "Choose your Particle Effect.");
        ItemStack happyVillager = setName(Material.EMERALD, ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Effect", ChatColor.GRAY + "Choose your Particle Effect.");
        ItemStack snowShovel = setName(Material.SNOW_BALL, ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Effect", ChatColor.GRAY + "Choose your Particle Effect.");
        ItemStack crit = setName(Material.ARROW, ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Effect", ChatColor.GRAY + "Choose your Particle Effect.");
        ItemStack waterDrip = setName(Material.WATER_BUCKET, ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Effect", ChatColor.GRAY + "Choose your Particle Effect.");
        ItemStack lavaDrip = setName(Material.LAVA_BUCKET, ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Effect", ChatColor.GRAY + "Choose your Particle Effect.");
        ItemStack lavaPop = setName(Material.FIREBALL, ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Effect", ChatColor.GRAY + "Choose your Particle Effect.");
        ItemStack portal = setName(Material.ENDER_PEARL, ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Effect", ChatColor.GRAY + "Choose your Particle Effect.");
        ItemStack slime = setName(Material.SLIME_BALL, ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Effect", ChatColor.GRAY + "Choose your Particle Effect.");
        ItemStack heart = setName(Material.APPLE, ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Effect", ChatColor.GRAY + "Choose your Particle Effect.");
        ItemStack cloud = setNameLoreShort(Material.INK_SACK, 15, ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Effect", ChatColor.GRAY + "Choose your Particle Effect.");
        ItemStack note = setName(Material.GOLD_RECORD, ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Effect", ChatColor.GRAY + "Choose your Particle Effect.");
        ItemStack fireworkSpark = setName(Material.FIREWORK, ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Effect", ChatColor.GRAY + "Choose your Particle Effect.");
        ItemStack flame = setName(Material.BLAZE_POWDER, ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Effect", ChatColor.GRAY + "Choose your Particle Effect.");

        ItemStack red = setNameLoreShort(Material.WOOL, 14,ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Colour", ChatColor.GRAY + "Set your Particle Colour.");
        ItemStack orange = setNameLoreShort(Material.WOOL, 1,ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Colour", ChatColor.GRAY + "Set your Particle Colour.");
        ItemStack yellow = setNameLoreShort(Material.WOOL, 4,ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Colour", ChatColor.GRAY + "Set your Particle Colour.");
        ItemStack green = setNameLoreShort(Material.WOOL, 5,ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Colour", ChatColor.GRAY + "Set your Particle Colour.");
        ItemStack darkblue = setNameLoreShort(Material.WOOL, 11,ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Colour", ChatColor.GRAY + "Set your Particle Colour.");
        ItemStack lightblue = setNameLoreShort(Material.WOOL, 3,ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Colour", ChatColor.GRAY + "Set your Particle Colour.");
        ItemStack purple = setNameLoreShort(Material.WOOL, 10,ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Colour", ChatColor.GRAY + "Set your Particle Colour.");
        ItemStack violet = setNameLoreShort(Material.WOOL, 2,ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Colour", ChatColor.GRAY + "Set your Particle Colour.");
        ItemStack pink = setNameLoreShort(Material.WOOL, 6,ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Colour", ChatColor.GRAY + "Set your Particle Colour.");
        ItemStack black = setNameLoreShort(Material.WOOL, 15,ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Colour", ChatColor.GRAY + "Set your Particle Colour.");
        ItemStack darkgrey = setNameLoreShort(Material.WOOL, 7,ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Colour", ChatColor.GRAY + "Set your Particle Colour.");
        ItemStack lightgrey = setNameLoreShort(Material.WOOL, 8,ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Colour", ChatColor.GRAY + "Set your Particle Colour.");
        ItemStack white = setNameLoreShort(Material.WOOL, 0,ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Colour", ChatColor.GRAY + "Set your Particle Colour.");

        ItemStack placeholder = setNameNoLoreShort(Material.STAINED_GLASS_PANE, 15, ChatColor.AQUA + " ");
        ItemStack close = setNameNoLore(Material.BARRIER, ChatColor.RED + "" + ChatColor.BOLD + "Close");

        particleSettings.setItem(0, placeholder);
        particleSettings.setItem(1, placeholder);
        particleSettings.setItem(2, placeholder);
        particleSettings.setItem(3, placeholder);
        particleSettings.setItem(4, placeholder);
        particleSettings.setItem(5, placeholder);
        particleSettings.setItem(6, placeholder);
        particleSettings.setItem(7, placeholder);
        particleSettings.setItem(8, placeholder);
        particleSettings.setItem(9, placeholder);
        particleSettings.setItem(10, placeholder);
        particleSettings.setItem(12, placeholder);
        particleSettings.setItem(14, placeholder);
        particleSettings.setItem(16, placeholder);
        particleSettings.setItem(17, placeholder);
        particleSettings.setItem(18, placeholder);
        particleSettings.setItem(19, placeholder);
        particleSettings.setItem(20, placeholder);
        particleSettings.setItem(21, placeholder);
        particleSettings.setItem(22, placeholder);
        particleSettings.setItem(23, placeholder);
        particleSettings.setItem(24, placeholder);
        particleSettings.setItem(25, placeholder);
        particleSettings.setItem(26, close);

        player.openInventory(particleSettings);

        Main.getMain().getServer().getScheduler().scheduleSyncRepeatingTask(Main.getMain(), new Runnable() {
            public void run() {
                switch(num) {
                    case 1:
                        particleSettings.setItem(11, circle);
                        num++;
                        break;
                    case 2:
                        particleSettings.setItem(11, helix);
                        num = 1;
                        break;
                }
            }
            int num = 1;
        }, 0L, 20);

        Main.getMain().getServer().getScheduler().scheduleSyncRepeatingTask(Main.getMain(), new Runnable() {
            public void run() {
                switch(num) {
                    case 1:
                        particleSettings.setItem(13, colouredDust);
                        num++;
                        break;
                    case 2:
                        particleSettings.setItem(13, flyingGlyph);
                        num++;
                        break;
                    case 3:
                        particleSettings.setItem(13, potionSwirl);
                        num++;
                        break;
                    case 4:
                        particleSettings.setItem(13, spawnerFlames);
                        num++;
                        break;
                    case 5:
                        particleSettings.setItem(13, smoke);
                        num++;
                        break;
                    case 6:
                        particleSettings.setItem(13, happyVillager);
                        num++;
                        break;
                    case 7:
                        particleSettings.setItem(13, snowShovel);
                        num++;
                        break;
                    case 8:
                        particleSettings.setItem(13, crit);
                        num++;
                        break;
                    case 9:
                        particleSettings.setItem(13, waterDrip);
                        num++;
                        break;
                    case 10:
                        particleSettings.setItem(13, lavaDrip);
                        num++;
                        break;
                    case 11:
                        particleSettings.setItem(13, lavaPop);
                        num++;
                        break;
                    case 12:
                        particleSettings.setItem(13, portal);
                        num++;
                        break;
                    case 13:
                        particleSettings.setItem(13, slime);
                        num++;
                        break;
                    case 14:
                        particleSettings.setItem(13, heart);
                        num++;
                        break;
                    case 15:
                        particleSettings.setItem(13, cloud);
                        num++;
                        break;
                    case 16:
                        particleSettings.setItem(13, note);
                        num++;
                        break;
                    case 17:
                        particleSettings.setItem(13, fireworkSpark);
                        num++;
                        break;
                    case 18:
                        particleSettings.setItem(13, flame);
                        num = 1;
                        break;

                }
            }
            int num = 1;
        }, 0L, 20);

        Main.getMain().getServer().getScheduler().scheduleSyncRepeatingTask(Main.getMain(), new Runnable() {
            public void run() {
                switch(num) {
                    case 1:
                        particleSettings.setItem(15, red);
                        num++;
                        break;
                    case 2:
                        particleSettings.setItem(15, orange);
                        num++;
                        break;
                    case 3:
                        particleSettings.setItem(15, yellow);
                        num++;
                        break;
                    case 4:
                        particleSettings.setItem(15, green);
                        num++;
                        break;
                    case 5:
                        particleSettings.setItem(15, darkblue);
                        num++;
                        break;
                    case 6:
                        particleSettings.setItem(15, lightblue);
                        num++;
                        break;
                    case 7:
                        particleSettings.setItem(15, purple);
                        num++;
                        break;
                    case 8:
                        particleSettings.setItem(13, violet);
                        num++;
                        break;
                    case 9:
                        particleSettings.setItem(13, pink);
                        num++;
                        break;
                    case 10:
                        particleSettings.setItem(13, black);
                        num++;
                        break;
                    case 11:
                        particleSettings.setItem(13, darkgrey);
                        num++;
                        break;
                    case 12:
                        particleSettings.setItem(13, lightgrey);
                        num++;
                        break;
                    case 13:
                        particleSettings.setItem(13, white);
                        num = 1;
                        break;
                }
            }
            int num = 1;
        }, 0L, 20);
    }

    public static void openParticleShapeInventory(Player player) {

        Inventory particleShape = Bukkit.getServer().createInventory(null, 27, ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Shapes:");

        ItemStack circle = setName(Material.RECORD_11, ChatColor.AQUA + "" + ChatColor.BOLD + "Circle", ChatColor.GRAY + "Set your Particle Shape to a Circle.");
        ItemStack helix = setName(Material.STRING, ChatColor.AQUA + "" + ChatColor.BOLD + "Helix", ChatColor.GRAY + "Set your Particle Shape to a Helix.");
        ItemStack halo = setName(Material.DOUBLE_PLANT, ChatColor.AQUA + "" + ChatColor.BOLD + "Halo", ChatColor.GRAY + "Set your Particle Shape to a Halo.");

        ItemStack placeholder = setNameNoLoreShort(Material.STAINED_GLASS_PANE, 15, ChatColor.AQUA + " ");
        ItemStack goback = setNameNoLore(Material.BARRIER, ChatColor.RED + "" + ChatColor.BOLD + "Go Back");

        particleShape.setItem(0, placeholder);
        particleShape.setItem(1, placeholder);
        particleShape.setItem(2, placeholder);
        particleShape.setItem(3, placeholder);
        particleShape.setItem(4, placeholder);
        particleShape.setItem(5, placeholder);
        particleShape.setItem(6, placeholder);
        particleShape.setItem(7, placeholder);
        particleShape.setItem(8, placeholder);

        particleShape.setItem(9, placeholder);
        particleShape.setItem(10, placeholder);
        particleShape.setItem(11, circle);
        particleShape.setItem(12, placeholder);
        particleShape.setItem(13, halo);
        particleShape.setItem(14, placeholder);
        particleShape.setItem(15, helix);
        particleShape.setItem(16, placeholder);
        particleShape.setItem(17, placeholder);

        particleShape.setItem(18, placeholder);
        particleShape.setItem(19, placeholder);
        particleShape.setItem(20, placeholder);
        particleShape.setItem(21, placeholder);
        particleShape.setItem(22, placeholder);
        particleShape.setItem(23, placeholder);
        particleShape.setItem(24, placeholder);
        particleShape.setItem(25, placeholder);
        particleShape.setItem(26, goback);

        player.openInventory(particleShape);
    }

    public static void openParticleEffectInventory(Player player) {

        Inventory particleEffect = Bukkit.getServer().createInventory(null, 36, ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Effects:");

        ItemStack colouredDust = setName(Material.MELON_SEEDS, ChatColor.AQUA + "" + ChatColor.BOLD + "Coloured Dust", ChatColor.GRAY + "Set your Particle Effect to Coloured Dust.");
        ItemStack flyingGlyph = setName(Material.BOOK, ChatColor.AQUA + "" + ChatColor.BOLD + "Flying Glyph", ChatColor.GRAY + "Set your Particle Effect to Flying Glyph.");
        ItemStack potionSwirl = setNameLoreShort(Material.POTION, 8258, ChatColor.AQUA + "" + ChatColor.BOLD + "Potion Swirl", ChatColor.GRAY + "Set your Particle Effect to Potion Swirl.");
        ItemStack spawnerFlames = setName(Material.MOB_SPAWNER, ChatColor.AQUA + "" + ChatColor.BOLD + "Spawner Flames", ChatColor.GRAY + "Set your Particle Effect to Spawner Flames.");
        ItemStack smoke = setName(Material.WEB, ChatColor.AQUA + "" + ChatColor.BOLD + "Smoke", ChatColor.GRAY + "Set your Particle Effect to Smoke.");
        ItemStack happyVillager = setName(Material.EMERALD, ChatColor.AQUA + "" + ChatColor.BOLD + "Happy Villager", ChatColor.GRAY + "Set your Particle Effect to Happy Villager.");
        ItemStack snowShovel = setName(Material.SNOW_BALL, ChatColor.AQUA + "" + ChatColor.BOLD + "Snow", ChatColor.GRAY + "Set your Particle Effect to Snow.");
        ItemStack crit = setName(Material.ARROW, ChatColor.AQUA + "" + ChatColor.BOLD + "Crit", ChatColor.GRAY + "Set your Particle Effect to Crit.");
        ItemStack waterDrip = setName(Material.WATER_BUCKET, ChatColor.AQUA + "" + ChatColor.BOLD + "Water Drip", ChatColor.GRAY + "Set your Particle Effect to Water Drip.");
        ItemStack lavaDrip = setName(Material.LAVA_BUCKET, ChatColor.AQUA + "" + ChatColor.BOLD + "Lava Drip", ChatColor.GRAY + "Set your Particle Effect to Lava Drip.");
        ItemStack lavaPop = setName(Material.FIREBALL, ChatColor.AQUA + "" + ChatColor.BOLD + "Lava Pop", ChatColor.GRAY + "Set your Particle Effect to Lava Pop.");
        ItemStack portal = setName(Material.ENDER_PEARL, ChatColor.AQUA + "" + ChatColor.BOLD + "Portal", ChatColor.GRAY + "Set your Particle Effect to Portal.");
        ItemStack slime = setName(Material.SLIME_BALL, ChatColor.AQUA + "" + ChatColor.BOLD + "Slime", ChatColor.GRAY + "Set your Particle Effect to Slime.");
        ItemStack heart = setName(Material.APPLE, ChatColor.AQUA + "" + ChatColor.BOLD + "Heart", ChatColor.GRAY + "Set your Particle Effect to Heart.");
        ItemStack cloud = setNameLoreShort(Material.INK_SACK, 15, ChatColor.AQUA + "" + ChatColor.BOLD + "Cloud", ChatColor.GRAY + "Set your Particle Effect to Cloud.");
        ItemStack note = setName(Material.GOLD_RECORD, ChatColor.AQUA + "" + ChatColor.BOLD + "Note", ChatColor.GRAY + "Set your Particle Effect to Note.");
        ItemStack fireworkSpark = setName(Material.FIREWORK, ChatColor.AQUA + "" + ChatColor.BOLD + "Firework Spark", ChatColor.GRAY + "Set your Particle Effect to Firework Spark.");
        ItemStack flame = setName(Material.BLAZE_POWDER, ChatColor.AQUA + "" + ChatColor.BOLD + "Flame", ChatColor.GRAY + "Set your Particle Effect to Flame.");

        ItemStack placeholder = setNameNoLoreShort(Material.STAINED_GLASS_PANE, 15, ChatColor.AQUA + " ");
        ItemStack goback = setNameNoLore(Material.BARRIER, ChatColor.RED + "" + ChatColor.BOLD + "Go Back");

        particleEffect.setItem(0, placeholder);
        particleEffect.setItem(1, placeholder);
        particleEffect.setItem(2, placeholder);
        particleEffect.setItem(3, placeholder);
        particleEffect.setItem(4, placeholder);
        particleEffect.setItem(5, placeholder);
        particleEffect.setItem(6, placeholder);
        particleEffect.setItem(7, placeholder);
        particleEffect.setItem(8, placeholder);
        particleEffect.setItem(9, colouredDust);
        particleEffect.setItem(10, flyingGlyph);
        particleEffect.setItem(11, potionSwirl);
        particleEffect.setItem(12, spawnerFlames);
        particleEffect.setItem(13, smoke);
        particleEffect.setItem(14, happyVillager);
        particleEffect.setItem(15, snowShovel);
        particleEffect.setItem(16, crit);
        particleEffect.setItem(17, waterDrip);
        particleEffect.setItem(18, lavaDrip);
        particleEffect.setItem(19, lavaPop);
        particleEffect.setItem(20, portal);
        particleEffect.setItem(21, slime);
        particleEffect.setItem(22, heart);
        particleEffect.setItem(23, cloud);
        particleEffect.setItem(24, note);
        particleEffect.setItem(25, fireworkSpark);
        particleEffect.setItem(26, flame);
        particleEffect.setItem(27, placeholder);
        particleEffect.setItem(28, placeholder);
        particleEffect.setItem(29, placeholder);
        particleEffect.setItem(30, placeholder);
        particleEffect.setItem(31, placeholder);
        particleEffect.setItem(32, placeholder);
        particleEffect.setItem(33, placeholder);
        particleEffect.setItem(34, placeholder);
        particleEffect.setItem(35, goback);

        player.openInventory(particleEffect);
    }
    public static void openParticleColourInventory(Player player) {

        Inventory particleColour = Bukkit.getServer().createInventory(null, 36, ChatColor.AQUA + "" + ChatColor.BOLD + "Particle Colours:");

        ItemStack red = setNameLoreShort(Material.WOOL, 14,ChatColor.AQUA + "" + ChatColor.BOLD + "Red", ChatColor.GRAY + "Set your Particle Colour to Red.");
        ItemStack orange = setNameLoreShort(Material.WOOL, 1,ChatColor.AQUA + "" + ChatColor.BOLD + "Orange", ChatColor.GRAY + "Set your Particle Colour to Orange.");
        ItemStack yellow = setNameLoreShort(Material.WOOL, 4,ChatColor.AQUA + "" + ChatColor.BOLD + "Yellow", ChatColor.GRAY + "Set your Particle Colour to Yellow.");
        ItemStack green = setNameLoreShort(Material.WOOL, 5,ChatColor.AQUA + "" + ChatColor.BOLD + "Green", ChatColor.GRAY + "Set your Particle Colour to Green.");
        ItemStack darkblue = setNameLoreShort(Material.WOOL, 11,ChatColor.AQUA + "" + ChatColor.BOLD + "Dark Blue", ChatColor.GRAY + "Set your Particle Colour to Dark Blue.");
        ItemStack lightblue = setNameLoreShort(Material.WOOL, 3,ChatColor.AQUA + "" + ChatColor.BOLD + "Light Blue", ChatColor.GRAY + "Set your Particle Colour to Light Blue.");
        ItemStack purple = setNameLoreShort(Material.WOOL, 10,ChatColor.AQUA + "" + ChatColor.BOLD + "Purple", ChatColor.GRAY + "Set your Particle Colour to Purple.");
        ItemStack violet = setNameLoreShort(Material.WOOL, 2,ChatColor.AQUA + "" + ChatColor.BOLD + "Violet", ChatColor.GRAY + "Set your Particle Colour to Violet.");
        ItemStack pink = setNameLoreShort(Material.WOOL, 6,ChatColor.AQUA + "" + ChatColor.BOLD + "Pink", ChatColor.GRAY + "Set your Particle Colour to Pink.");
        ItemStack black = setNameLoreShort(Material.WOOL, 15,ChatColor.AQUA + "" + ChatColor.BOLD + "Black", ChatColor.GRAY + "Set your Particle Colour to Black.");
        ItemStack darkgrey = setNameLoreShort(Material.WOOL, 7,ChatColor.AQUA + "" + ChatColor.BOLD + "Dark Grey", ChatColor.GRAY + "Set your Particle Colour to Dark Grey.");
        ItemStack lightgrey = setNameLoreShort(Material.WOOL, 8,ChatColor.AQUA + "" + ChatColor.BOLD + "Light Grey", ChatColor.GRAY + "Set your Particle Colour to Light Grey.");
        ItemStack white = setNameLoreShort(Material.WOOL, 0,ChatColor.AQUA + "" + ChatColor.BOLD + "White", ChatColor.GRAY + "Set your Particle Colour to White.");
        ItemStack custom = setName(Material.SIGN, ChatColor.AQUA + "" + ChatColor.BOLD + "Custom RGB Value", ChatColor.GRAY + "Click for more information.");


        ItemStack placeholder = setNameNoLoreShort(Material.STAINED_GLASS_PANE,15, ChatColor.AQUA + " ");
        ItemStack goback = setNameNoLore(Material.BARRIER, ChatColor.RED + "" + ChatColor.BOLD + "Go Back");

        particleColour.setItem(0, placeholder);
        particleColour.setItem(1, placeholder);
        particleColour.setItem(2, placeholder);
        particleColour.setItem(3, placeholder);
        particleColour.setItem(4, placeholder);
        particleColour.setItem(5, placeholder);
        particleColour.setItem(6, placeholder);
        particleColour.setItem(7, placeholder);
        particleColour.setItem(8, placeholder);
        particleColour.setItem(9, red);
        particleColour.setItem(10, orange);
        particleColour.setItem(11, yellow);
        particleColour.setItem(12, green);
        particleColour.setItem(13, darkblue);
        particleColour.setItem(14, lightblue);
        particleColour.setItem(15, purple);
        particleColour.setItem(16, violet);
        particleColour.setItem(17, pink);
        particleColour.setItem(18, black);
        particleColour.setItem(19, darkgrey);
        particleColour.setItem(20, lightgrey);
        particleColour.setItem(21, white);
        particleColour.setItem(22, placeholder);
        particleColour.setItem(23, placeholder);
        particleColour.setItem(24, placeholder);
        particleColour.setItem(25, placeholder);
        particleColour.setItem(26, custom);
        particleColour.setItem(27, placeholder);
        particleColour.setItem(28, placeholder);
        particleColour.setItem(29, placeholder);
        particleColour.setItem(30, placeholder);
        particleColour.setItem(31, placeholder);
        particleColour.setItem(32, placeholder);
        particleColour.setItem(33, placeholder);
        particleColour.setItem(34, placeholder);
        particleColour.setItem(35, goback);

        player.openInventory(particleColour);
    }

    private static ItemStack setName(Material item, String name, String lore) {
        return setName(new ItemStack(item), name, lore);

    }

    private static ItemStack setNameNoLore(Material item, String name) {
        return setNameNoLore(new ItemStack(item), name);

    }

    private static ItemStack setNameNoLoreShort(Material item, int value, String name) {
        return setNameNoLoreShort(new ItemStack(item, 1, (short) value), name);
    }

    private static ItemStack setNameLoreShort(Material item, int value, String name, String lore) {
        return setNameLoreShort(new ItemStack(item, 1, (short) value), name, lore);
    }

    private static ItemStack setName(ItemStack item, String name, String lore) {
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> ilore = new ArrayList<>();
        ilore.add(lore);
        meta.setLore(ilore);
        meta.setDisplayName(name);
        item.setItemMeta(meta);
        return item;
    }

    private static ItemStack setNameNoLore(ItemStack item, String name) {
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        item.setItemMeta(meta);
        return item;
    }

    private static ItemStack setNameNoLoreShort(ItemStack item, String name) {
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        item.setItemMeta(meta);
        return item;
    }

    private static ItemStack setNameLoreShort(ItemStack item, String name, String lore) {
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> ilore = new ArrayList<>();
        ilore.add(lore);
        meta.setLore(ilore);
        meta.setDisplayName(name);
        item.setItemMeta(meta);
        return item;
    }
}