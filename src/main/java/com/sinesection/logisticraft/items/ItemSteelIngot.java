package com.sinesection.logisticraft.items;

import com.sinesection.logisticraft.Logisticraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemSteelIngot extends ModItem
{
    private enum EnumSteelType{
        CASE(0,"case"),
        FULL(1,"full");

        private final int value;
        private final String variant;

        EnumSteelType(int value, String variant){
            this.value=value;
            this.variant=variant;
        }
        public int getValue() {return value;}
        public String getVariant() {return variant;}
        static String getVariantByValue(int value) {
            for (EnumSteelType t:EnumSteelType.values()) {
                if (t.getValue()==value) return t.getVariant();
            }
            return null;
        }
    }
    public ItemSteelIngot() {
        super("steel_ingot");
        setHasSubtypes(true);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this,0,new ModelResourceLocation(getRegistryName()+"_"+EnumSteelType.getVariantByValue(0),EnumSteelType.getVariantByValue(0)));
        ModelLoader.setCustomModelResourceLocation(this,1,new ModelResourceLocation(getRegistryName()+"_"+EnumSteelType.getVariantByValue(1),EnumSteelType.getVariantByValue(1)));
    }
}
