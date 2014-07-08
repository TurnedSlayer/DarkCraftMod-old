package com.turnedslayer.darkcraft.items.armour;

import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyContainerItem;
import com.turnedslayer.darkcraft.DarkCraft;
import com.turnedslayer.darkcraft.help.ItemHelper;
import com.turnedslayer.darkcraft.libs.References;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

/**
 * Created by TurnedSlayer.
 */
public class BluesteelLeggings extends ItemArmor implements IEnergyContainerItem {

    public EnergyStorage storage = new EnergyStorage(1000);
    protected int energy;
    protected int capacity;

    public BluesteelLeggings(ArmorMaterial material, int armorType)
    {
        super(material, 2 , armorType);
        this.setTextureName(References.MODID + ":" + "/Charged Bluesteel Leggings");
        this.setCreativeTab(DarkCraft.DarkCraftTab);
        this.setUnlocalizedName("BluesteelLeggings");
        this.maxStackSize = 1;
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ItemHelper.BluesteelLeggings)
        {
            return References.MODID + ":" + "textures/models/Charged Bluesteel Layer 2.png";
        }

        else
            System.out.println("Invalid Item Item Bluesteel Armor");
        return null;
    }

    @Override
    public int receiveEnergy(ItemStack container, int maxReceive, boolean simulate) {
        return storage.receiveEnergy(maxReceive, false);
    }

    @Override
    public int extractEnergy(ItemStack container, int maxExtract, boolean simulate) {
        return storage.extractEnergy(maxExtract, false);
    }

    @Override
    public int getEnergyStored(ItemStack container) {
        return storage.getEnergyStored();
    }

    @Override
    public int getMaxEnergyStored(ItemStack container) {
        return storage.getMaxEnergyStored();
    }
}
