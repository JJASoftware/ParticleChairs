package com.jjasoftware.particlechairs.chair;

import com.jjasoftware.particlechairs.main.Main;
import net.minecraft.server.v1_8_R3.EntityArmorStand;
import net.minecraft.server.v1_8_R3.EntityHuman;
import net.minecraft.server.v1_8_R3.NBTTagCompound;
import net.minecraft.server.v1_8_R3.World;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftLivingEntity;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class CustomArmorStand extends EntityArmorStand {

    private boolean protect = true;

    public CustomArmorStand(World world) {
        super(world);
    }

    public static ArmorStand spawn(Location location, Player player) {
        World world = ((CraftWorld) location.getWorld()).getHandle();

        CustomArmorStand armorStand = new CustomArmorStand(world);
        armorStand.setLocation(location.getX(), location.getY(), location.getZ(), location.getYaw(), location.getPitch());

        ((CraftLivingEntity) armorStand.getBukkitEntity()).setRemoveWhenFarAway(false);

        world.addEntity(armorStand, CreatureSpawnEvent.SpawnReason.CUSTOM);

        NBTTagCompound nbt = new NBTTagCompound();
        armorStand.e(nbt);
        nbt.setBoolean("Invulnerable", true);
        armorStand.f(nbt);
        armorStand.b(nbt);
        nbt.setBoolean("Invisible", true);
        nbt.setBoolean("NoGravity", true);
        nbt.setInt("DisabledSlots", 2031616);
        armorStand.a(nbt);
        armorStand.getBukkitEntity().setPassenger(player);

        return (ArmorStand) armorStand.getBukkitEntity();
    }

    public void g(float f, float f1) {
        if (shouldDie(this)) return;
        if (this.passenger != null && this.passenger instanceof EntityHuman) {
            this.lastYaw = this.yaw = this.passenger.yaw;
            this.pitch = this.passenger.pitch * 0.5F;
            this.setYawPitch(this.yaw, this.pitch);
            this.aK = this.aI = this.yaw;
        }
    }

    public void die() {
        if (!protect)
            dead = true;
    }

    public void killArmorStand() {
        protect = false;
        dead = true;
    }

    private boolean shouldDie(CustomArmorStand armorStand) {
        if (armorStand.passenger == null || !(armorStand.passenger instanceof EntityHuman)) {
            if (Main.list.containsKey(armorStand.getId())) {
                ChairsManager chairsManager = Main.list.get(armorStand.getId());
                Player player = chairsManager.getPlayer();
                if (player != null) {
                    player.teleport(chairsManager.getLocation());
                }
                Main.list.remove(armorStand.getId());
            }
            protect = false;
            armorStand.die();
            return true;
        }
        return false;
    }
}
