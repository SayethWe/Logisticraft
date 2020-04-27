package com.sinesection.logisticraft.items;

import com.sinesection.logisticraft.Logisticraft;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class ModItem extends Item {
    public ModItem(String name){
        setRegistryName(name);
        setUnlocalizedName(Logisticraft.MODID+"."+name);
    }

    @SideOnly(Side.CLIENT)
    public abstract void initModel();
}
