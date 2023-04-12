package com.mrretro.bonelands.block;

import com.mrretro.bonelands.TheBonelands;
import com.mrretro.bonelands.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS=
            DeferredRegister.create(ForgeRegistries.BLOCKS, TheBonelands.MODID);
public static final RegistryObject<Block> REINFORCED_BONE_BLOCK = registrBlock("reinforced_bone_block",
        () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()));
public static final RegistryObject<Block> CURSED_ROCK = registrBlock("cursed_rock",
        () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()));
public static final RegistryObject<Block> CURSED_ROCK_ORE = registrBlock("cursed_rock_ore",
        () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()));




private static <T extends Block> RegistryObject<T> registrBlock(String name, Supplier<T> block){
    RegistryObject<T> toReturn = BLOCKS.register(name,block);
    registerBlockItem(name, toReturn);
    return toReturn;

}

private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
    return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
}


    public static void registor(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
