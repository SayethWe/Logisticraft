package com.sinesection.logisticraft.items;

import com.sinesection.logisticraft.Logisticraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemHardeningCapsule extends Item {
    public ItemHardeningCapsule() {
        setRegistryName("hardening_capsule");
        setUnlocalizedName(Logisticraft.MODID+".hardening_capsule");
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this,0,new ModelResourceLocation(getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(this,1,new ModelResourceLocation(getRegistryName()+"_light","inventory"));
        }
}
