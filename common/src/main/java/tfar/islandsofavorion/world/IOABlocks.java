package tfar.islandsofavorion.world;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import tfar.islandsofavorion.IslandsOfAvorion;

public class IOABlocks {


    public static void init() {

    }

    public static Block register(String key, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, IslandsOfAvorion.id(key), block);
    }
}
