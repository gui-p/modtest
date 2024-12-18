package net.heron.tutorialmod.loot;


import net.heron.tutorialmod.TutorialMod;
import net.heron.tutorialmod.datagen.ModGlobalLootModifiersProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.data.DataGenerator;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid= TutorialMod.MOD_ID, bus= Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        DataGenerator dataGenerator = event.getGenerator();
        PackOutput packOutput = dataGenerator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProviders = event.getLookupProvider();

        dataGenerator.addProvider(event.includeServer(), new ModGlobalLootModifiersProvider(packOutput));
    }

}
