package com.jjasoftware.particlechairs.chair;

import org.bukkit.Material;

public enum Blocks {

    ACACIA("acacia_stairs"),
    BIRCH_WOOD("birch_wood_stairs"),
    DARK_OAK("dark_oak_stairs"),
    JUNGLE_WOOD("jungle_wood_stairs"),
    SPRUCE_WOOD("spruce_wood_stairs"),
    WOOD("wood_stairs");

    private final String name;

    Blocks(String name) {
        this.name = name;
    }

    public static String from(Material stair) {
        for (Blocks stairs : Blocks.values()) {
            if (stairs.getName().equalsIgnoreCase(stair.name())) {
                return stairs.getName();
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }
}