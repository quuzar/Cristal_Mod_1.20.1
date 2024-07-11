package net.mrquuzar.cristal_mod.Item;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.common.util.NonNullSupplier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrquuzar.cristal_mod.CristalMod;
import net.mrquuzar.cristal_mod.Item.custom.MetalDetectorItem;
import net.mrquuzar.cristal_mod.block.ModBlocks;

public class ModItems {
    public static  final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CristalMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRILLIANT = ITEMS.register("brilliant",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(100)));
    public static final RegistryObject<Item> BLOODY_RUBY = ITEMS.register("bloody_ruby",
            () -> new Item(new Item.Properties()
                    .rarity(Rarity.EPIC)
            ){
                @Override
                public Component getName(ItemStack stack) {
                    return Component.literal("Кровавый Рубин")
                            .setStyle(Style.EMPTY.withColor(TextColor.fromRgb(0xFF0000)));  // Красный цвет для названия предмета
                }
    });

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
