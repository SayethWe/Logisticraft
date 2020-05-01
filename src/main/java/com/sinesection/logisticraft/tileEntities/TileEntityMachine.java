package com.sinesection.logisticraft.tileEntities;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

public class TileEntityMachine extends TileEntity {

    private int clicks = 0;

    public static String getRegistryName() {
        return "machine";
    }

    public String clicked(float hitX, float hitY, float hitZ) {
        clicks++;
        return String.format("Clicked %d time(s) at: %.2f, %.2f, %.2f", clicks, hitX, hitY, hitZ);
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        clicks=compound.getInteger("clicks");
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setInteger("clicks",clicks);
        return compound;
    }
}
