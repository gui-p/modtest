package net.heron.tutorialmod.datagen;

import net.heron.tutorialmod.TutorialMod;
import net.heron.tutorialmod.items.ModItems;
import net.heron.tutorialmod.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemConditionType;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider
{
    public ModGlobalLootModifiersProvider(PackOutput output)
    {
        super(output, TutorialMod.MOD_ID);
    }

    @Override
    protected void start()
    {
        add("sapphire_from_zombies", new AddItemModifier(new LootItemCondition[]{
            new LootTableIdCondition.Builder(new ResourceLocation("entities/zombie")).build()
        }, ModItems.ITEM_SAPPHIRE.get()));
    }
}
