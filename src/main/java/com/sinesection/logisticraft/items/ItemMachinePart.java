package com.sinesection.logisticraft.items;

import com.sinesection.logisticraft.types.EnumMachinePartType;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ItemMachinePart extends ModItemTyped {
    public ItemMachinePart(EnumMachinePartType type) {
        super(type, "machine_part");
        this.setMaxDamage(type.getDamage());
    }

    @Override
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this,0,new ModelResourceLocation(getRegistryName(), null));
    }
}
