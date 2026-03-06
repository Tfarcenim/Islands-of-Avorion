package tfar.islandsofavorion;

import net.minecraft.core.Holder;
import net.minecraft.world.item.*;
import tfar.islandsofavorion.util.ArmorGroup;
import tfar.islandsofavorion.world.IOAItems;
import tfar.islandsofavorion.world.item.MaterialArrowItem;

import java.util.ArrayList;
import java.util.List;

public final class MaterialGroup {

    private final String name;
    private final ArmorGroup armorGroup;

    public MaterialGroup(String name, Tier tier, Holder<ArmorMaterial> armorMaterial) {
        this.name = name;
        MATERIAL_GROUPS.add(this);
        this.tier = tier;
        this.armorMaterial = armorMaterial;
        armorGroup = new ArmorGroup(name,armorMaterial);
    }

    public Tier tier() {
        return tier;
    }

    public String name() {
        return name;
    }

    //this registers everything
    public void init() {
        arrow();
        bar();
        harvestingKnife();
        hatchet();
        needle();
        kiteshield();
        longsword();
        rawOre();
        pickaxe();
        smithingHammer();
        armorGroup.init();
        spear();
        warAxe();
    }

    public ArmorGroup armorGroup() {
        return armorGroup;
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

    private Item bar;
    public Item bar() {
        if (bar == null) {
            bar = IOAItems.register(name+"_bar",new Item(new Item.Properties()));
        }
        return bar;
    }

    private Item harvestingKnife;
    public Item harvestingKnife() {
        if (harvestingKnife == null) {
            harvestingKnife = IOAItems.register(name+"_harvesting_knife",new Item(new Item.Properties()));
        }
        return harvestingKnife;
    }

    private Item hatchet;
    public Item hatchet() {
        if (hatchet == null) {
            hatchet = IOAItems.register(name+"_hatchet",new Item(new Item.Properties()));
        }
        return hatchet;
    }

    private Item kiteshield;
    public Item kiteshield() {
        if (kiteshield == null) {
            kiteshield = IOAItems.register(name+"_kiteshield",new Item(new Item.Properties()));
        }
        return kiteshield;
    }

    private SwordItem longsword;

    public SwordItem longsword() {
        if (longsword == null) {
            longsword = IOAItems.register(name+"_longsword",new SwordItem(tier,new Item.Properties()
                    .attributes(SwordItem.createAttributes(tier,3,-2.4f))));
        }
        return longsword;
    }

    private Item needle;
    public Item needle() {
        if (needle == null) {
            needle = IOAItems.register(name+"_needle",new Item(new Item.Properties()));
        }
        return needle;
    }

    private Item rawOre;
    public Item rawOre() {
        if (rawOre == null) {
            rawOre = IOAItems.register("raw_"+name+"_ore",new Item(new Item.Properties()));
        }
        return rawOre;
    }

    private Item pickaxe;
    public Item pickaxe() {
        if (pickaxe == null) {
            pickaxe = IOAItems.register(name+"_pickaxe",new Item(new Item.Properties()));
        }
        return pickaxe;
    }

    private Item smithingHammer;
    public Item smithingHammer() {
        if (smithingHammer == null) {
            smithingHammer = IOAItems.register(name+"_smithing_hammer",new Item(new Item.Properties()));
        }
        return smithingHammer;
    }

    private Item spear;
    public Item spear() {
        if (spear == null) {
            spear = IOAItems.register(name+"_spear",new Item(new Item.Properties()));
        }
        return pickaxe;
    }

    private Item warAxe;
    public Item warAxe() {
        if (warAxe == null) {
            warAxe = IOAItems.register(name+"_war_axe",new Item(new Item.Properties()));
        }
        return warAxe;
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
