package com.sinesection.logisticraft.items;

import com.sinesection.logisticraft.types.EnumSteelType;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class ItemSteelIngot extends ModItem {
    private final EnumSteelType type;

    public ItemSteelIngot(EnumSteelType inType) {
        super((inType != EnumSteelType.FULL ? inType + "_" : "")+ "steel_ingot");
        setHasSubtypes(true);
        type = inType;
        //if(inType==EnumSteelType.FULL) OreDictionary.registerOre("ingotSteel",this);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this,0,new ModelResourceLocation(getRegistryName(), null));
    }
}