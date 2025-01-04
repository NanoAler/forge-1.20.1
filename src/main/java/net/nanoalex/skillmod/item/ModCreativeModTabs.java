package net.nanoalex.skillmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.nanoalex.skillmod.SkillMod;

public class ModCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SkillMod.MOD_ID);


    public static final RegistryObject<CreativeModeTab> SKILLMOD_TAB = CREATIVE_MODE_TABS.register("skillmod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GOLDENCOIN.get()))
                    .title(Component.translatable("creativetab.tutorial_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.GOLDENCOIN.get());
                        pOutput.accept(ModItems.SILVERCOIN.get());
                        pOutput.accept(ModItems.EMERALDCOIN.get());
                        pOutput.accept(ModItems.CREAM.get());


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
