package com.sinesection.logisticraft.gui;

import com.sinesection.logisticraft.Logisticraft;
import com.sinesection.logisticraft.proxy.InterfaceProxy;
import net.minecraftforge.fml.common.network.NetworkRegistry;

import java.nio.channels.NetworkChannel;

public class ModInterfaces {
    public static void registerAll() {
        NetworkRegistry.INSTANCE.registerGuiHandler(Logisticraft.instance, new InterfaceProxy());
    }
}
