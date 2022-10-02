package net.diamonddev.dialabs.registry;

import net.diamonddev.dialabs.api.Identifier;
import net.diamonddev.dialabs.block.DiscBurnerBlock;
import net.diamonddev.dialabs.block.EnchantmentSynthesizerBlock;
import net.diamonddev.dialabs.block.SyntheticEnchantmentTomeBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

import static net.diamonddev.dialabs.block.SyntheticEnchantmentTomeBlock.TOME_ITEM_SETTINGS;

public class InitBlocks {



    public static Block STATICITE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(10F).requiresTool());
    public static Block SHOCKED_IRON_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(18F).requiresTool().luminance(2));
    public static EnchantmentSynthesizerBlock ENCHANTMENT_SYNTHESIZER = new EnchantmentSynthesizerBlock();
    public static DiscBurnerBlock DISC_BURNER = new DiscBurnerBlock();

    public static final SyntheticEnchantmentTomeBlock ASPECTION_TOME = new SyntheticEnchantmentTomeBlock("aspection");
    public static final SyntheticEnchantmentTomeBlock DEFENSE_TOME = new SyntheticEnchantmentTomeBlock("defense");
    public static final SyntheticEnchantmentTomeBlock DESTRUCTIVE_TOME = new SyntheticEnchantmentTomeBlock("destructive");
    public static final SyntheticEnchantmentTomeBlock STRENGTH_TOME = new SyntheticEnchantmentTomeBlock("strength");

    public static void registerBlock() {
        registerBlockWithBlockItem(STATICITE_BLOCK, new Identifier("staticite_block"), new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
        registerBlockWithBlockItem(SHOCKED_IRON_BLOCK, new Identifier("shocked_iron_block"), new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
        registerBlockWithBlockItem(ENCHANTMENT_SYNTHESIZER, new Identifier("enchantment_synthesizer"), new FabricItemSettings().group(ItemGroup.DECORATIONS));
        registerBlockWithBlockItem(DISC_BURNER, new Identifier("disc_burner"), new FabricItemSettings().group(ItemGroup.DECORATIONS));

        registerBlockWithBlockItem(ASPECTION_TOME, new Identifier("aspection_tome"), TOME_ITEM_SETTINGS);
        registerBlockWithBlockItem(DEFENSE_TOME, new Identifier("defense_tome"), TOME_ITEM_SETTINGS);
        registerBlockWithBlockItem(DESTRUCTIVE_TOME, new Identifier("destructive_tome"), TOME_ITEM_SETTINGS);
        registerBlockWithBlockItem(STRENGTH_TOME, new Identifier("strength_tome"), TOME_ITEM_SETTINGS);
    }


    public static void registerBlockWithBlockItem(Block block, Identifier identifier, FabricItemSettings blockItemSettings) {
        Registry.register(Registry.BLOCK, identifier, block);
        Registry.register(Registry.ITEM, identifier, new BlockItem(block, blockItemSettings));
    }
}
