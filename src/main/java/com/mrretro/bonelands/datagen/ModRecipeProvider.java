package com.mrretro.bonelands.datagen;

import com.mrretro.bonelands.block.ModBlocks;
import com.mrretro.bonelands.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MinecartItem;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        oreBlasting(consumer, List.of(ModItems.Raw_Cursed_Gem.get()), RecipeCategory.MISC,
                ModItems.Cursed_Gem.get(), 0.7f, 300,"cursed-gem");
         ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.REINFORCED_BONE_BLOCK.get())
                 .define('1', Items.IRON_INGOT.asItem())
                 .define('B', ModItems.Reinforced_Bone_Shard.get())
                 .pattern("1B1")
                 .pattern("BBB")
                 .pattern("1B1")
                 .unlockedBy("has_black_opal", inventoryTrigger(ItemPredicate.Builder.item()
                         .of(ModBlocks.REINFORCED_BONE_BLOCK.get()).build()))
                 .save(consumer);


    }
}
