package com.sinesection.logisticraft.recipes.client.model;

import com.sinesection.logisticraft.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import java.util.HashSet;
import java.util.Set;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ModModelManager {
    public static final ModModelManager INSTANCE = new ModModelManager();

    private final Set<Item> itemsRegistered = new HashSet<>();

    private ModModelManager() {
    }

    @SubscribeEvent
    public static void registerAllModels(final ModelRegistryEvent event) {
        INSTANCE.registerBlockModels();
        INSTANCE.registerItemModels();
    }

    private final StateMapperBase propertyStringMapper = new StateMapperBase() {
        @Override
        protected ModelResourceLocation getModelResourceLocation(final IBlockState state) {
            return new ModelResourceLocation("minecraft:air");
        }
    };

    private void registerBlockModels() {
        registerBlockItemModel(ModBlocks.machineCasing.getDefaultState());
    }

    /**
     * Register a single model for the {@link Block}'s {@link Item}.
     * <p>
     * Uses the registry name as the domain/path and the {@link IBlockState} as the variant.
     *
     * @param state The state to use as the variant
     */
    private void registerBlockItemModel(final IBlockState state) {
        final Block block = state.getBlock();
        final Item item = Item.getItemFromBlock(block);

        if (item != Items.AIR) {
            registerItemModel(item, new ModelResourceLocation(block.getRegistryName(), propertyStringMapper.getPropertyString(state.getProperties())));
        }
    }

    /**
     * Register this mod's {@link Item} models.
     */
    private void registerItemModels() {

    }

    private void registerItemModel(final Item item) {
        registerItemModel(item, item.getRegistryName().toString());
    }

    private void registerItemModel(final Item item, final String modelLocation) {
        final ModelResourceLocation fullModelLocation = new ModelResourceLocation(modelLocation, "inventory");
        registerItemModel(item, fullModelLocation);
    }

    private void registerItemModel(final Item item, final ModelResourceLocation fullModelLocation) {
        ModelBakery.registerItemVariants(item, fullModelLocation); // Ensure the custom model is loaded and prevent the default model from being loaded
        registerItemModel(item, MeshDefinitionFix.create(stack -> fullModelLocation));
    }

    private void registerItemModel(final Item item, final ItemMeshDefinition meshDefinition) {
        itemsRegistered.add(item);
        ModelLoader.setCustomMeshDefinition(item, meshDefinition);
    }
}
