package com.example.example_mod;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.client.keybinding.FabricKeyBinding;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.potion.PotionUtil;
import net.minecraft.potion.Potions;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraft.util.registry.Registry;

public class ModInit implements ModInitializer {

	private static Block registerBlock(String name, Block block) {
		registerBlock(name, block);
		return Registry.register(Registry.BLOCK, new Identifier(name), block);
	}

	public static final Logger logger = LoggerFactory.getLogger("Foodstuff");
	public static final Item banana = new Item(new Item.Settings().group(ItemGroup.MISC).food(new FoodComponent.Builder().hunger(1).saturationModifier(0.3f).build()));
	public static final Item chocolatebanana = new Item(new Item.Settings().group(ItemGroup.MISC).food(new FoodComponent.Builder().hunger(8).saturationModifier(1f).build()));

	public static final Item chocolate = new Item(new Item.Settings().group(ItemGroup.MISC).food(new FoodComponent.Builder().hunger(4).saturationModifier(2f).build()));

	public static final Item dough = new Item(new Item.Settings().group(ItemGroup.MISC));
	public static final Item doughnut = new Item(new Item.Settings().group(ItemGroup.MISC).food(new FoodComponent.Builder().hunger(4).saturationModifier(2f).build()));

	public static final Item pizza = new Item(new Item.Settings().group(ItemGroup.MISC).food(new FoodComponent.Builder().hunger(4).saturationModifier(2f).build()));

	public static final Item strawberry = new Item(new Item.Settings().group(ItemGroup.MISC).food(new FoodComponent.Builder().hunger(4).saturationModifier(2f).build()));

	public static final Item sushi = new Item(new Item.Settings().group(ItemGroup.MISC).food(new FoodComponent.Builder().hunger(4).saturationModifier(2f).build()));

	public static final Block bananabunch = new Block(AbstractBlock.Settings.of(Material.BAMBOO).breakInstantly());



	@Override
	public void onInitialize(ModContainer mod) {
		logger.info("Mod launched");

		//Add Items
		Registry.register(Registry.ITEM, new Identifier("foodstuff", "banana"), banana);
		Registry.register(Registry.ITEM, new Identifier("foodstuff", "chocolatebanana"), chocolatebanana);
		Registry.register(Registry.ITEM, new Identifier("foodstuff", "chocolate"), chocolate);
		Registry.register(Registry.ITEM, new Identifier("foodstuff", "dough"), dough);
		Registry.register(Registry.ITEM, new Identifier("foodstuff", "doughnut"), doughnut);
		Registry.register(Registry.ITEM, new Identifier("foodstuff", "pizza"), pizza);
		Registry.register(Registry.ITEM, new Identifier("foodstuff", "strawberry"), strawberry);
		Registry.register(Registry.ITEM, new Identifier("foodstuff", "sushi"), sushi);
		Registry.register(Registry.BLOCK, new Identifier("foodstuff", "bananabunch"), bananabunch);
		Registry.register(Registry.ITEM, new Identifier("foodstuff", "bananabunch"), new BlockItem(bananabunch, new Item.Settings().group(ItemGroup.MISC)));

	}
}
