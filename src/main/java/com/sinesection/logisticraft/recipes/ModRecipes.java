package com.sinesection.logisticraft.recipes;

import com.sinesection.logisticraft.items.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
    public static void init() {
        GameRegistry.addSmelting(new ItemStack(ModItems.hardeningCapsule,1,0),new ItemStack(ModItems.hardeningCapsule, 1, 1),0.2f);
        //temp recipe. replace with a custom higher-temp furnace later.
        GameRegistry.addSmelting(new ItemStack(ModItems.hardeningCapsule, 1, 1), new ItemStack(ModItems.hardeningCapsule, 1,2), 0.4f);
    }
}
