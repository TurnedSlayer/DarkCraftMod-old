package com.turnedslayer.darkcraft.help;

import com.turnedslayer.darkcraft.items.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;


public class ItemHelper
{
    //Items
    public static Item BluesteelHelmet;
    public static Item BluesteelChest;
    public static Item BluesteelLeggings;
    public static Item BluesteelBoots;
    public static Item BluesteelPickaxe;
    public static Item BluesteelAxe;
    public static Item BluesteelSword;
    public static Item BluesteelShovel;
    public static Item BluesteelHoe;
    public static Item ItemDarkGem;
    public static Item ItemBluesteelIngot;
    public static Item ItemDiamondInfusedBluesteelIngot;
    public static Item ItemChargedIngot;
    static ItemArmor.ArmorMaterial BluesteelArmorMaterial = EnumHelper.addArmorMaterial("BluesteelArmorMaterial", 50, new int[]{6, 16, 12, 6}, 30);






    public static void init()
    {
        //Armor
        BluesteelHelmet = new com.turnedslayer.darkcraft.items.armour.BluesteelHelmet(BluesteelArmorMaterial, 0);
        BluesteelChest = new com.turnedslayer.darkcraft.items.armour.BluesteelChest(BluesteelArmorMaterial, 1);
        BluesteelLeggings = new com.turnedslayer.darkcraft.items.armour.BluesteelLeggings(BluesteelArmorMaterial, 2);
        BluesteelBoots = new com.turnedslayer.darkcraft.items.armour.BluesteelBoots(BluesteelArmorMaterial, 3);
        ItemBluesteelIngot = new ItemBluesteelIngot();
        ItemDiamondInfusedBluesteelIngot = new ItemDiamondInfusedBluesteelIngot();
        ItemChargedIngot = new ItemChargedIngot();
        ItemDarkGem = new ItemDarkGem();
        BluesteelHelmet = new com.turnedslayer.darkcraft.items.armour.BluesteelHelmet(BluesteelArmorMaterial, 0);
        GameRegistry.registerItem(BluesteelHelmet, "Bluesteel Helmet");
        BluesteelChest = new com.turnedslayer.darkcraft.items.armour.BluesteelChest(BluesteelArmorMaterial, 1);
        GameRegistry.registerItem(BluesteelChest, "Bluesteel Chest");
        BluesteelLeggings = new com.turnedslayer.darkcraft.items.armour.BluesteelLeggings(BluesteelArmorMaterial, 2);
        GameRegistry.registerItem(BluesteelLeggings, "Bluesteel Leg");
        BluesteelBoots = new com.turnedslayer.darkcraft.items.armour.BluesteelBoots(BluesteelArmorMaterial, 3);
        GameRegistry.registerItem(BluesteelBoots, "Bluesteel Boots");


    }


    public static void register(ItemDarkCraft item)
    {
        GameRegistry.registerItem(item, item.getUnwrappedUnlocalizedName(item.getUnlocalizedName()));
    }



}