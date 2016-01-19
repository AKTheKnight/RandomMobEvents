package com.aktheknight.randommobevents;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.entity.EntityList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=RandomMobEvents.MODID, name=RandomMobEvents.MODNAME, version=RandomMobEvents.VERSION)

public class RandomMobEvents {
	public static final String MODID = "RandomMobEvents";
	public static final String MODNAME = "RandomMobEvents";
	public static final String VERSION = "1.8.9-1.0.0";
	
	
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	Events handler = new Events();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		LOGGER.log(Level.INFO, EntityList.getEntityNameList());
		LOGGER.log(Level.INFO, "Loading/creating config file");
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		System.out.println(event.getSuggestedConfigurationFile());
		LOGGER.log(Level.INFO, "Registering event handlers");
		MinecraftForge.EVENT_BUS.register(handler);
	}
	
}
