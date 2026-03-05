package tfar.islandsofavorion.world;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import tfar.islandsofavorion.IslandsOfAvorion;
import tfar.islandsofavorion.world.item.MaterialArrowItem;

import java.util.ArrayList;
import java.util.List;

public class IOAItems {

    public static final List<Item> ALL_ITEMS = new ArrayList<>();
    //arrows
    public static final MaterialArrowItem ARGONITE_ARROW = register("argonite_arrow",new MaterialArrowItem(new Item.Properties()));
    public static final MaterialArrowItem BATHUS_ARROW = register("bathus_arrow",new MaterialArrowItem(new Item.Properties()));
    public static final MaterialArrowItem FRACTITE_ARROW = register("fractite_arrow",new MaterialArrowItem(new Item.Properties()));
    public static final MaterialArrowItem GORGONITE_ARROW = register("gorgonite_arrow",new MaterialArrowItem(new Item.Properties()));
    public static final MaterialArrowItem HEADLESS_ARROW = register("headless_arrow",new MaterialArrowItem(new Item.Properties()));
    public static final MaterialArrowItem KATAGON_ARROW = register("katagon_arrow",new MaterialArrowItem(new Item.Properties()));
    public static final MaterialArrowItem KRATONITE_ARROW = register("kratonite_arrow",new MaterialArrowItem(new Item.Properties()));
    public static final MaterialArrowItem MARMAROS_ARROW = register("marmaros_arrow",new MaterialArrowItem(new Item.Properties()));
    public static final MaterialArrowItem NOVITE_ARROW = register("novite_arrow",new MaterialArrowItem(new Item.Properties()));
    public static final MaterialArrowItem PRIMAL_ARROW = register("primal_arrow",new MaterialArrowItem(new Item.Properties()));
    public static final MaterialArrowItem PROMENTHIUM_ARROW = register("promethium_arrow",new MaterialArrowItem(new Item.Properties()));
    public static final MaterialArrowItem ZEPHYRIUM_ARROW = register("zephyrium_arrow",new MaterialArrowItem(new Item.Properties()));

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

    public static void init() {

    }

    static <I extends Item> I register(String key,I item) {
        ALL_ITEMS.add(item);
        return (I) Items.registerItem(IslandsOfAvorion.id(key),item);
    }

}
