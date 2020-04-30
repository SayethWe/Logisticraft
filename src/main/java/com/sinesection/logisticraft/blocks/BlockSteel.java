package com.sinesection.logisticraft.blocks;

import com.sinesection.logisticraft.items.ItemSteelIngot;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockSteel extends ModBlock{

    public BlockSteel() {
        super(Material.IRON, "steel_block");
    }

    @Override
    public void initModel() {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this),0,new ModelResourceLocation(getRegistryName(), ItemSteelIngot.EnumSteelType.getVariantByValue(0)));
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this),1,new ModelResourceLocation(getRegistryName(), ItemSteelIngot.EnumSteelType.getVariantByValue(1)));
    }
}
