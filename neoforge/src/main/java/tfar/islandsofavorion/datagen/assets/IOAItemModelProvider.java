package tfar.islandsofavorion.datagen.assets;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import tfar.islandsofavorion.IslandsOfAvorion;
import tfar.islandsofavorion.MaterialGroup;
import tfar.islandsofavorion.SecondMaterialGroup;
import tfar.islandsofavorion.world.IOAItems;

public class IOAItemModelProvider extends ItemModelProvider {
    public IOAItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, IslandsOfAvorion.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for (MaterialGroup materialGroup : MaterialGroup.MATERIAL_GROUPS) {
            generatedItem(materialGroup.arrow());
            generatedItem(materialGroup.bar());
            generatedItem(materialGroup.harvestingKnife());
            generatedItem(materialGroup.hatchet());
            generatedItem(materialGroup.kiteshield());
            generatedItem(materialGroup.longsword());
            generatedItem(materialGroup.needle());
            generatedItem(materialGroup.rawOre());
            generatedItem(materialGroup.pickaxe());
            generatedItem(materialGroup.armorGroup().helmet().get());
            generatedItem(materialGroup.armorGroup().chest().get());
            generatedItem(materialGroup.armorGroup().leggings().get());
            generatedItem(materialGroup.armorGroup().boots().get());
            generatedItem(materialGroup.smithingHammer());
            generatedItem(materialGroup.spear());
            generatedItem(materialGroup.warAxe());
        }

        for (SecondMaterialGroup materialGroup : SecondMaterialGroup.SECOND_MATERIAL_GROUPS) {
            generatedItem(materialGroup.shortbow().get());
            generatedItem(materialGroup.staff().get());
        }

        generatedItem(IOAItems.HEADLESS_ARROW);

        generatedItem(IOAItems.ANCIENT_SLAG);
        generatedItem(IOAItems.COIN);
        generatedItem(IOAItems.POOR_SLAG);
        generatedItem(IOAItems.RICH_SLAG);
    }
    protected void simpleBlockItem(Item item, ResourceLocation loc) {
        String s = BuiltInRegistries.ITEM.getKey(item).toString();
        getBuilder(s)
                .parent(getExistingFile(loc));
    }

    protected String name(Item item) {
        return BuiltInRegistries.ITEM.getKey(item).getPath();
    }

    protected void simpleBlockItem(Item item) {
        simpleBlockItem(item, modLoc("block/" + name(item)));
    }


    private void generatedItem(Item item, ResourceLocation texture) {
        String path = name(item);
        singleTexture(path, mcLoc("item/generated"),
                "layer0", texture);
    }

    private void generatedItem(Item item) {
        generatedItem(item, modLoc("item/" + name(item)));
    }

    private void generatedItemBlockTexture(Item item) {
        generatedItem(item, modLoc("block/" + name(item)));
    }
}
