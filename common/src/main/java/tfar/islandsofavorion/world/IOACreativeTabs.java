package tfar.islandsofavorion.world;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import tfar.islandsofavorion.IslandsOfAvorion;
import tfar.islandsofavorion.MaterialGroup;

public class IOACreativeTabs {
    public static final CreativeModeTab MAIN = register("main",CreativeModeTab.builder(null,-1)
            .title(Component.translatable("Main"))
            .icon(IOAItems.PRIMAL_ARROW::getDefaultInstance)
            .displayItems((parameters, output) -> {
                for (MaterialGroup materialGroup : MaterialGroup.MATERIAL_GROUPS) {
                    output.accept(materialGroup.arrow().get());
                }
            })
            .build());

    private static CreativeModeTab register(String name,CreativeModeTab tab) {
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, IslandsOfAvorion.id(name),tab);
    }

    public static void init(){

    }

}
