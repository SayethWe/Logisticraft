package com.sinesection.logisticraft.tileEntities;

import com.sinesection.logisticraft.container.ContainerMachine;
import com.sinesection.logisticraft.gui.InterfaceMachine;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.ItemStackHandler;

import javax.annotation.Nullable;

public class TileEntityMachine extends ModTileEntity {

    public static final int SIZE=4;

    private ItemStackHandler itemStackHandler = new ItemStackHandler(SIZE){
        @Override
        protected void onContentsChanged(int slot) {
            TileEntityMachine.this.markDirty();
        }
    };

    public static String getRegistryName() {
        return "machine";
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        super.readFromNBT(compound);
        if (compound.hasKey("items")) itemStackHandler.deserializeNBT((NBTTagCompound) compound.getTag("items"));
    }

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setTag("items",itemStackHandler.serializeNBT());
        return compound;
    }

    public boolean canInteractWith(EntityPlayer playerIn) {
        return !isInvalid() && playerIn.getDistanceSq(pos)<=64;
    }

    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
        if (capability== CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) return true;
        return super.hasCapability(capability, facing);
    }

    @Nullable
    @Override
    public <T> T getCapability(Capability<T> capability, @Nullable EnumFacing facing) {
        if (capability==CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) return CapabilityItemHandler.ITEM_HANDLER_CAPABILITY.cast(itemStackHandler);
        return super.getCapability(capability, facing);
    }

    @Override
    public GuiContainer getInterface(EntityPlayer player) {
        return new InterfaceMachine(this, new ContainerMachine(player.inventory, this));
    }

    @Override
    public Container getContainer(EntityPlayer player) {
        return new ContainerMachine(player.inventory, this);
    }
}
