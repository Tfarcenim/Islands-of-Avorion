package tfar.islandsofavorion;

import net.minecraft.core.Holder;
import net.minecraft.world.item.*;
import tfar.islandsofavorion.world.IOAItems;
import tfar.islandsofavorion.world.item.MaterialArrowItem;

import java.util.ArrayList;
import java.util.List;

public final class MaterialGroup {

    private final String name;

    public MaterialGroup(String name, Tier tier, Holder<ArmorMaterial> armorMaterial) {
        this.name = name;
        MATERIAL_GROUPS.add(this);
        this.tier = tier;
        this.armorMaterial = armorMaterial;
    }

    public Tier tier() {
        return tier;
    }

    public String name() {
        return name;
    }

    public Holder<ArmorMaterial> armorMaterial() {
        return armorMaterial;
    }

    private MaterialArrowItem arrow;

    public MaterialArrowItem arrow() {
        if (arrow == null) {
            arrow = IOAItems.register(name+"_arrow",new MaterialArrowItem(new Item.Properties()));
        }
        return arrow;
    }

    private SwordItem longsword;

    public SwordItem longsword() {
        if (longsword == null) {
            longsword = IOAItems.register(name+"_longsword",new SwordItem(tier,new Item.Properties()
                    .attributes(SwordItem.createAttributes(tier,3,-2.4f))));
        }
        return longsword;
    }

    private Item rawOre;
    public Item rawOre() {
        if (rawOre == null) {
            rawOre = IOAItems.register("raw_"+name+"_ore",new Item(new Item.Properties()));
        }
        return rawOre;
    }


    public static final List<MaterialGroup> MATERIAL_GROUPS = new ArrayList<>();

    public static final MaterialGroup ARGONITE = new MaterialGroup("argonite", Tiers.NETHERITE, ArmorMaterials.NETHERITE);
    public static final MaterialGroup BATHUS = new MaterialGroup("bathus", Tiers.NETHERITE, ArmorMaterials.NETHERITE);
    public static final MaterialGroup FRACTITE = new MaterialGroup("fractite", Tiers.NETHERITE, ArmorMaterials.NETHERITE);
    public static final MaterialGroup GORGONITE = new MaterialGroup("gorgonite", Tiers.NETHERITE, ArmorMaterials.NETHERITE);
    public static final MaterialGroup KATAGON = new MaterialGroup("katagon", Tiers.NETHERITE, ArmorMaterials.NETHERITE);
    public static final MaterialGroup KRATONITE = new MaterialGroup("kratonite", Tiers.NETHERITE, ArmorMaterials.NETHERITE);
    public static final MaterialGroup MARMAROS = new MaterialGroup("marmaros", Tiers.NETHERITE, ArmorMaterials.NETHERITE);
    public static final MaterialGroup NOVITE = new MaterialGroup("novite", Tiers.NETHERITE, ArmorMaterials.NETHERITE);
    public static final MaterialGroup PRIMAL = new MaterialGroup("primal", Tiers.NETHERITE, ArmorMaterials.NETHERITE);
    public static final MaterialGroup PROMETHIUM = new MaterialGroup("promethium", Tiers.NETHERITE, ArmorMaterials.NETHERITE);
    public static final MaterialGroup ZEPHYRIUM = new MaterialGroup("zephyrium", Tiers.NETHERITE, ArmorMaterials.NETHERITE);
    private final Tier tier;
    private final Holder<ArmorMaterial> armorMaterial;


}
