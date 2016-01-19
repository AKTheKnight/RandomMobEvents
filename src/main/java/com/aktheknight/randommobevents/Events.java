package com.aktheknight.randommobevents;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.Explosion;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Events {
	
	public static final Logger LOGGER = LogManager.getLogger(RandomMobEvents.MODID);
	
	Random generator = new Random();
	
	@SubscribeEvent
	public void AttackEntity(AttackEntityEvent event) {
		if (!event.target.worldObj.isRemote) {
//			LOGGER.log(Level.FINEST, "Fired AttackEntityEvent");
			if (event.target instanceof EntityCreeper && Vars.creeper) {
				isCreeper(event.target, event.entityLiving);
			}
			else if (event.target instanceof EntitySpider && Vars.spider) {
				isSpider(event.target, event.entityLiving);
			}
			else if(event.target instanceof EntityZombie && Vars.zombie) {
				isZombie(event.target, event.entityLiving);
			}
			else if(event.target instanceof EntitySkeleton && Vars.skeleton) {
				isSkeleton(event.target, event.entityLiving);
			}
			else if(event.target instanceof EntityCaveSpider && Vars.caveSpider) {
				isCaveSpider(event.target, event.entityLiving);
			}
			return;
		}
	}
	
	public void isCreeper(Entity creeper, EntityLivingBase player) {
//		LOGGER.log(Level.FINEST, "Entity was a creeper");
		if(chance(Vars.creeperPotionChance)) {
			player.addPotionEffect(new PotionEffect(Potion.blindness.getId(), Vars.creeperBlind * 20));
			player.addPotionEffect(new PotionEffect(Potion.confusion.getId(), Vars.creeperConfusion * 20));
			player.addPotionEffect(new PotionEffect(Potion.digSlowdown.getId(), Vars.creeperDigSlow * 20));
			player.addPotionEffect(new PotionEffect(Potion.harm.getId(), Vars.creeperHarm * 20));
			player.addPotionEffect(new PotionEffect(Potion.hunger.getId(), Vars.creeperHunger * 20));
			player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), Vars.creeperMoveSlow * 20));
			player.addPotionEffect(new PotionEffect(Potion.poison.getId(), Vars.creeperPoison * 20));
			player.addPotionEffect(new PotionEffect(Potion.weakness.getId(), Vars.creeperWeakness * 20));
			player.addPotionEffect(new PotionEffect(Potion.wither.getId(), Vars.creeperWither * 20));
		}
		if(chance(Vars.creeperExplodeChance)) {
			
			Explosion explosion = new Explosion(creeper.worldObj, null, creeper.posX, creeper.posY, creeper.posZ, 4.0F, false, true);
			explosion.doExplosionA();
			explosion.doExplosionB(true);
			
			creeper.setDead();
		}
	}
	
	public void isSpider(Entity spider, EntityLivingBase player) {
//		LOGGER.log(Level.INFO, "Was spider");
		if (chance(Vars.spiderPotionChance)) {
			player.addPotionEffect(new PotionEffect(Potion.blindness.getId(), Vars.spiderBlind * 20));
			player.addPotionEffect(new PotionEffect(Potion.confusion.getId(), Vars.spiderConfusion * 20));
			player.addPotionEffect(new PotionEffect(Potion.digSlowdown.getId(), Vars.spiderDigSlow * 20));
			player.addPotionEffect(new PotionEffect(Potion.harm.getId(), Vars.spiderHarm * 20));
			player.addPotionEffect(new PotionEffect(Potion.hunger.getId(), Vars.spiderHunger * 20));
			player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), Vars.spiderMoveSlow * 20));
			player.addPotionEffect(new PotionEffect(Potion.poison.getId(), Vars.spiderPoison * 20));
			player.addPotionEffect(new PotionEffect(Potion.weakness.getId(), Vars.spiderWeakness * 20));
			player.addPotionEffect(new PotionEffect(Potion.wither.getId(), Vars.spiderWither * 20));
			
		}
	}
	
	public void isZombie(Entity zombie, EntityLivingBase player) {
//		LOGGER.log(Level.INFO, "Was zombie");
		if (chance(Vars.zombiePotionChance)) {
			player.addPotionEffect(new PotionEffect(Potion.blindness.getId(), Vars.zombieBlind * 20));
			player.addPotionEffect(new PotionEffect(Potion.confusion.getId(), Vars.zombieConfusion * 20));
			player.addPotionEffect(new PotionEffect(Potion.digSlowdown.getId(), Vars.zombieDigSlow * 20));
			player.addPotionEffect(new PotionEffect(Potion.harm.getId(), Vars.zombieHarm * 20));
			player.addPotionEffect(new PotionEffect(Potion.hunger.getId(), Vars.zombieHunger * 20));
			player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), Vars.zombieMoveSlow * 20));
			player.addPotionEffect(new PotionEffect(Potion.poison.getId(), Vars.zombiePoison * 20));
			player.addPotionEffect(new PotionEffect(Potion.weakness.getId(), Vars.zombieWeakness * 20));
			player.addPotionEffect(new PotionEffect(Potion.wither.getId(), Vars.zombieWither * 20));
		}
	}
	
	public void isSkeleton(Entity skeleton, EntityLivingBase player) {
//		LOGGER.log(Level.INFO, "Was skeleton");
		if (chance(Vars.skeletonPotionChance)) {
			player.addPotionEffect(new PotionEffect(Potion.blindness.getId(), Vars.skeletonBlind * 20));
			player.addPotionEffect(new PotionEffect(Potion.confusion.getId(), Vars.skeletonConfusion * 20));
			player.addPotionEffect(new PotionEffect(Potion.digSlowdown.getId(), Vars.skeletonDigSlow * 20));
			player.addPotionEffect(new PotionEffect(Potion.harm.getId(), Vars.skeletonHarm * 20));
			player.addPotionEffect(new PotionEffect(Potion.hunger.getId(), Vars.skeletonHunger * 20));
			player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), Vars.skeletonMoveSlow * 20));
			player.addPotionEffect(new PotionEffect(Potion.poison.getId(), Vars.skeletonPoison * 20));
			player.addPotionEffect(new PotionEffect(Potion.weakness.getId(), Vars.skeletonWeakness * 20));
			player.addPotionEffect(new PotionEffect(Potion.wither.getId(), Vars.skeletonWither * 20));
		}
	}
	
	public void isCaveSpider(Entity caveSpider, EntityLivingBase player) {
//		LOGGER.log(Level.INFO, "Was caveSpider");
		if (chance(Vars.caveSpiderPotionChance)) {
			player.addPotionEffect(new PotionEffect(Potion.blindness.getId(), Vars.caveSpiderBlind * 20));
			player.addPotionEffect(new PotionEffect(Potion.confusion.getId(), Vars.caveSpiderConfusion * 20));
			player.addPotionEffect(new PotionEffect(Potion.digSlowdown.getId(), Vars.caveSpiderDigSlow * 20));
			player.addPotionEffect(new PotionEffect(Potion.harm.getId(), Vars.caveSpiderHarm * 20));
			player.addPotionEffect(new PotionEffect(Potion.hunger.getId(), Vars.caveSpiderHunger * 20));
			player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), Vars.caveSpiderMoveSlow * 20));
			player.addPotionEffect(new PotionEffect(Potion.poison.getId(), Vars.caveSpiderPoison * 20));
			player.addPotionEffect(new PotionEffect(Potion.weakness.getId(), Vars.caveSpiderWeakness * 20));
			player.addPotionEffect(new PotionEffect(Potion.wither.getId(), Vars.caveSpiderWither * 20));
		}
	}
	
	//Whether to run effect or not
	public boolean chance(int chance) {
		int i = generator.nextInt(chance);
		if (i + 1 == (chance)) {		
			return true;
		}
		return false;
	}
}
