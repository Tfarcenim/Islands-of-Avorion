package tfar.islandsofavorion.util;

import com.google.common.base.Suppliers;
import net.minecraft.core.Holder;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import tfar.islandsofavorion.world.IOAItems;

import java.util.function.Supplier;

public record ArmorGroup(String name, Holder<ArmorMaterial> armorMaterial, Supplier<ArmorItem> helmet,
                         Supplier<ArmorItem> chest, Supplier<ArmorItem> leggings, Supplier<ArmorItem> boots) {

    public ArmorGroup(String name,Holder<ArmorMaterial> armorMaterial) {
        this(name,armorMaterial,createArmor(name,armorMaterial, ArmorItem.Type.HELMET),
                createArmor(name,armorMaterial, ArmorItem.Type.CHESTPLATE),
                createArmor(name,armorMaterial, ArmorItem.Type.LEGGINGS),
                createArmor(name,armorMaterial, ArmorItem.Type.BOOTS));
    }

    //        DIAMOND_HELMET = registerItem((String)"diamond_helmet", new ArmorItem(ArmorMaterials.DIAMOND, net.minecraft.world.item.ArmorItem.Type.HELMET, (new Item.Properties()).durability(net.minecraft.world.item.ArmorItem.Type.HELMET.getDurability(33))));
    //        DIAMOND_CHESTPLATE = registerItem((String)"diamond_chestplate", new ArmorItem(ArmorMaterials.DIAMOND, net.minecraft.world.item.ArmorItem.Type.CHESTPLATE, (new Item.Properties()).durability(net.minecraft.world.item.ArmorItem.Type.CHESTPLATE.getDurability(33))));
    //        DIAMOND_LEGGINGS = registerItem((String)"diamond_leggings", new ArmorItem(ArmorMaterials.DIAMOND, net.minecraft.world.item.ArmorItem.Type.LEGGINGS, (new Item.Properties()).durability(net.minecraft.world.item.ArmorItem.Type.LEGGINGS.getDurability(33))));
    //        DIAMOND_BOOTS = registerItem((String)"diamond_boots", new ArmorItem(ArmorMaterials.DIAMOND, net.minecraft.world.item.ArmorItem.Type.BOOTS, (new Item.Properties()).durability(net.minecraft.world.item.ArmorItem.Type.BOOTS.getDurability(33))));

    public void init() {
        helmet.get();
        chest.get();
        leggings.get();
        boots.get();
    }

    

    static Supplier<ArmorItem> createArmor(String name,Holder<ArmorMaterial> armorMaterial,ArmorItem.Type type) {
        return Suppliers.memoize(()-> IOAItems.register(name+"_plate_"+type.getSerializedName(),new ArmorItem(armorMaterial,type,new Item.Properties()
                .durability(type.getDurability(33)))));
    }
}
