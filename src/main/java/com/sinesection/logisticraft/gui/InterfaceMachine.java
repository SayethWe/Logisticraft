package com.sinesection.logisticraft.gui;

import com.sinesection.logisticraft.Logisticraft;
import com.sinesection.logisticraft.container.ContainerMachine;
import com.sinesection.logisticraft.tileEntities.TileEntityMachine;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.util.ResourceLocation;

public class InterfaceMachine extends GuiContainer {
    private static final int WIDTH=176;
    private static final int HEIGHT=166;



    private static final ResourceLocation BACKGROUND = new ResourceLocation(Logisticraft.MODID, "textures/gui/interface_machine.png");

    public InterfaceMachine(TileEntityMachine tileEnt, ContainerMachine cont) {
        super(cont);
        xSize=WIDTH;
        ySize=HEIGHT;
    }
    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        mc.getTextureManager().bindTexture(BACKGROUND);
        drawTexturedModalRect(guiLeft,guiTop,0,0,xSize,ySize);
    }
}
