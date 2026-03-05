package tfar.islandsofavorion.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import tfar.islandsofavorion.datagen.assets.IOABlockStateProvider;
import tfar.islandsofavorion.datagen.assets.IOAItemModelProvider;
import tfar.islandsofavorion.datagen.data.IOALootTableProvider;
import tfar.islandsofavorion.datagen.data.tag.IOABlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class IOADatagen {
    public static void gather(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        if (event.includeServer()) {
            generator.addProvider(true, IOALootTableProvider.create(packOutput,lookupProvider));
            BlockTagsProvider blockTagsProvider = new IOABlockTagsProvider(packOutput,lookupProvider,existingFileHelper);
            generator.addProvider(true,blockTagsProvider);
        }
        if (event.includeClient()){
            generator.addProvider(true,new IOAItemModelProvider(packOutput,existingFileHelper));
            generator.addProvider(true,new IOABlockStateProvider(packOutput,existingFileHelper));
        }
    }
}
