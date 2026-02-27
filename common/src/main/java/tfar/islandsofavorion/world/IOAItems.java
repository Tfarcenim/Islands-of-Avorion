package tfar.islandsofavorion.world;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import tfar.islandsofavorion.IslandsOfAvorion;
import tfar.islandsofavorion.world.item.MaterialArrowItem;

public class IOAItems {

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

    public static void init() {

    }

    static <I extends Item> I register(String key,I item) {
        return (I) Items.registerItem(IslandsOfAvorion.id(key),item);
    }

}
