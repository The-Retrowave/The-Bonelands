package com.mrretro.bonelands.item;

import com.mrretro.bonelands.TheBonelands;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TheBonelands.MODID);


    public static final RegistryObject<Item> Reinforced_Bone_Shard = ITEMS.register("reinforced_bone_shard",
            () -> new Item(new Item.Properties().stacksTo(24)));
    public static final RegistryObject<Item> Raw_Cursed_Gem = ITEMS.register("raw_cursed_gem",
            () -> new Item(new Item.Properties().stacksTo(24)));
    public static final RegistryObject<Item> Cursed_Gem = ITEMS.register("cursed_gem",
            () -> new Item(new Item.Properties().stacksTo(24)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
