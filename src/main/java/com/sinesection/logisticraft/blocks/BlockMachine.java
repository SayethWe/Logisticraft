package com.sinesection.logisticraft.blocks;

import com.sinesection.logisticraft.Logisticraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockMachine extends ModBlock {

    public BlockMachine() {
        super(Material.IRON);
        setRegistryName("machine_casing");
        setUnlocalizedName(Logisticraft.MODID+".machine_casing");
    }
}
