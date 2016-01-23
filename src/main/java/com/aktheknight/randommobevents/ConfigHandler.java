package com.aktheknight.randommobevents;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
	
	public static Configuration config;
	static String category;
	
//	static ArrayList<String> categoryOrder = new ArrayList<String>(Arrays.asList("Creeper", "Spider", "Zombie", "Skeleton", "CaveSpider", "Enderman", "Witch", "Blaze"));
	static ArrayList<String> configOrder = new ArrayList<String>(Arrays.asList("PotionEffects", "PotionChance", "Blindness", "Confusion", "Slowness(Digging)", "Damage", "Hunger", "Slowness(Moving)", "Poison", "Weakness", "Wither"));
	
	public static void init(File configFile) {
		config = new Configuration(configFile);
		loadConfig();
		
	}
	    
	private static void loadConfig() {
//		loadGeneralSettings();
		loadCreeperSettings();
		loadSpiderSettings();
		loadZombieSettings();
		loadSkeletonSettings();
		loadCaveSpiderSettings();
		loadEndermanSettings();
		loadWitchSettings();
		loadBlazeSettings();
		if (config.hasChanged()) {
			config.save();
		}
	}
	
	private static void loadCreeperSettings() {
		ArrayList<String> catOrder = configOrder;
		
		catOrder.add(0, "InstantExplosion");
		catOrder.add(1, "ExplodeChance");
		
		category = "Creeper";
		config.setCategoryPropertyOrder(category, catOrder);
		Vars.creeperExplode = config.getBoolean("InstantExplosion", category, true, "Do you want to enable creepers instantly exploding?");
		Vars.creeperExplodeChance = config.getInt("ExplodeChance", category, 5, 1, 20, "1 over the value you choose is the chance of it happening.");
		
		Vars.creeperPotions= config.getBoolean("PotionEffects", category, true, "Do you want to enable potion effects when hitting a creeper?");
		Vars.creeperPotionChance = config.getInt("PotionChance", category, 5, 1, 20, "1 over the value you choose is the chance of it happening.");
		
		Vars.creeperBlind = config.getInt("Blindness", category, 1, 0, 10, "How long would you like the blindness to last? (In seconds, 0 is none)");
		Vars.creeperConfusion = config.getInt("Confusion", category, 2, 0, 10, "How long would you like the confusion to last? (In seconds, 0 is none)");
		Vars.creeperDigSlow = config.getInt("Slowness(Digging)", category, 0, 0, 10, "How long would you like the slowness(digging) to last? (In seconds, 0 is none)");
		Vars.creeperHarm = config.getInt("Damage", category, 0, 0, 10, "How long would you like the damage to last? (In seconds, 0 is none)");
		Vars.creeperHunger = config.getInt("Hunger", category, 0, 0, 10, "How long would you like the hunger to last? (In seconds, 0 is none)");
		Vars.creeperMoveSlow = config.getInt("Slowness(Moving)", category, 1, 0, 10, "How long would you like the slowness(movement) to last? (In seconds, 0 is none)");
		Vars.creeperPoison = config.getInt("Poison", category, 0, 0, 10, "How long would you like the poison to last? (In seconds, 0 is none)");
		Vars.creeperWeakness = config.getInt("Weakness", category, 0, 0, 10, "How long would you like the weakness to last? (In seconds, 0 is none)");
		Vars.creeperWither = config.getInt("Wither", category, 0, 0, 10, "How long would you like the withering to last? (In seconds, 0 is none)");
	}
	
	private static void loadSpiderSettings() {
		ArrayList<String> catOrder = configOrder;
		
		category = "Spider";
		config.setCategoryPropertyOrder(category, catOrder);
		Vars.spider = config.getBoolean("PotionEffects", category, true, "Do you want to enable potion effects when hitting a spider?");
		Vars.spiderPotionChance = config.getInt("PotionChance", category, 5, 1, 20, "1 over the value you choose is the chance of it happening.");
		
		Vars.spiderBlind = config.getInt("Blindness", category, 1, 0, 10, "How long would you like the blindness to last? (In seconds, 0 is none)");
		Vars.spiderConfusion = config.getInt("Confusion", category, 2, 0, 10, "How long would you like the confusion to last? (In seconds, 0 is none)");
		Vars.spiderDigSlow = config.getInt("Slowness(Digging)", category, 0, 0, 10, "How long would you like the slowness(digging) to last? (In seconds, 0 is none)");
		Vars.spiderHarm = config.getInt("Damage", category, 0, 0, 10, "How long would you like the damage to last? (In seconds, 0 is none)");
		Vars.spiderHunger = config.getInt("Hunger", category, 0, 0, 10, "How long would you like the hunger to last? (In seconds, 0 is none)");
		Vars.spiderMoveSlow = config.getInt("Slowness(Moving)", category, 1, 0, 10, "How long would you like the slowness(movement) to last? (In seconds, 0 is none)");
		Vars.spiderPoison = config.getInt("Poison", category, 0, 0, 10, "How long would you like the poison to last? (In seconds, 0 is none)");
		Vars.spiderWeakness = config.getInt("Weakness", category, 0, 0, 10, "How long would you like the weakness to last? (In seconds, 0 is none)");
		Vars.spiderWither = config.getInt("Wither", category, 0, 0, 10, "How long would you like the withering to last? (In seconds, 0 is none)");
		
	}
	
	private static void loadZombieSettings() {
		ArrayList<String> catOrder = configOrder;
		
		category = "Zombie";
		config.setCategoryPropertyOrder(category, catOrder);
		Vars.zombie = config.getBoolean("PotionEffects", category, true, "Do you want to enable potion effects when hitting a zombie?");
		Vars.zombiePotionChance = config.getInt("PotionChance", category, 5, 1, 20, "1 over the value you choose is the chance of it happening.");
		
		Vars.zombieBlind = config.getInt("Blindness", category, 1, 0, 10, "How long would you like the blindness to last? (In seconds, 0 is none)");
		Vars.zombieConfusion = config.getInt("Confusion", category, 2, 0, 10, "How long would you like the confusion to last? (In seconds, 0 is none)");
		Vars.zombieDigSlow = config.getInt("Slowness(Digging)", category, 0, 0, 10, "How long would you like the slowness(digging) to last? (In seconds, 0 is none)");
		Vars.zombieHarm = config.getInt("Damage", category, 0, 0, 10, "How long would you like the damage to last? (In seconds, 0 is none)");
		Vars.zombieHunger = config.getInt("Hunger", category, 0, 0, 10, "How long would you like the hunger to last? (In seconds, 0 is none)");
		Vars.zombieMoveSlow = config.getInt("Slowness(Moving)", category, 1, 0, 10, "How long would you like the slowness(movement) to last? (In seconds, 0 is none)");
		Vars.zombiePoison = config.getInt("Poison", category, 0, 0, 10, "How long would you like the poison to last? (In seconds, 0 is none)");
		Vars.zombieWeakness = config.getInt("Weakness", category, 0, 0, 10, "How long would you like the weakness to last? (In seconds, 0 is none)");
		Vars.zombieWither = config.getInt("Wither", category, 0, 0, 10, "How long would you like the withering to last? (In seconds, 0 is none)");
		
	}
	
	private static void loadSkeletonSettings() {
		ArrayList<String> catOrder = configOrder;
		
		category = "Skeleton";
		config.setCategoryPropertyOrder(category, catOrder);
		Vars.skeleton = config.getBoolean("PotionEffects", category, true, "Do you want to enable potion effects when hitting a skeleton?");
		Vars.skeletonPotionChance = config.getInt("PotionChance", category, 5, 1, 20, "1 over the value you choose is the chance of it happening.");
		
		Vars.skeletonBlind = config.getInt("Blindness", category, 1, 0, 10, "How long would you like the blindness to last? (In seconds, 0 is none)");
		Vars.skeletonConfusion = config.getInt("Confusion", category, 2, 0, 10, "How long would you like the confusion to last? (In seconds, 0 is none)");
		Vars.skeletonDigSlow = config.getInt("Slowness(Digging)", category, 0, 0, 10, "How long would you like the slowness(digging) to last? (In seconds, 0 is none)");
		Vars.skeletonHarm = config.getInt("Damage", category, 0, 0, 10, "How long would you like the damage to last? (In seconds, 0 is none)");
		Vars.skeletonHunger = config.getInt("Hunger", category, 0, 0, 10, "How long would you like the hunger to last? (In seconds, 0 is none)");
		Vars.skeletonMoveSlow = config.getInt("Slowness(Moving)", category, 1, 0, 10, "How long would you like the slowness(movement) to last? (In seconds, 0 is none)");
		Vars.skeletonPoison = config.getInt("Poison", category, 0, 0, 10, "How long would you like the poison to last? (In seconds, 0 is none)");
		Vars.skeletonWeakness = config.getInt("Weakness", category, 0, 0, 10, "How long would you like the weakness to last? (In seconds, 0 is none)");
		Vars.skeletonWither = config.getInt("Wither", category, 0, 0, 10, "How long would you like the withering to last? (In seconds, 0 is none)");
	
	}
	
	private static void loadCaveSpiderSettings() {
		ArrayList<String> catOrder = configOrder;
		
		category = "CaveSpider";
		config.setCategoryPropertyOrder(category, catOrder);
		Vars.caveSpider = config.getBoolean("PotionEffects", category, true, "Do you want to enable potion effects when hitting a caveSpider?");
		Vars.caveSpiderPotionChance = config.getInt("PotionChance", category, 5, 1, 20, "1 over the value you choose is the chance of it happening.");
		
		Vars.caveSpiderBlind = config.getInt("Blindness", category, 1, 0, 10, "How long would you like the blindness to last? (In seconds, 0 is none)");
		Vars.caveSpiderConfusion = config.getInt("Confusion", category, 2, 0, 10, "How long would you like the confusion to last? (In seconds, 0 is none)");
		Vars.caveSpiderDigSlow = config.getInt("Slowness(Digging)", category, 0, 0, 10, "How long would you like the slowness(digging) to last? (In seconds, 0 is none)");
		Vars.caveSpiderHarm = config.getInt("Damage", category, 0, 0, 10, "How long would you like the damage to last? (In seconds, 0 is none)");
		Vars.caveSpiderHunger = config.getInt("Hunger", category, 0, 0, 10, "How long would you like the hunger to last? (In seconds, 0 is none)");
		Vars.caveSpiderMoveSlow = config.getInt("Slowness(Moving)", category, 1, 0, 10, "How long would you like the slowness(movement) to last? (In seconds, 0 is none)");
		Vars.caveSpiderPoison = config.getInt("Poison", category, 0, 0, 10, "How long would you like the poison to last? (In seconds, 0 is none)");
		Vars.caveSpiderWeakness = config.getInt("Weakness", category, 0, 0, 10, "How long would you like the weakness to last? (In seconds, 0 is none)");
		Vars.caveSpiderWither = config.getInt("Wither", category, 0, 0, 10, "How long would you like the withering to last? (In seconds, 0 is none)");
		
	}
	
	private static void loadEndermanSettings() {
		ArrayList<String> catOrder = configOrder;
		
		category = "Enderman";
		config.setCategoryPropertyOrder(category, catOrder);
		Vars.enderman = config.getBoolean("PotionEffects", category, true, "Do you want to enable potion effects when hitting a enderman?");
		Vars.endermanPotionChance = config.getInt("PotionChance", category, 5, 1, 20, "1 over the value you choose is the chance of it happening.");
		
		Vars.endermanBlind = config.getInt("Blindness", category, 1, 0, 10, "How long would you like the blindness to last? (In seconds, 0 is none)");
		Vars.endermanConfusion = config.getInt("Confusion", category, 2, 0, 10, "How long would you like the confusion to last? (In seconds, 0 is none)");
		Vars.endermanDigSlow = config.getInt("Slowness(Digging)", category, 0, 0, 10, "How long would you like the slowness(digging) to last? (In seconds, 0 is none)");
		Vars.endermanHarm = config.getInt("Damage", category, 0, 0, 10, "How long would you like the damage to last? (In seconds, 0 is none)");
		Vars.endermanHunger = config.getInt("Hunger", category, 0, 0, 10, "How long would you like the hunger to last? (In seconds, 0 is none)");
		Vars.endermanMoveSlow = config.getInt("Slowness(Moving)", category, 1, 0, 10, "How long would you like the slowness(movement) to last? (In seconds, 0 is none)");
		Vars.endermanPoison = config.getInt("Poison", category, 0, 0, 10, "How long would you like the poison to last? (In seconds, 0 is none)");
		Vars.endermanWeakness = config.getInt("Weakness", category, 0, 0, 10, "How long would you like the weakness to last? (In seconds, 0 is none)");
		Vars.endermanWither = config.getInt("Wither", category, 0, 0, 10, "How long would you like the withering to last? (In seconds, 0 is none)");
		
	}
	
	private static void loadWitchSettings() {
		ArrayList<String> catOrder = configOrder;
		
		category = "Witch";
		config.setCategoryPropertyOrder(category, catOrder);
		Vars.witch = config.getBoolean("PotionEffects", category, true, "Do you want to enable potion effects when hitting a witch?");
		Vars.witchPotionChance = config.getInt("PotionChance", category, 5, 1, 20, "1 over the value you choose is the chance of it happening.");
		
		Vars.witchBlind = config.getInt("Blindness", category, 1, 0, 10, "How long would you like the blindness to last? (In seconds, 0 is none)");
		Vars.witchConfusion = config.getInt("Confusion", category, 2, 0, 10, "How long would you like the confusion to last? (In seconds, 0 is none)");
		Vars.witchDigSlow = config.getInt("Slowness(Digging)", category, 0, 0, 10, "How long would you like the slowness(digging) to last? (In seconds, 0 is none)");
		Vars.witchHarm = config.getInt("Damage", category, 0, 0, 10, "How long would you like the damage to last? (In seconds, 0 is none)");
		Vars.witchHunger = config.getInt("Hunger", category, 0, 0, 10, "How long would you like the hunger to last? (In seconds, 0 is none)");
		Vars.witchMoveSlow = config.getInt("Slowness(Moving)", category, 1, 0, 10, "How long would you like the slowness(movement) to last? (In seconds, 0 is none)");
		Vars.witchPoison = config.getInt("Poison", category, 0, 0, 10, "How long would you like the poison to last? (In seconds, 0 is none)");
		Vars.witchWeakness = config.getInt("Weakness", category, 0, 0, 10, "How long would you like the weakness to last? (In seconds, 0 is none)");
		Vars.witchWither = config.getInt("Wither", category, 0, 0, 10, "How long would you like the withering to last? (In seconds, 0 is none)");
		
	}
	
	private static void loadBlazeSettings() {
		ArrayList<String> catOrder = configOrder;
		
		category = "Blaze";
		config.setCategoryPropertyOrder(category, catOrder);
		Vars.blaze = config.getBoolean("PotionEffects", category, true, "Do you want to enable potion effects when hitting a blaze?");
		Vars.blazePotionChance = config.getInt("PotionChance", category, 5, 1, 20, "1 over the value you choose is the chance of it happening.");
		
		Vars.blazeBlind = config.getInt("Blindness", category, 1, 0, 10, "How long would you like the blindness to last? (In seconds, 0 is none)");
		Vars.blazeConfusion = config.getInt("Confusion", category, 2, 0, 10, "How long would you like the confusion to last? (In seconds, 0 is none)");
		Vars.blazeDigSlow = config.getInt("Slowness(Digging)", category, 0, 0, 10, "How long would you like the slowness(digging) to last? (In seconds, 0 is none)");
		Vars.blazeHarm = config.getInt("Damage", category, 0, 0, 10, "How long would you like the damage to last? (In seconds, 0 is none)");
		Vars.blazeHunger = config.getInt("Hunger", category, 0, 0, 10, "How long would you like the hunger to last? (In seconds, 0 is none)");
		Vars.blazeMoveSlow = config.getInt("Slowness(Moving)", category, 1, 0, 10, "How long would you like the slowness(movement) to last? (In seconds, 0 is none)");
		Vars.blazePoison = config.getInt("Poison", category, 0, 0, 10, "How long would you like the poison to last? (In seconds, 0 is none)");
		Vars.blazeWeakness = config.getInt("Weakness", category, 0, 0, 10, "How long would you like the weakness to last? (In seconds, 0 is none)");
		Vars.blazeWither = config.getInt("Wither", category, 0, 0, 10, "How long would you like the withering to last? (In seconds, 0 is none)");
		
	}
	
}
