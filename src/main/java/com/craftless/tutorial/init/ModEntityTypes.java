package com.craftless.tutorial.init;

import com.craftless.tutorial.Tutorial;
import com.craftless.tutorial.entities.BulletEntity;
import com.craftless.tutorial.entities.EnderArrowEntity;
import com.craftless.tutorial.entities.ExplosiveArrowEntity;
import com.craftless.tutorial.entities.ExplosiveCactusEntity;
import com.craftless.tutorial.entities.FiveTimesTNTEntity;
import com.craftless.tutorial.entities.HogEntity;
import com.craftless.tutorial.entities.LavaTNTEntity;
import com.craftless.tutorial.entities.LightningBoltArrowEntity;
import com.craftless.tutorial.entities.LightningStormArrowEntity;
import com.craftless.tutorial.entities.LightningStormTNTEntity;
import com.craftless.tutorial.entities.MiningArrowEntity;
import com.craftless.tutorial.entities.TNTArrowEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes
{
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Tutorial.MOD_ID);
	
	
	//Entity Types
	public static final RegistryObject<EntityType<HogEntity>> HOG = ENTITY_TYPES.register("hog",
			() -> EntityType.Builder.create(HogEntity::new, EntityClassification.CREATURE)
				.size(1.0f, 1.0f)
				.build(new ResourceLocation(Tutorial.MOD_ID, "hog").toString()));

	public static final RegistryObject<EntityType<BulletEntity>> BULLET = ENTITY_TYPES.register("bullet",
			() -> EntityType.Builder.<BulletEntity>create(BulletEntity::new, EntityClassification.MISC)
				.size(1.0f, 1.0f)
				.func_233606_a_(4)
				.func_233608_b_(3)
				.build(new ResourceLocation(Tutorial.MOD_ID, "hog").toString()));
	
	public static final RegistryObject<EntityType<ExplosiveCactusEntity>> EXPLOSIVE_CACTUS = ENTITY_TYPES.register("explosive_cactus",
			() -> EntityType.Builder.<ExplosiveCactusEntity>create(ExplosiveCactusEntity::new, EntityClassification.MISC)
				.size(1.0f, 1.0f)
				.func_233606_a_(4)
				.func_233608_b_(20)
				.build(new ResourceLocation(Tutorial.MOD_ID, "hog").toString()));
	
	public static final RegistryObject<EntityType<FiveTimesTNTEntity>> FIVE_TIMES_TNT_ENTITY = ENTITY_TYPES.register("five_times_tnt_entity",
			() -> EntityType.Builder.<FiveTimesTNTEntity>create(FiveTimesTNTEntity::new, EntityClassification.MISC)
				.immuneToFire()
				.size(0.98F, 0.98F)
				.func_233606_a_(10)
				.func_233608_b_(10)
				.build(new ResourceLocation(Tutorial.MOD_ID, "tnt").toString()));
	
	public static final RegistryObject<EntityType<LightningStormTNTEntity>> LIGHTNING_STORM_TNT_ENTITY = ENTITY_TYPES.register("lightning_storm_tnt",
			() -> EntityType.Builder.<LightningStormTNTEntity>create(LightningStormTNTEntity::new, EntityClassification.MISC)
				.immuneToFire()
				.size(0.98F, 0.98F)
				.func_233606_a_(10)
				.func_233608_b_(10)
				.build("lightning_storm_tnt"));
	
	public static final RegistryObject<EntityType<LavaTNTEntity>> LAVA_TNT_ENTITY = ENTITY_TYPES.register("lava_tnt",
			() -> EntityType.Builder.<LavaTNTEntity>create(LavaTNTEntity::new, EntityClassification.MISC)
				.immuneToFire()
				.size(0.98F, 0.98F)
				.func_233606_a_(10)
				.func_233608_b_(10)
				.build("lightning_storm_tnt"));
	
	
	
	public static final RegistryObject<EntityType<ExplosiveArrowEntity>> EXPLOSIVE_ARROW = ENTITY_TYPES.register("explosive_arrow",
			() -> EntityType.Builder.<ExplosiveArrowEntity>create(ExplosiveArrowEntity::new, EntityClassification.MISC)
				.size(1.0f, 1.0f)
				.func_233606_a_(4)
				.func_233608_b_(20)
				.build(new ResourceLocation(Tutorial.MOD_ID, "hog").toString()));
	
	public static final RegistryObject<EntityType<LightningBoltArrowEntity>> LIGHTNING_BOLT_ARROW = ENTITY_TYPES.register("lightning_bolt_arrow",
			() -> EntityType.Builder.<LightningBoltArrowEntity>create(LightningBoltArrowEntity::new, EntityClassification.MISC)
				.size(1.0f, 1.0f)
				.func_233606_a_(4)
				.func_233608_b_(20)
				.build(new ResourceLocation(Tutorial.MOD_ID, "hog").toString()));
	
	public static final RegistryObject<EntityType<LightningStormArrowEntity>> LIGHTNING_STORM_ARROW = ENTITY_TYPES.register("lightning_storm_arrow",
			() -> EntityType.Builder.<LightningStormArrowEntity>create(LightningStormArrowEntity::new, EntityClassification.MISC)
				.size(1.0f, 1.0f)
				.func_233606_a_(4)
				.func_233608_b_(20)
				.build(new ResourceLocation(Tutorial.MOD_ID, "hog").toString()));
	
	public static final RegistryObject<EntityType<TNTArrowEntity>> TNT_ARROW = ENTITY_TYPES.register("tnt_arrow",
			() -> EntityType.Builder.<TNTArrowEntity>create(TNTArrowEntity::new, EntityClassification.MISC)
				.size(1.0f, 1.0f)
				.func_233606_a_(4)
				.func_233608_b_(20)
				.build(new ResourceLocation(Tutorial.MOD_ID, "hog").toString()));
	
	public static final RegistryObject<EntityType<MiningArrowEntity>> MINING_ARROW = ENTITY_TYPES.register("mining_arrow",
			() -> EntityType.Builder.<MiningArrowEntity>create(MiningArrowEntity::new, EntityClassification.MISC)
				.size(1.0f, 1.0f)
				.func_233606_a_(4)
				.func_233608_b_(20)
				.build(new ResourceLocation(Tutorial.MOD_ID, "hog").toString()));
	
	public static final RegistryObject<EntityType<EnderArrowEntity>> ENDER_ARROW = ENTITY_TYPES.register("ender_arrow",
			() -> EntityType.Builder.<EnderArrowEntity>create(EnderArrowEntity::new, EntityClassification.MISC)
				.size(1.0f, 1.0f)
				.func_233606_a_(4)
				.func_233608_b_(20)
				.build(new ResourceLocation(Tutorial.MOD_ID, "hog").toString()));
}
