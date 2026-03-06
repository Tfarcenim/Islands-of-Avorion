package tfar.islandsofavorion.world;

import net.minecraft.world.item.*;
import tfar.islandsofavorion.IslandsOfAvorion;
import tfar.islandsofavorion.MaterialGroup;
import tfar.islandsofavorion.SecondMaterialGroup;
import tfar.islandsofavorion.world.item.MaterialArrowItem;

import java.util.ArrayList;
import java.util.List;

public class IOAItems {

    public static final List<Item> ALL_ITEMS = new ArrayList<>();

    public static final Item HEADLESS_ARROW = register("headless_arrow",new Item(new Item.Properties()));

    //silver and plat

    //arrows, longswords
    static {
        for (MaterialGroup materialGroup : MaterialGroup.MATERIAL_GROUPS) {
            materialGroup.arrow();
            materialGroup.longsword();
            materialGroup.rawOre();
        }
        for (SecondMaterialGroup materialGroup : SecondMaterialGroup.SECOND_MATERIAL_GROUPS) {
            materialGroup.shortbow().get();//triggers registration
            materialGroup.staff().get();
        }
    }

    //fiber plants
    public static final Item BLIGHTLEAF = register("blightleaf",new Item(new Item.Properties()));
    public static final Item BRYLL = register("bryll",new Item(new Item.Properties()));
    public static final Item DUSKWEED = register("duskweed",new Item(new Item.Properties()));
    public static final Item ECTOGRASS = register("ectograss",new Item(new Item.Properties()));
    public static final Item ROSEBLOOD = register("roseblood",new Item(new Item.Properties()));
    public static final Item RUNELEAF = register("runeleaf",new Item(new Item.Properties()));
    public static final Item SALVE_NETTLES = register("salve_nettles",new Item(new Item.Properties()));
    public static final Item SOULBELL = register("soulbell",new Item(new Item.Properties()));
    public static final Item SPIRITBLOOM = register("spiritbloom",new Item(new Item.Properties()));
    public static final Item WILDERCRESS = register("wildercress",new Item(new Item.Properties()));


    //misc
    public static final Item ANCIENT_SLAG = register("ancient_slag",new Item(new Item.Properties()));
    public static final Item COIN = register("coin",new Item(new Item.Properties()));
    public static final Item POOR_SLAG = register("poor_slag",new Item(new Item.Properties()));
    public static final Item RICH_SLAG = register("rich_slag",new Item(new Item.Properties()));
    //weapons


    public static void init() {

    }

    public static <I extends Item> I register(String key, I item) {
        ALL_ITEMS.add(item);
        return (I) Items.registerItem(IslandsOfAvorion.id(key),item);
    }

}
