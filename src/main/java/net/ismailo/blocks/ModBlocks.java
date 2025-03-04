package net.ismailo.blocks;

import net.ismailo.TestMod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    // Create a Deferred Register to hold Blocks which will all be registered under the "testmod" namespace
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(TestMod.MODID);

    public static void register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
    }
}
