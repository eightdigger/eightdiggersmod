package net.eightdigger.tutorialmod.item;

import net.eightdigger.tutorialmod.TutorialMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> GRILLED_CHEESE = ITEMS.register("grilled_cheese",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
