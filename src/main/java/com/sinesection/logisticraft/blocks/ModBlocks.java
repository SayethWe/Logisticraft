package com.sinesection.logisticraft.blocks;

import com.sinesection.logisticraft.types.EnumSteelType;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

    @GameRegistry.ObjectHolder("logisticraft:machine_casing")
    public static BlockMachine machineCasing;
    @GameRegistry.ObjectHolder("logisticraft:ch_steel_block")
    public static BlockSteel caseHardenedSteelBlock;
    @GameRegistry.ObjectHolder("logisticraft:steel_block")
    public static BlockSteel steelBlock;

    @SideOnly(Side.CLIENT)
    public static void initModels(){
        machineCasing.initModel();

        caseHardenedSteelBlock.initModel();
        steelBlock.initModel();
    }

    public static void registerAll(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new BlockMachine());

        event.getRegistry().register(new BlockSteel(EnumSteelType.CASE_HARDENED));
        event.getRegistry().register(new BlockSteel(EnumSteelType.FULL));
    }

    public static void registerAllItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(machineCasing).setRegistryName(machineCasing.getRegistryName()));

        event.getRegistry().register(new ItemBlock(caseHardenedSteelBlock).setHasSubtypes(true).setRegistryName(caseHardenedSteelBlock.getRegistryName()));
        event.getRegistry().register(new ItemBlock(steelBlock).setHasSubtypes(true).setRegistryName(steelBlock.getRegistryName()));
    }
}
