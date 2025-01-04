package net.nanoalex.skillmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nanoalex.skillmod.SkillMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SkillMod.MOD_ID);

    public static final RegistryObject<Item> CREAM = ITEMS.register("medicine_cream",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLDENCOIN = ITEMS.register("golden_coin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMERALDCOIN = ITEMS.register("emerald_coin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVERCOIN = ITEMS.register("silver_coin",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}