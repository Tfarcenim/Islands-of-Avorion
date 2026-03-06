package tfar.islandsofavorion;

import com.google.common.base.Suppliers;
import net.minecraft.world.item.Item;
import tfar.islandsofavorion.world.IOAItems;
import tfar.islandsofavorion.world.item.StaffItem;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public record SecondMaterialGroup(String name, Supplier<Item> staff,Supplier<Item> shortbow) {
    public static final List<SecondMaterialGroup> SECOND_MATERIAL_GROUPS = new ArrayList<>();

    public SecondMaterialGroup {
        SECOND_MATERIAL_GROUPS.add(this);
    }

    public SecondMaterialGroup(String name) {
        this(name, Suppliers.memoize(() -> createStaff(name)),Suppliers.memoize(() -> createShortbow(name)));
    }

    public static final SecondMaterialGroup BLOOD_SPINDLE = new SecondMaterialGroup("blood_spindle");
    public static final SecondMaterialGroup BOVISTRANGLER = new SecondMaterialGroup("bovistrangler");
    public static final SecondMaterialGroup CORPSETHORN = new SecondMaterialGroup("corpsethorn");
    public static final SecondMaterialGroup ENTAGALLOW = new SecondMaterialGroup("entagallow");
    public static final SecondMaterialGroup GRAVECREEPER = new SecondMaterialGroup("gravecreeper");
    public static final SecondMaterialGroup SEEPING_ELM = new SecondMaterialGroup("seeping_elm");
    public static final SecondMaterialGroup SPINEBEAM = new SecondMaterialGroup("spinebeam");
    public static final SecondMaterialGroup TANGLE_GUM = new SecondMaterialGroup("tangle_gum");
    public static final SecondMaterialGroup THIGAT = new SecondMaterialGroup("thigat");
    public static final SecondMaterialGroup UTUKU = new SecondMaterialGroup("utuku");

     static Item createStaff(String name) {
        return IOAItems.register(name+"_staff",new StaffItem(new Item.Properties()));
    }

    static Item createShortbow(String name) {
        return IOAItems.register(name+"_shortbow",new Item(new Item.Properties()));
    }
}
