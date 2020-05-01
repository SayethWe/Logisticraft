package com.sinesection.logisticraft.items;

public abstract class ModItemTyped extends ModItem {
    private final Enum<?extends Enum<?>> type;

    public ModItemTyped(Enum<? extends Enum<?>> type, String name) {
        super(type.toString()+"_"+name);
        this.type=type;
        setHasSubtypes(true);
    }
}
