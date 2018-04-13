package com.jjasoftware.particlechairs.chair.nms;

import com.jjasoftware.particlechairs.chair.CustomArmorStand;
import net.minecraft.server.v1_8_R3.EntityArmorStand;
import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftArmorStand;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;

public class v1_8_R3 implements NMS{

    public String getVersion() {
        return "v1_8_R3";
    }

    public ArmorStand spawn(Location location, Player player) {
        return CustomArmorStand.spawn(location, player);
    }

    public void kill(ArmorStand armorStand) {
        EntityArmorStand nmsArmor = ((CraftArmorStand) armorStand).getHandle();
        ((CustomArmorStand) nmsArmor).killArmorStand();
    }

    public void sendUpdate(Player p) {
        IChatBaseComponent msg = IChatBaseComponent.ChatSerializer.a("[\"\",{\"text\":\"[UPDATE]\",\"color\":\"aqua\",\"bold\":true,\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://www.spigotmc.org/resources/18705/\"},\"hoverEvent\":{\"action\":\"show_text\",\"value\":{\"text\":\"\",\"extra\":[{\"text\":\"Click for go on the plugin page\",\"color\":\"green\"}]}}}]");
        PacketPlayOutChat packet = new PacketPlayOutChat(msg, (byte) 0);
        ((CraftPlayer) p).getHandle().playerConnection.sendPacket(packet);
    }

    public boolean check(ArmorStand armorStand) {
        return ((CraftArmorStand) armorStand).getHandle() instanceof CustomArmorStand;
    }

}
