package com.sinesection.logisticraft.items;

import com.sinesection.logisticraft.types.EnumSteelType;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

    @GameRegistry.ObjectHolder("logisticraft:carbon_paste")
    public static ItemCarbonPaste carbonPaste;
    @GameRegistry.ObjectHolder("logisticraft:hardening_capsule")
    public static ItemHardeningCapsule hardeningCapsule;
    @GameRegistry.ObjectHolder("logisticraft:ch_steel_ingot")
    public static ItemSteelIngot caseHardened;
    @GameRegistry.ObjectHolder("logisticraft:steel_ingot")
    public static ItemSteelIngot steelIngot;

    public static void registerAll(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemCarbonPaste());
        event.getRegistry().register(new ItemHardeningCapsule());
        event.getRegistry().register(new ItemSteelIngot(EnumSteelType.CASE_HARDENED));
        event.getRegistry().register(new ItemSteelIngot(EnumSteelType.FULL));
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        carbonPaste.initModel();
        hardeningCapsule.initModel();
        caseHardened.initModel();
        steelIngot.initModel();
    }
}
