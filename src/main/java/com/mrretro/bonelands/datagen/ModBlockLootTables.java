package com.mrretro.bonelands.datagen;

import com.mrretro.bonelands.block.ModBlocks;
import com.mrretro.bonelands.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.REINFORCED_BONE_BLOCK.get());
        dropSelf(ModBlocks.CURSED_ROCK.get());
        add(ModBlocks.CURSED_ROCK_ORE.get(),
                (Block) -> createOreDrop(ModBlocks.CURSED_ROCK_ORE.get(),ModItems.Raw_Cursed_Gem.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
