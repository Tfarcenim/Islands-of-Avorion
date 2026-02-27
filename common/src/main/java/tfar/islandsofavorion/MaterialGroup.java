package tfar.islandsofavorion;

import com.google.common.base.Suppliers;
import net.minecraft.world.item.Item;
import tfar.islandsofavorion.world.IOAItems;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public record MaterialGroup(Supplier<Item> arrow) {

    public MaterialGroup {
        MATERIAL_GROUPS.add(this);
    }

    public static final List<MaterialGroup> MATERIAL_GROUPS = new ArrayList<>();

    public static final MaterialGroup ARGONITE = new MaterialGroup(() -> IOAItems.ARGONITE_ARROW);
    public static final MaterialGroup BATHUS = new MaterialGroup(() -> IOAItems.BATHUS_ARROW);
    public static final MaterialGroup FRACTITE = new MaterialGroup(() -> IOAItems.FRACTITE_ARROW);
    public static final MaterialGroup GORGONITE = new MaterialGroup(() -> IOAItems.GORGONITE_ARROW);
    public static final MaterialGroup HEADLESS = new MaterialGroup(() -> IOAItems.HEADLESS_ARROW);
    public static final MaterialGroup KATAGON = new MaterialGroup(() -> IOAItems.KATAGON_ARROW);
    public static final MaterialGroup KRATONITE = new MaterialGroup(() -> IOAItems.KRATONITE_ARROW);
    public static final MaterialGroup MARMAROS = new MaterialGroup(() -> IOAItems.MARMAROS_ARROW);
    public static final MaterialGroup NOVITE = new MaterialGroup(Suppliers.memoize(() -> IOAItems.NOVITE_ARROW));
    public static final MaterialGroup PRIMAL = new MaterialGroup(Suppliers.memoize(() -> IOAItems.PRIMAL_ARROW));
    public static final MaterialGroup PROMETHIUM = new MaterialGroup(Suppliers.memoize(() -> IOAItems.PROMENTHIUM_ARROW));
    public static final MaterialGroup ZEPHYRIUM = new MaterialGroup(Suppliers.memoize(() -> IOAItems.ZEPHYRIUM_ARROW));

}
