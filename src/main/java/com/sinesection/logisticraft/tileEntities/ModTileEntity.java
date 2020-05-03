package com.sinesection.logisticraft.tileEntities;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.fml.common.network.IGuiHandler;

public abstract class ModTileEntity extends TileEntity {
    public abstract GuiContainer getInterface(EntityPlayer player);
    public abstract Container getContainer(EntityPlayer player);
}
