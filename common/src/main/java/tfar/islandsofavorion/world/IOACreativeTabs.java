package tfar.islandsofavorion.world;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import tfar.islandsofavorion.IslandsOfAvorion;

public class IOACreativeTabs {
    public static final CreativeModeTab MAIN = register("main",CreativeModeTab.builder(null,-1)
            .title(Component.translatable("Main"))
            .icon(IOAItems.PRIMAL_ARROW::getDefaultInstance)
            .displayItems((parameters, output) -> {
                for (Item item : IOAItems.ALL_ITEMS) {
                    output.accept(item);
                }
            })
            .build());

    private static CreativeModeTab register(String name,CreativeModeTab tab) {
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, IslandsOfAvorion.id(name),tab);
    }

    public static void init(){

    }

}
