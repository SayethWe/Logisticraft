package com.sinesection.logisticraft.proxy;

import com.sinesection.logisticraft.tileEntities.ModTileEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import javax.annotation.Nullable;

public class InterfaceProxy implements IGuiHandler {

    @Nullable
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x,y,z);
        ModTileEntity tileEntity;
        try {
            tileEntity = (ModTileEntity) world.getTileEntity(pos);
        } catch (ClassCastException e) {
            return null;
        }
        return tileEntity.getContainer(player);
    }

    @Nullable
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        BlockPos pos = new BlockPos(x,y,z);
        ModTileEntity tileEntity;
        try {
            tileEntity = (ModTileEntity) world.getTileEntity(pos);
        } catch (ClassCastException e) {
            return null;
        }
        return tileEntity.getInterface(player);
    }
}
