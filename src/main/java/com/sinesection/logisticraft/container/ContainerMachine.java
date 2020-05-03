package com.sinesection.logisticraft.container;

import com.sinesection.logisticraft.tileEntities.TileEntityMachine;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ContainerMachine extends Container {

    private final TileEntityMachine tileEnt;

    public ContainerMachine(IInventory playerInventory, TileEntityMachine tileEnt) {
        this.tileEnt=tileEnt;
        addOwnSlots();
        addPlayerSlots(playerInventory);
    }

    private void addOwnSlots() {
        IItemHandler itemHandler = this.tileEnt.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
        addSlotToContainer(new SlotItemHandler(itemHandler, 0, 58, 48));
        addSlotToContainer(new SlotItemHandler(itemHandler, 1, 121, 24));
        addSlotToContainer(new SlotItemHandler(itemHandler, 2, 98, 71));
        addSlotToContainer(new SlotItemHandler(itemHandler, 3, 153, 48));
    }
    private void addPlayerSlots(IInventory playerInventory) {
        // Slots for the main inventory
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 9; col++) {
                int x = 10 + col * 18;
                int y = row * 18 + 113;
                this.addSlotToContainer(new Slot(playerInventory, col + row * 9 + 10, x, y));
            }
        }

        // Slots for the hotbar
        for (int col = 0; col < 9; col++) {
            int x = 10 + col * 18;
            int y = 188;
            this.addSlotToContainer(new Slot(playerInventory, col, x, y));
        }
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.inventorySlots.get(index);

        if (slot != null && slot.getHasStack()) {
            ItemStack itemstack1 = slot.getStack();
            itemstack = itemstack1.copy();

            if (index < TileEntityMachine.SIZE) {
                if (!this.mergeItemStack(itemstack1, TileEntityMachine.SIZE, this.inventorySlots.size(), true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.mergeItemStack(itemstack1, 0, TileEntityMachine.SIZE, false)) {
                return ItemStack.EMPTY;
            }

            if (itemstack1.isEmpty()) {
                slot.putStack(ItemStack.EMPTY);
            } else {
                slot.onSlotChanged();
            }
        }

        return itemstack;
    }

    @Override
    public boolean canInteractWith(EntityPlayer playerIn) {
        return tileEnt.canInteractWith(playerIn);
    }
}
