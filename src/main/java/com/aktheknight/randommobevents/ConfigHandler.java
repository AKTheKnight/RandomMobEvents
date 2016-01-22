package com.aktheknight.randommobevents;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
	
	public static Configuration config;
	static String category;
	
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
		if (config.hasChanged()) {
			config.save();
		}
	}
	
	private static void loadCreeperSettings() {
		category = "Creeper";
		Vars.creeper = config.getBoolean("Instant Explosion", category, true, "Do you want to enable creepers instantly exploding?");
		Vars.creeperExplodeChance = config.getInt("Chance", category, 5, 1, 20, "1 over the value you choose is the chance of it happening.");
		
		Vars.creeperPotionChance = config.getInt("Chance", category, 5, 1, 20, "1 over the value you choose is the chance of it happening.");
		
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
		category = "Spider";
		Vars.spider = config.getBoolean("Potion Effects?", category, true, "Do you want to enable potion effects when hitting a spider?");
		Vars.spiderPotionChance = config.getInt("Chance", category, 5, 1, 20, "1 over the value you choose is the chance of it happening.");
		
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
		category = "Zombie";
		Vars.zombie = config.getBoolean("Potion Effects?", category, true, "Do you want to enable potion effects when hitting a zombie?");
		Vars.zombiePotionChance = config.getInt("Chance", category, 5, 1, 20, "1 over the value you choose is the chance of it happening.");
		
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
		category = "Skeleton";
		Vars.skeleton = config.getBoolean("Potion Effects?", category, true, "Do you want to enable potion effects when hitting a skeleton?");
		Vars.skeletonPotionChance = config.getInt("Chance", category, 5, 1, 20, "1 over the value you choose is the chance of it happening.");
		
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
		category = "CaveSpider";
		Vars.caveSpider = config.getBoolean("Potion Effects?", category, true, "Do you want to enable potion effects when hitting a caveSpider?");
		Vars.caveSpiderPotionChance = config.getInt("Chance", category, 5, 1, 20, "1 over the value you choose is the chance of it happening.");
		
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
	
}
