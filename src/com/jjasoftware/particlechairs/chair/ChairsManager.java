package com.jjasoftware.particlechairs.chair;

import com.jjasoftware.particlechairs.main.Main;
import org.bukkit.Location;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Player;

public class ChairsManager {

    private BlockState state;
    private Player player;
    private Location location;

    public ChairsManager(BlockState state, Player p, Location location) {
        this.state = state;
        this.player = player;
        this.location = location;
    }

    public static boolean beingUsed(BlockState state) {
        for (ChairsManager cm : Main.list.values()) {
            if (cm.getState().equals(state))
                return true;
        }
        return false;
    }

    public static boolean isSitting(Player player) {
        for (ChairsManager cm : Main.list.values()) {
            if(cm.getPlayer() != null) {
                if (cm.getPlayer().equals(player)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public BlockState getState() {
        return this.state;
    }
    public Player getPlayer() {
        return this.player;
    }
    public Location getLocation() {
        return this.location;
    }
}
