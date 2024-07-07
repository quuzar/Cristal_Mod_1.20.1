package net.mrquuzar.cristal_mod.event;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModEvents {

    public static void register(IEventBus eventBus) {
        eventBus.register(new BlockTransformEvent());
    }
}
