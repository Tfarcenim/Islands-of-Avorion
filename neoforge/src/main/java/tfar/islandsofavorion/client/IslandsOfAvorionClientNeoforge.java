package tfar.islandsofavorion.client;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import tfar.islandsofavorion.IslandsOfAvorion;

@Mod(value = IslandsOfAvorion.MOD_ID, dist = Dist.CLIENT)
public class IslandsOfAvorionClientNeoforge {


    public IslandsOfAvorionClientNeoforge(IEventBus bus) {
        bus.addListener(this::renderers);
    }

    void renderers(final EntityRenderersEvent.RegisterRenderers event) {

    }
}
