/*
 * MIT License
 *
 * Copyright (c) 2020-2021 shroomdog27
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package net.shonx.copperitems.data;

import java.util.function.Consumer;

import net.shonx.copperitems.CopperItems;
import net.shonx.copperitems.CopperItemsMod;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;

import net.minecraftforge.common.Tags;

public class RecipeGenerator extends RecipeProvider {

    public RecipeGenerator(DataGenerator generator) {
        super(generator);
    }

    @Override
    public String getName() {
        return "SimpleBackpacks Recipe Generator";
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        // @formatter:off
        // Copper Pickaxe
        ShapedRecipeBuilder.shaped(CopperItems.COPPER_PICKAXE.get())
        .define('C', Items.COPPER_INGOT)
        .define('S', Tags.Items.RODS_WOODEN)
        .pattern("CCC")
        .pattern(" S ")
        .pattern(" S ")
        .unlockedBy("has_item", has(Items.COPPER_INGOT))
        .save(consumer, CopperItemsMod.of("copper_pickaxe"));

        // @formatter:on
    }

}
