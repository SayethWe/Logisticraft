package com.sinesection.logisticraft.items;

import com.sinesection.logisticraft.Logisticraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemHardeningCapsule extends ModItem {
    public ItemHardeningCapsule() {
        super("hardening_capsule");
        setHasSubtypes(true);
    }

    @Override
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this,0,new ModelResourceLocation(getRegistryName(), "raw"));
        ModelLoader.setCustomModelResourceLocation(this,1,new ModelResourceLocation(getRegistryName()+"_medium","medium"));
        ModelLoader.setCustomModelResourceLocation(this,2,new ModelResourceLocation(getRegistryName()+"_dark","dark"));
    }
}
