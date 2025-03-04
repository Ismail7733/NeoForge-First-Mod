package net.ismailo.item;

import net.ismailo.TestMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    // Create a Deferred Register to hold Items which will all be registered under the "testmod" namespace
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TestMod.MODID);

    public static final DeferredItem<Item> BANANA = ITEMS.registerSimpleItem("banana", new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEdible().nutrition(2).saturationModifier(2f).build()));

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}
