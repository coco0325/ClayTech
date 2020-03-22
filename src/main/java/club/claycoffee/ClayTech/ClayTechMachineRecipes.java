package club.claycoffee.ClayTech;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import club.claycoffee.ClayTech.utils.Slimefunutils;
import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;

public class ClayTechMachineRecipes {
	static ItemStack newMotor;
	public final static ItemStack[] BLIND_CORE = { new ItemStack(Material.INK_SAC), new ItemStack(Material.END_CRYSTAL),
			new ItemStack(Material.INK_SAC), new ItemStack(Material.INK_SAC), ClayTechItems.MAGIC_CLAY,
			new ItemStack(Material.INK_SAC), new ItemStack(Material.INK_SAC), new ItemStack(Material.END_CRYSTAL),
			new ItemStack(Material.INK_SAC) };
	public final static ItemStack[] BLIND_SWORD = { ClayTechItems.BLIND_CORE, ClayTechItems.BLIND_CORE,
			ClayTechItems.BLIND_CORE, ClayTechItems.BLIND_CORE, new ItemStack(Material.DIAMOND_SWORD),
			ClayTechItems.BLIND_CORE, ClayTechItems.BLIND_CORE, ClayTechItems.BLIND_CORE, ClayTechItems.BLIND_CORE };
	public final static ItemStack[] POISON_EYE = { new ItemStack(Material.SPIDER_EYE),
			new ItemStack(Material.SPIDER_EYE), new ItemStack(Material.SPIDER_EYE), new ItemStack(Material.SPIDER_EYE),
			ClayTechItems.MAGIC_CLAY, new ItemStack(Material.SPIDER_EYE), new ItemStack(Material.SPIDER_EYE),
			new ItemStack(Material.SPIDER_EYE), new ItemStack(Material.SPIDER_EYE) };
	public final static ItemStack[] POISON_CORE = { new ItemStack(Material.COAL_BLOCK), ClayTechItems.POISON_EYE,
			new ItemStack(Material.COAL_BLOCK), new ItemStack(Material.FERMENTED_SPIDER_EYE),
			new ItemStack(Material.FERMENTED_SPIDER_EYE), new ItemStack(Material.FERMENTED_SPIDER_EYE),
			new ItemStack(Material.COAL_BLOCK), ClayTechItems.POISON_EYE, new ItemStack(Material.COAL_BLOCK) };
	public final static ItemStack[] CONFUSION_CORE = { new ItemStack(Material.PUFFERFISH),
			new ItemStack(Material.PUFFERFISH), new ItemStack(Material.PUFFERFISH), new ItemStack(Material.PUFFERFISH),
			ClayTechItems.MAGIC_CLAY, new ItemStack(Material.PUFFERFISH), new ItemStack(Material.PUFFERFISH),
			new ItemStack(Material.PUFFERFISH), new ItemStack(Material.PUFFERFISH) };
	public final static ItemStack[] BLACK_ROCK_BLOCK = { new ItemStack(Material.OBSIDIAN),
			new ItemStack(Material.OBSIDIAN), new ItemStack(Material.OBSIDIAN), new ItemStack(Material.OBSIDIAN),
			ClayTechItems.MAGIC_CLAY, new ItemStack(Material.OBSIDIAN), new ItemStack(Material.OBSIDIAN),
			new ItemStack(Material.OBSIDIAN), new ItemStack(Material.OBSIDIAN) };
	public final static ItemStack[] SLOWNESS_CORE = { ClayTechItems.BLACK_ROCK_BLOCK, ClayTechItems.BLACK_ROCK_BLOCK,
			ClayTechItems.BLACK_ROCK_BLOCK, ClayTechItems.BLACK_ROCK_BLOCK, ClayTechItems.MAGIC_CLAY,
			ClayTechItems.BLACK_ROCK_BLOCK, ClayTechItems.BLACK_ROCK_BLOCK, ClayTechItems.BLACK_ROCK_BLOCK,
			ClayTechItems.BLACK_ROCK_BLOCK };
	public final static ItemStack[] ADVANCED_CONFUSION_CORE = { ClayTechItems.CONFUSION_CORE,
			ClayTechItems.CONFUSION_CORE, ClayTechItems.CONFUSION_CORE, ClayTechItems.CONFUSION_CORE,
			ClayTechItems.MAGIC_CLAY, ClayTechItems.CONFUSION_CORE, ClayTechItems.CONFUSION_CORE,
			ClayTechItems.CONFUSION_CORE, ClayTechItems.CONFUSION_CORE };
	public final static ItemStack[] ADVANCED_POISON_CORE = { ClayTechItems.POISON_CORE, ClayTechItems.POISON_CORE,
			ClayTechItems.POISON_CORE, ClayTechItems.POISON_CORE, ClayTechItems.MAGIC_CLAY, ClayTechItems.POISON_CORE,
			ClayTechItems.POISON_CORE, ClayTechItems.POISON_CORE, ClayTechItems.POISON_CORE };
	public final static ItemStack[] ADVANCED_SLOWNESS_CORE = { ClayTechItems.SLOWNESS_CORE, ClayTechItems.SLOWNESS_CORE,
			ClayTechItems.SLOWNESS_CORE, ClayTechItems.SLOWNESS_CORE, ClayTechItems.MAGIC_CLAY,
			ClayTechItems.SLOWNESS_CORE, ClayTechItems.SLOWNESS_CORE, ClayTechItems.SLOWNESS_CORE,
			ClayTechItems.SLOWNESS_CORE };
	public final static ItemStack[] ADVANCED_BLIND_CORE = { ClayTechItems.BLIND_CORE, ClayTechItems.BLIND_CORE,
			ClayTechItems.BLIND_CORE, ClayTechItems.BLIND_CORE, ClayTechItems.MAGIC_CLAY, ClayTechItems.BLIND_CORE,
			ClayTechItems.BLIND_CORE, ClayTechItems.BLIND_CORE, ClayTechItems.BLIND_CORE };
	public final static ItemStack[] FOUR_BOW = { ClayTechItems.ADVANCED_SLOWNESS_CORE,
			ClayTechItems.ADVANCED_POISON_CORE, ClayTechItems.ADVANCED_BLIND_CORE,
			ClayTechItems.ADVANCED_CONFUSION_CORE, new ItemStack(Material.BOW), ClayTechItems.ADVANCED_CONFUSION_CORE,
			ClayTechItems.ADVANCED_BLIND_CORE, ClayTechItems.ADVANCED_POISON_CORE,
			ClayTechItems.ADVANCED_SLOWNESS_CORE };
	public final static ItemStack[] POISON_SWORD = { ClayTechItems.POISON_CORE, ClayTechItems.POISON_CORE,
			ClayTechItems.POISON_CORE, ClayTechItems.POISON_CORE, new ItemStack(Material.DIAMOND_SWORD),
			ClayTechItems.POISON_CORE, ClayTechItems.POISON_CORE, ClayTechItems.POISON_CORE,
			ClayTechItems.POISON_CORE };
	public final static ItemStack[] ANTI_SLOWNESS_BOOTS = { ClayTechItems.SLOWNESS_CORE, ClayTechItems.SLOWNESS_CORE,
			ClayTechItems.SLOWNESS_CORE, ClayTechItems.SLOWNESS_CORE, new ItemStack(Material.IRON_BOOTS),
			ClayTechItems.SLOWNESS_CORE, ClayTechItems.SLOWNESS_CORE, ClayTechItems.SLOWNESS_CORE,
			ClayTechItems.SLOWNESS_CORE };
	public final static ItemStack[] TNT_EXPLOSION_CREATER = { new ItemStack(Material.TNT), ClayTechItems.MAGIC_CLAY,
			new ItemStack(Material.TNT), ClayTechItems.MAGIC_CLAY, new ItemStack(Material.DIAMOND_HOE),
			ClayTechItems.MAGIC_CLAY, new ItemStack(Material.TNT), new ItemStack(Material.FLINT_AND_STEEL),
			new ItemStack(Material.TNT) };

	// 食物
	public final static ItemStack[] CHICKEN_FOOT = { null, new ItemStack(Material.COAL), null, null,
			ClayTechItems.RAW_CHICKEN_FOOT, null, null, new ItemStack(Material.COAL), null };
	public final static ItemStack[] SPICY_CHICKEN_BURGER = { ClayTechItems.RAW_BREAD, ClayTechItems.RAW_VEGETABLE,
			ClayTechItems.RAW_BREAD, ClayTechItems.RAW_VEGETABLE, ClayTechItems.CHICKEN_FOOT,
			ClayTechItems.RAW_VEGETABLE, ClayTechItems.RAW_BREAD, ClayTechItems.MAGIC_CLAY, ClayTechItems.RAW_BREAD };
	public final static ItemStack[] BABA_BURGER = { new ItemStack(Material.COAL), ClayTechItems.RAW_BREAD,
			new ItemStack(Material.COAL), new ItemStack(Material.COAL), new ItemStack(Material.COAL),
			new ItemStack(Material.COAL), new ItemStack(Material.COAL), ClayTechItems.RAW_BREAD,
			new ItemStack(Material.COAL) };
	public final static ItemStack[] CHOCOLATE = { ClayTechItems.COCOA_BEAN, ClayTechItems.COCOA_BEAN,
			ClayTechItems.COCOA_BEAN, ClayTechItems.COCOA_BEAN, ClayTechItems.STARCH, ClayTechItems.COCOA_BEAN,
			ClayTechItems.COCOA_BEAN, ClayTechItems.COCOA_BEAN, ClayTechItems.COCOA_BEAN };
	public final static ItemStack[] SNAIL_FOOD = { ClayTechItems.FLOUR, ClayTechItems.FLOUR, ClayTechItems.FLOUR,
			ClayTechItems.FLOUR, ClayTechItems.SNAIL_HEALTHY, ClayTechItems.FLOUR, ClayTechItems.FLOUR,
			ClayTechItems.FLOUR, ClayTechItems.FLOUR };
	public final static ItemStack[] CLAY_COFFEE = { null, ClayTechItems.COCOA_BEAN, null, null,
			ClayTechItems.COCOA_BEAN, null, null, ClayTechItems.DRINK_BOTTLE, null };
	public final static ItemStack[] LEMON_POWDER_DRINK = { null, ClayTechItems.LEMON_POWDER, null, null,
			ClayTechItems.LEMON_POWDER, null, null, ClayTechItems.DRINK_BOTTLE, null };
	public final static ItemStack[] TEA_DRINK = { null, ClayTechItems.TEA_POWDER, null, null, ClayTechItems.TEA_POWDER,
			null, null, ClayTechItems.DRINK_BOTTLE, null };
	public final static ItemStack[] LEMON_TEA_DRINK = { null, ClayTechItems.TEA_POWDER, null,
			ClayTechItems.LEMON_POWDER, ClayTechItems.TEA_POWDER, ClayTechItems.LEMON_POWDER, null,
			ClayTechItems.DRINK_BOTTLE, null };
	public final static ItemStack[] TEA_POWDER = { null, null, null, null, ClayTechItems.RAW_TEA, null, null, null,
			null };
	public final static ItemStack[] LEMON_POWDER = { null, null, null, null, ClayTechItems.CLAY_LEMON, null, null, null,
			null };
	public final static ItemStack[] COOKED_SWEET_POTATO = { null, new ItemStack(Material.COAL), null, null,
			ClayTechItems.CLAY_SWEET_POTATO, null, null, new ItemStack(Material.COAL), null };

	public static ItemStack[] HONEY_SWEET;
	static {
		if (ClayTech.is115()) {
			HONEY_SWEET = new ItemStack[] { new ItemStack(Material.SWEET_BERRIES),
					new ItemStack(Material.SWEET_BERRIES), new ItemStack(Material.SWEET_BERRIES),
					new ItemStack(Material.SUGAR), new ItemStack(Material.HONEY_BOTTLE), new ItemStack(Material.SUGAR),
					new ItemStack(Material.SUGAR), new ItemStack(Material.SUGAR), new ItemStack(Material.SUGAR) };
		}
	}
	public final static ItemStack[] ELEMENT_CARBON = { null, null, null, null, new ItemStack(Material.COAL, 8), null,
			null, null, null };
	public final static ItemStack[] ELEMENT_OXYGEN = { null, null, null, null, new ItemStack(Material.GRASS_BLOCK, 3),
			null, null, null, null };
	public final static ItemStack[] ELEMENT_SILICON = { null, null, null, null, new ItemStack(Material.SAND, 10), null,
			null, null, null };
	public final static ItemStack[] BLISTERING_CORE = { SlimefunItems.BLISTERING_INGOT_3,
			SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.BLISTERING_INGOT_3,
			SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.BLISTERING_INGOT_3,
			SlimefunItems.BLISTERING_INGOT_3, SlimefunItems.BLISTERING_INGOT_3 };
	public final static ItemStack[] ELEMENT_UNIT = { SlimefunItems.DAMASCUS_STEEL_INGOT,
			SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT,
			null, SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT,
			SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT };
	static {
		newMotor = ClayTechItems.ELECTRIC_MOTOR_8.clone();
		newMotor.setAmount(1);
	}
	public final static ItemStack[] ELECTRIC_MOTOR_8 = { null, null, null, null, SlimefunItems.ELECTRIC_MOTOR, null,
			null, null, null };
	public final static ItemStack[] HIGHSPEED_RAILWAY = { null, null, null, null, new ItemStack(Material.POWERED_RAIL),
			null, null, newMotor, null };
	public final static ItemStack[] REINFORCED_ALLOY_PICKAXE = { SlimefunItems.REINFORCED_ALLOY_INGOT,
			SlimefunItems.REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_ALLOY_INGOT, null,
			SlimefunItems.REINFORCED_ALLOY_INGOT, null, null, SlimefunItems.REINFORCED_ALLOY_INGOT, null };
	public final static ItemStack[] CLAY_FUSION_INGOT = { SlimefunItems.SYNTHETIC_DIAMOND,
			SlimefunItems.SYNTHETIC_EMERALD, SlimefunItems.SYNTHETIC_SAPPHIRE, SlimefunItems.REINFORCED_ALLOY_INGOT,
			ClayTechItems.MAGIC_CLAY, SlimefunItems.REINFORCED_ALLOY_INGOT, null, null, null };
	public final static ItemStack[] CLAY_ALLOY_INGOT = { SlimefunItems.REINFORCED_ALLOY_INGOT,
			ClayTechItems.CLAY_FUSION_INGOT, SlimefunItems.CARBONADO, SlimefunItems.REDSTONE_ALLOY,
			ClayTechItems.MAGIC_CLAY, SlimefunItems.GOLD_24K, null, null, null };
	public final static ItemStack[] CLAY_ALLOY_PICKAXE = { ClayTechItems.CLAY_ALLOY_INGOT,
			ClayTechItems.CLAY_ALLOY_INGOT, ClayTechItems.CLAY_ALLOY_INGOT, null, ClayTechItems.CLAY_ALLOY_INGOT, null,
			null, ClayTechItems.CLAY_ALLOY_INGOT, null };
	public final static ItemStack[] CLAY_ALLOY_HELMET = Slimefunutils.getArmorsStack(1, ClayTechItems.CLAY_ALLOY_INGOT);
	public final static ItemStack[] CLAY_ALLOY_CHESTPLATE = Slimefunutils.getArmorsStack(2,
			ClayTechItems.CLAY_ALLOY_INGOT);
	public final static ItemStack[] CLAY_ALLOY_LEGGINGS = Slimefunutils.getArmorsStack(3,
			ClayTechItems.CLAY_ALLOY_INGOT);
	public final static ItemStack[] CLAY_ALLOY_BOOTS = Slimefunutils.getArmorsStack(4, ClayTechItems.CLAY_ALLOY_INGOT);
	public final static ItemStack[] SILICON_INGOT = { ClayTechItems.ELEMENT_SILICON, ClayTechItems.ELEMENT_SILICON,
			ClayTechItems.ELEMENT_SILICON, ClayTechItems.ELEMENT_SILICON, ClayTechItems.ELEMENT_SILICON, null, null,
			null, null };

	public final static ItemStack[] MOTOR_CORE = { SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.ELECTRIC_MOTOR,
			SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.ELECTRIC_MOTOR, ClayTechItems.CLAY_FUSION_INGOT,
			SlimefunItems.ELECTRIC_MOTOR, SlimefunItems.ELECTRIC_MOTOR, ClayTechItems.SILICON_INGOT,
			SlimefunItems.ELECTRIC_MOTOR };
	public final static ItemStack[] TEMPERATURE_RESISTANCE_OBSIDIAN = { SlimefunItems.WITHER_PROOF_OBSIDIAN,
			SlimefunItems.WITHER_PROOF_OBSIDIAN, SlimefunItems.WITHER_PROOF_OBSIDIAN,
			SlimefunItems.WITHER_PROOF_OBSIDIAN, ClayTechItems.BLISTERING_CORE, SlimefunItems.WITHER_PROOF_OBSIDIAN,
			SlimefunItems.WITHER_PROOF_OBSIDIAN, SlimefunItems.WITHER_PROOF_OBSIDIAN,
			SlimefunItems.WITHER_PROOF_OBSIDIAN };
	public final static ItemStack[] ROCKET_ENGINE_SHELL = { ClayTechItems.CLAY_FUSION_INGOT,
			ClayTechItems.CLAY_FUSION_INGOT, ClayTechItems.CLAY_FUSION_INGOT, ClayTechItems.CLAY_FUSION_INGOT,
			ClayTechItems.TEMPERATURE_RESISTANCE_OBSIDIAN, ClayTechItems.CLAY_FUSION_INGOT,
			ClayTechItems.CLAY_FUSION_INGOT, ClayTechItems.CLAY_FUSION_INGOT, ClayTechItems.CLAY_FUSION_INGOT };
	public final static ItemStack[] FUEL_TANK = { ClayTechItems.CLAY_FUSION_INGOT, ClayTechItems.CLAY_FUSION_INGOT,
			ClayTechItems.CLAY_FUSION_INGOT, ClayTechItems.CLAY_FUSION_INGOT, ClayTechItems.MAGIC_CLAY,
			ClayTechItems.CLAY_FUSION_INGOT, ClayTechItems.CLAY_FUSION_INGOT, ClayTechItems.CLAY_FUSION_INGOT,
			ClayTechItems.CLAY_FUSION_INGOT };
	public final static ItemStack[] ROCKET_ENGINE = { ClayTechItems.ROCKET_ENGINE_SHELL,
			ClayTechItems.ROCKET_ENGINE_SHELL, ClayTechItems.ROCKET_ENGINE_SHELL, ClayTechItems.MOTOR_CORE,
			ClayTechItems.FUEL_TANK, ClayTechItems.MOTOR_CORE, ClayTechItems.ARTIFICIAL_GOLD_BLOCK,
			ClayTechItems.ARTIFICIAL_GOLD_BLOCK, ClayTechItems.ARTIFICIAL_GOLD_BLOCK };
	public final static ItemStack[] ROCKET_ANTENNA = { ClayTechItems.CLAY_FUSION_INGOT, ClayTechItems.CLAY_FUSION_INGOT,
			ClayTechItems.CLAY_FUSION_INGOT, ClayTechItems.CLAY_FUSION_INGOT, SlimefunItems.COPPER_WIRE,
			ClayTechItems.CLAY_FUSION_INGOT, ClayTechItems.CLAY_FUSION_INGOT, ClayTechItems.CLAY_FUSION_INGOT,
			ClayTechItems.CLAY_FUSION_INGOT };
	public final static ItemStack[] ROCKET_CPU = { ClayTechItems.CLAY_FUSION_INGOT,
			ClayTechItems.TEMPERATURE_RESISTANCE_OBSIDIAN, ClayTechItems.CLAY_FUSION_INGOT,
			ClayTechItems.ROCKET_ANTENNA, SlimefunItems.PROGRAMMABLE_ANDROID_3, ClayTechItems.ROCKET_ANTENNA,
			ClayTechItems.ROCKET_ENGINE_SHELL, ClayTechItems.ROCKET_ENGINE_SHELL, ClayTechItems.ROCKET_ENGINE_SHELL };
	public final static ItemStack[] ROCKET_CONTROL_CORE = { ClayTechItems.ARTIFICIAL_GOLD_BLOCK,
			ClayTechItems.ARTIFICIAL_GOLD_BLOCK, ClayTechItems.ARTIFICIAL_GOLD_BLOCK, ClayTechItems.ROCKET_ENGINE_SHELL,
			ClayTechItems.ROCKET_CPU, ClayTechItems.ROCKET_ENGINE_SHELL, ClayTechItems.TEMPERATURE_RESISTANCE_OBSIDIAN,
			ClayTechItems.TEMPERATURE_RESISTANCE_OBSIDIAN, ClayTechItems.TEMPERATURE_RESISTANCE_OBSIDIAN };
	public final static ItemStack[] ROCKET_FUEL_TANK = { ClayTechItems.FUEL_TANK, ClayTechItems.FUEL_TANK,
			ClayTechItems.FUEL_TANK, ClayTechItems.FUEL_TANK, ClayTechItems.TEMPERATURE_RESISTANCE_OBSIDIAN,
			ClayTechItems.FUEL_TANK, ClayTechItems.FUEL_TANK, ClayTechItems.FUEL_TANK, ClayTechItems.FUEL_TANK };
	public final static ItemStack[] ROCKET_GLASS = { SlimefunItems.WITHER_PROOF_GLASS, SlimefunItems.WITHER_PROOF_GLASS,
			SlimefunItems.WITHER_PROOF_GLASS, SlimefunItems.WITHER_PROOF_GLASS, SlimefunItems.STEEL_PLATE,
			SlimefunItems.WITHER_PROOF_GLASS, SlimefunItems.WITHER_PROOF_GLASS, SlimefunItems.WITHER_PROOF_GLASS,
			SlimefunItems.WITHER_PROOF_GLASS };
	public final static ItemStack[] ROCKET_STEEL_PLATE = { ClayTechItems.CLAY_FUSION_INGOT, null,
			ClayTechItems.CLAY_FUSION_INGOT, ClayTechItems.CLAY_FUSION_INGOT,
			ClayTechItems.TEMPERATURE_RESISTANCE_OBSIDIAN, ClayTechItems.CLAY_FUSION_INGOT,
			ClayTechItems.CLAY_FUSION_INGOT, null, ClayTechItems.CLAY_FUSION_INGOT };
	public final static ItemStack[] MIXED_ROCKET_FUEL = { ClayTechItems.CLAY_FUEL, ClayTechItems.CLAY_FUEL,
			ClayTechItems.CLAY_FUEL, SlimefunItems.URANIUM, SlimefunItems.URANIUM, SlimefunItems.URANIUM,
			SlimefunItems.NETHER_ICE, SlimefunItems.NETHER_ICE, SlimefunItems.NETHER_ICE };

	public final static ItemStack[] ROCKET_1 = { ClayTechItems.ROCKET_GLASS, ClayTechItems.ROCKET_FUEL_TANK,
			ClayTechItems.ROCKET_GLASS, ClayTechItems.ROCKET_STEEL_PLATE, ClayTechItems.ROCKET_CONTROL_CORE,
			ClayTechItems.ROCKET_STEEL_PLATE, ClayTechItems.ROCKET_STEEL_PLATE, ClayTechItems.ROCKET_ENGINE,
			ClayTechItems.ROCKET_STEEL_PLATE };

	public final static ItemStack[] OXYGEN_TANK = { ClayTechItems.CLAY_FUSION_INGOT, ClayTechItems.CLAY_FUSION_INGOT,
			ClayTechItems.CLAY_FUSION_INGOT, ClayTechItems.CLAY_FUSION_INGOT, ClayTechItems.CLAY_STICK,
			ClayTechItems.CLAY_FUSION_INGOT, ClayTechItems.CLAY_FUSION_INGOT, ClayTechItems.CLAY_FUSION_INGOT,
			ClayTechItems.CLAY_FUSION_INGOT };
	public final static ItemStack[] SPACESUIT_OXYGEN_TANK = { ClayTechItems.OXYGEN_TANK, ClayTechItems.OXYGEN_TANK,
			ClayTechItems.OXYGEN_TANK, ClayTechItems.OXYGEN_TANK, ClayTechItems.TEMPERATURE_RESISTANCE_OBSIDIAN,
			ClayTechItems.OXYGEN_TANK, ClayTechItems.OXYGEN_TANK, ClayTechItems.OXYGEN_TANK,
			ClayTechItems.OXYGEN_TANK };
	public final static ItemStack[] SPACESUIT_HELMET = { SlimefunItems.PLASTIC_SHEET, SlimefunItems.PLASTIC_SHEET,
			SlimefunItems.PLASTIC_SHEET, SlimefunItems.PLASTIC_SHEET, ClayTechItems.SPACESUIT_OXYGEN_TANK,
			SlimefunItems.PLASTIC_SHEET, null, null, null };
	public final static ItemStack[] SPACESUIT_CHESTPLATE = { SlimefunItems.PLASTIC_SHEET,
			ClayTechItems.SPACESUIT_OXYGEN_TANK, SlimefunItems.PLASTIC_SHEET, SlimefunItems.PLASTIC_SHEET,
			SlimefunItems.PLASTIC_SHEET, SlimefunItems.PLASTIC_SHEET, SlimefunItems.PLASTIC_SHEET,
			SlimefunItems.PLASTIC_SHEET, SlimefunItems.PLASTIC_SHEET };
	public final static ItemStack[] SPACESUIT_LEGGINGS = { SlimefunItems.PLASTIC_SHEET, SlimefunItems.PLASTIC_SHEET,
			SlimefunItems.PLASTIC_SHEET, SlimefunItems.PLASTIC_SHEET, ClayTechItems.SPACESUIT_OXYGEN_TANK,
			SlimefunItems.PLASTIC_SHEET, SlimefunItems.PLASTIC_SHEET, null, SlimefunItems.PLASTIC_SHEET };
	public final static ItemStack[] SPACESUIT_BOOTS = { SlimefunItems.PLASTIC_SHEET, null, SlimefunItems.PLASTIC_SHEET,
			SlimefunItems.PLASTIC_SHEET, ClayTechItems.SPACESUIT_OXYGEN_TANK, SlimefunItems.PLASTIC_SHEET, null, null,
			null };
	public final static ItemStack[] KREEP_INGOT = { null, null, null, null, ClayTechItems.KREEP_ROCK, null, null, null,
			null };
}
