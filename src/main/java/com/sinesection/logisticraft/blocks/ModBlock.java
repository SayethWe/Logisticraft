package com.sinesection.logisticraft.blocks;

import com.sinesection.logisticraft.Logisticraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public abstract class ModBlock extends Block {

    public ModBlock(Material materialIn, String name) {
        super(materialIn);

        setRegistryName(name);
        setUnlocalizedName(Logisticraft.MODID+"."+name);
    }

    @SideOnly(Side.CLIENT)
    public abstract void initModel();
}
