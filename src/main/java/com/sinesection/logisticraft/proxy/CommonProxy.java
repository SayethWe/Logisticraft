package com.sinesection.logisticraft.proxy;

import com.sinesection.logisticraft.blocks.BlockMachine;
import com.sinesection.logisticraft.blocks.ModBlocks;
import com.sinesection.logisticraft.items.ItemCarbonPaste;
import com.sinesection.logisticraft.items.ItemHardeningCapsule;
import com.sinesection.logisticraft.items.ItemSteelIngot;
import com.sinesection.logisticraft.items.ModItems;
import com.sinesection.logisticraft.recipes.ModRecipes;
import com.sinesection.logisticraft.tileEntities.ModTileEntities;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {

    }

    public void init(FMLInitializationEvent e) {
        ModRecipes.init();
    }

    public void postInit(FMLPostInitializationEvent e) {

    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        ModBlocks.registerAll(event);
        ModTileEntities.registerAll();
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        ModItems.registerAll(event);
        ModBlocks.registerAllItems(event);
    }
}
