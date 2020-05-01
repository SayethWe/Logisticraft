package com.sinesection.logisticraft.blocks;

import com.sinesection.logisticraft.Logisticraft;
import com.sinesection.logisticraft.tileEntities.TileEntityMachine;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentBase;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.Level;

import javax.annotation.Nullable;
import java.awt.*;

public class BlockMachine extends ModBlock implements ITileEntityProvider {

    public BlockMachine() {
        super(Material.IRON,"machine_casing");
    }

    @Override
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0,
                new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if(!worldIn.isRemote) {
            TileEntityMachine tem = getTE(worldIn, pos);
            if(tem==null) {
                Logisticraft.logger.log(Level.DEBUG, "Null TE");
                return false;
            }
            String out = tem.clicked(hitX, hitY, hitZ);
            TextComponentString t = new TextComponentString(out);
            t.getStyle().setColor(TextFormatting.DARK_AQUA);
            playerIn.sendStatusMessage(t, false);
        }
        return true;
    }

    private TileEntityMachine getTE(World world, BlockPos pos) {
        return (TileEntityMachine) world.getTileEntity(pos);
    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityMachine();
    }
}
