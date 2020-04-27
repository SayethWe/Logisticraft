package com.sinesection.logisticraft.items;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

    @GameRegistry.ObjectHolder("logisticraft:carbon_paste")
    public static ItemCarbonPaste carbonPaste;
    @GameRegistry.ObjectHolder("logisticraft:hardening_capsule")
    public static ItemHardeningCapsule hardeningCapsule;
    @GameRegistry.ObjectHolder("logisticraft:steel_ingot")
    public static ItemSteelIngot steelIngot;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        carbonPaste.initModel();
        hardeningCapsule.initModel();
        steelIngot.initModel();
    }
}
