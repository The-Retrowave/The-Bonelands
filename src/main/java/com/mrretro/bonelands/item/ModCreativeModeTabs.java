package com.mrretro.bonelands.item;

import com.mrretro.bonelands.TheBonelands;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TheBonelands.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs
{
    public static CreativeModeTab  BONELANDS_TAB;
    @SubscribeEvent
    public static void  registerCrativeModeTabs(CreativeModeTabEvent.Register event){
BONELANDS_TAB = event.registerCreativeModeTab(new ResourceLocation(TheBonelands.MODID,"bonelands_tab"),
        builder -> builder.icon(()-> new ItemStack(ModItems.Reinforced_Bone_Shard.get())).title(Component.translatable(
                "creativemodtab.bonelands_tab")));
    }
}
