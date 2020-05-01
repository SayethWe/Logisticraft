package com.sinesection.logisticraft.types;

public enum EnumSteelType {
    CASE_HARDENED("ch"),
    FULL("full");

    private final String name;
    EnumSteelType(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return name;
    }
}
