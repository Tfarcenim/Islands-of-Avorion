package tfar.islandsofavorion.datagen.assets;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import tfar.islandsofavorion.IslandsOfAvorion;

public class IOABlockStateProvider extends BlockStateProvider {
    public IOABlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, IslandsOfAvorion.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

    }
}
