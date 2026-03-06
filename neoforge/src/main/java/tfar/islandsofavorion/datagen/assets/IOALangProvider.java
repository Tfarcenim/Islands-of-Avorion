package tfar.islandsofavorion.datagen.assets;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import tfar.islandsofavorion.IslandsOfAvorion;

public class IOALangProvider extends LanguageProvider {
    public IOALangProvider(PackOutput output) {
        super(output, IslandsOfAvorion.MOD_ID,"en_us");
    }

    @Override
    protected void addTranslations() {

    }
}
