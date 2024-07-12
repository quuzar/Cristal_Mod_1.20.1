package net.mrquuzar.cristal_mod.Item;


import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.mrquuzar.cristal_mod.CristalMod;
import net.mrquuzar.cristal_mod.block.ModBlocks;

public class ModCreativeModTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MDOE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CristalMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CRISTAL_TAB = CREATIVE_MDOE_TABS.register("cristal_tab",
            () -> CreativeModeTab
                    .builder()
                    .icon(()-> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.cristal_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.RUBY.get());
                        pOutput.accept(ModItems.AMETHYST.get());
                        pOutput.accept(ModItems.BRILLIANT.get());

                        pOutput.accept(ModItems.BLOODY_RUBY.get());

                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());
                        pOutput.accept(ModItems.METAL_DETECTOR.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                        pOutput.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());
                    })
                    .build());


    public static void register(IEventBus eventBus)
    {
        CREATIVE_MDOE_TABS.register(eventBus);
    }
}
