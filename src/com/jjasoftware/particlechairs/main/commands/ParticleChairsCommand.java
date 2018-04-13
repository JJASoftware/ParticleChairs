package com.jjasoftware.particlechairs.main.commands;

import com.jjasoftware.particlechairs.main.util.Utils;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ParticleChairsCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "You must be a player to use this command!");
        }
        Player player = (Player) sender;
        if(commandLabel.equalsIgnoreCase("particlechairs") || commandLabel.equalsIgnoreCase("pc")) {
            Utils.openParticleInventory(player);
        }
        return true;
    }
}
