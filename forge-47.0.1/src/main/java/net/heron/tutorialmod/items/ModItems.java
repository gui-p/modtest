package net.heron.tutorialmod.items;

import net.heron.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEM_DEFERRED_REGISTER =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public  static  final RegistryObject<Item> ITEM_SAPPHIRE =
            ITEM_DEFERRED_REGISTER.register("sapphire",
                    () -> new Item(new Item.Properties()));

    public  static  final RegistryObject<Item> ITEM_SAPPHIRE_WAND =
            ITEM_DEFERRED_REGISTER.register("sapphire_wand",
                    () -> new Item(new Item.Properties()));

    public  static  final RegistryObject<Item> ITEM_COXINHA =
            ITEM_DEFERRED_REGISTER.register("coxinha",
                    () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus)
    {
        ITEM_DEFERRED_REGISTER.register(eventBus);
    }

}
