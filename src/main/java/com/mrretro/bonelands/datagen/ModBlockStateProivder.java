package com.mrretro.bonelands.datagen;

import com.mrretro.bonelands.TheBonelands;
import com.mrretro.bonelands.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProivder extends BlockStateProvider {
    public ModBlockStateProivder(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TheBonelands.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.CURSED_ROCK);
        blockWithItem(ModBlocks.CURSED_ROCK_ORE);

    }


    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(),cubeAll(blockRegistryObject.get()));
    }

}
