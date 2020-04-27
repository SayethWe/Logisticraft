package com.sinesection.logisticraft.items;

import com.sinesection.logisticraft.Logisticraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemCarbonPaste extends Item {

    public ItemCarbonPaste() {
        setRegistryName("carbon_paste");
        setUnlocalizedName(Logisticraft.MODID+".carbon_paste");
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this,0,new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
