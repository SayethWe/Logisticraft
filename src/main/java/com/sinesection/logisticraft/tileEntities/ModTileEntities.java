package com.sinesection.logisticraft.tileEntities;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTileEntities {

    public static void registerAll() {
        GameRegistry.registerTileEntity(TileEntityMachine.class, new ResourceLocation(TileEntityMachine.getRegistryName()));
    }
}