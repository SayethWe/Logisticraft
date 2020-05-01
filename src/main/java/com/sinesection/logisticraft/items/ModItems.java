package com.sinesection.logisticraft.items;

import com.sinesection.logisticraft.types.EnumMachinePartType;
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
    @GameRegistry.ObjectHolder("logisticraft:roller_machine_part")
    public static ItemMachinePart rollerPart;
    @GameRegistry.ObjectHolder("logisticraft:piston_machine_part")
    public static ItemMachinePart pistonPart;
    @GameRegistry.ObjectHolder("logisticraft:heater_machine_part")
    public static ItemMachinePart heaterPart;

    public static void registerAll(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemCarbonPaste());
        event.getRegistry().register(new ItemHardeningCapsule());
        event.getRegistry().register(new ItemSteelIngot(EnumSteelType.CASE_HARDENED));
        event.getRegistry().register(new ItemSteelIngot(EnumSteelType.FULL));
        event.getRegistry().register(new ItemMachinePart(EnumMachinePartType.ROLLER));
        event.getRegistry().register(new ItemMachinePart(EnumMachinePartType.HEATER));
        event.getRegistry().register(new ItemMachinePart(EnumMachinePartType.PISTON));
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        carbonPaste.initModel();
        hardeningCapsule.initModel();
        caseHardened.initModel();
        steelIngot.initModel();
        rollerPart.initModel();
        heaterPart.initModel();
        pistonPart.initModel();
    }
}
