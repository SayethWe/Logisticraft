package com.sinesection.logisticraft;

import com.sinesection.logisticraft.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid=Logisticraft.MODID, name = Logisticraft.MODNAME, version = Logisticraft.VERSION, dependencies = "required-after:forge@[11.16.0.1865,)", useMetadata=true)
public class Logisticraft {

    public static final String MODID = "logisticraft";
    public static final String MODNAME = "Logisticraft";
    public static final String VERSION = "0.1";

    @SidedProxy(clientSide="com.sinesection.logisticraft.proxy.ClientProxy", serverSide = "com.sinesection.logisticraft.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static Logisticraft instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }

}
