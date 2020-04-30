package com.sinesection.logisticraft.blocks;

import com.sinesection.logisticraft.Logisticraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockMachine extends ModBlock {

    public BlockMachine() {
        super(Material.IRON);
        setRegistryName("machine_casing");
        setUnlocalizedName(Logisticraft.MODID+".machine_casing");
    }

    @Override
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this),0,new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
