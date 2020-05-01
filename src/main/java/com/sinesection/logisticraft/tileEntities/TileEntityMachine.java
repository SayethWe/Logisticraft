package com.sinesection.logisticraft.tileEntities;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;

public class TileEntityMachine extends TileEntity {

    private int clicks = 0;

    public static String getRegistryName() {
        return "machine";
    }

    public String clicked() {
        return "Hi" + clicks;
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
