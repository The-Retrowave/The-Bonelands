package com.mrretro.bonelands.datagen;

import com.mrretro.bonelands.TheBonelands;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TheBonelands.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Datagenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator Datagen = event.getGenerator();
        PackOutput packOutput = Datagen.getPackOutput();
        ExistingFileHelper FileHelper = event.getExistingFileHelper();
        Datagen.addProvider(true,new ModRecipeProvider(packOutput));
        Datagen.addProvider(true,ModLoottableProvider.create(packOutput));
        Datagen.addProvider(true,new ModBlockStateProivder(packOutput, FileHelper));
        Datagen.addProvider(true,new ModItemModelProvider(packOutput, FileHelper));

    }
}
