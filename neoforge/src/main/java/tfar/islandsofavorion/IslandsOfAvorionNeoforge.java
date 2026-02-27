package tfar.islandsofavorion;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.RegisterEvent;
import tfar.islandsofavorion.datagen.IOADatagen;
import tfar.islandsofavorion.world.IOABlocks;
import tfar.islandsofavorion.world.IOACreativeTabs;
import tfar.islandsofavorion.world.IOAItems;

@Mod(IslandsOfAvorion.MOD_ID)
public class IslandsOfAvorionNeoforge {

    public IslandsOfAvorionNeoforge(IEventBus eventBus) {
        eventBus.addListener(this::register);
        eventBus.addListener(IOADatagen::gather);
        // This method is invoked by the NeoForge mod loader when it is ready
        // to load your mod. You can access NeoForge and Common code in this
        // project.

        // Use NeoForge to bootstrap the Common mod.
        IslandsOfAvorion.init();

    }

    void register(RegisterEvent event) {
        IOABlocks.init();
        IOAItems.init();
        IOACreativeTabs.init();
    }
}