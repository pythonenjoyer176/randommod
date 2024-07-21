package net.alin.randommod.item.custom;

import net.alin.randommod.RandomMod;
import net.alin.randommod.item.ModItems;
import net.alin.randommod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier Steel = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1300, 7f, 3f, 20,
                    ModTags.Blocks.NEEDS_STEEL_TOOL, () -> Ingredient.of(ModItems.KATANA.get())),
            new ResourceLocation(RandomMod.MOD_ID, "steel"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
}
