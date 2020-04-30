package com.sinesection.logisticraft.blocks;

import com.sinesection.logisticraft.items.ItemCarbonPaste;
import com.sinesection.logisticraft.items.ItemHardeningCapsule;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

    @GameRegistry.ObjectHolder("logisticraft:machine_casing")
    public static BlockMachine machineCasing;
    @GameRegistry.ObjectHolder("logisticraft:steel_block")
    public static BlockSteel steelBlock;

    @SideOnly(Side.CLIENT)
    public static void initModels(){
        machineCasing.initModel();
        steelBlock.initModel();
    }

    public static void registerAll(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new BlockMachine());
        event.getRegistry().register(new BlockSteel());
    }

    public static void registerAllItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(machineCasing).setRegistryName(machineCasing.getRegistryName()));
        event.getRegistry().register(new ItemBlock(steelBlock).setHasSubtypes(true).setRegistryName(steelBlock.getRegistryName()));
    }
}
