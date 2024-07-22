package net.alin.randommod.item;

import net.alin.randommod.RandomMod;
import net.alin.randommod.item.custom.FuelItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RandomMod.MOD_ID);

    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HIGH_CARBON_COAL = ITEMS.register("high_carbon_coal",
            () -> new FuelItem(new Item.Properties(), 2000));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
