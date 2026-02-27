package tfar.islandsofavorion.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.WritableRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.loot.packs.VanillaBlockLoot;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.ProblemReporter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import tfar.islandsofavorion.IslandsOfAvorion;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

class IOALootTableProvider extends LootTableProvider {


    public IOALootTableProvider(PackOutput output, Set<ResourceKey<LootTable>> requiredTables, List<SubProviderEntry> subProviders,
                                CompletableFuture<HolderLookup.Provider> registries) {
        super(output, requiredTables, subProviders, registries);
    }

    public static LootTableProvider create(PackOutput pOutput,CompletableFuture<HolderLookup.Provider> registries) {
        return new IOALootTableProvider(pOutput, BuiltInLootTables.all(),
                List.of(
                        new SubProviderEntry(BlockLoot::new, LootContextParamSets.ENTITY)
                ),registries);
    }

    static class BlockLoot extends VanillaBlockLoot {

        public BlockLoot(HolderLookup.Provider registries) {
            super(registries);
        }

        @Override
        public void generate() {
        }


        @Override
        protected Iterable<Block> getKnownBlocks() {
            return BuiltInRegistries.BLOCK.stream().filter(block -> BuiltInRegistries.BLOCK.getKey(block).getNamespace().equals(IslandsOfAvorion.MOD_ID))
                    .toList();
        }
    }

    @Override
    protected void validate(WritableRegistry<LootTable> writableregistry, ValidationContext validationcontext, ProblemReporter.Collector problemreporter$collector) {

    }
}
