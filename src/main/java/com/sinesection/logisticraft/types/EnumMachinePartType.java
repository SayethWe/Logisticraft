package com.sinesection.logisticraft.types;

public enum EnumMachinePartType {
    ROLLER("roller",100),
    HEATER("heater",100),
    PISTON("piston",100);

    private final String name;
    private final int damage;
    EnumMachinePartType(String name, int damage){
        this.name=name;
        this.damage=damage;
    }

    @Override
    public String toString() {
        return name;
    }

    public int getDamage() {
        return damage;
    }
}
