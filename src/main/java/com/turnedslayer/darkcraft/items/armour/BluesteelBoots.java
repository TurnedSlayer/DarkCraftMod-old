package com.turnedslayer.darkcraft.items.armour;

import cofh.api.energy.EnergyStorage;
import cofh.api.energy.IEnergyContainerItem;
import com.turnedslayer.darkcraft.DarkCraft;
import com.turnedslayer.darkcraft.help.EnergyUtility;
import com.turnedslayer.darkcraft.help.ItemHelper;
import com.turnedslayer.darkcraft.libs.References;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

/**
 * Created by TurnedSlayer.
 */
public class BluesteelBoots extends ItemArmor implements IEnergyContainerItem {

    public EnergyStorage storage = new EnergyStorage(1000);
    protected int energy;
    protected int capacity;

    public BluesteelBoots(ItemArmor.ArmorMaterial material, int armorType)
    {
        super(material, 3 , armorType);
        this.setTextureName(References.MODID + ":" + "/Charged Bluesteel Boots");
        this.setCreativeTab(DarkCraft.DarkCraftTab);
        this.setUnlocalizedName("BluesteelBoots");
        this.maxStackSize = 1;
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == ItemHelper.BluesteelBoots)
        {
            return References.MODID + ":" + "textures/models/Charged Bluesteel Layer 1.png";
        }

        else
            System.out.println("Invalid Item Item Bluesteel Armor");
        return null;
    }

    public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot)
    {

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
    public int getMaxEnergyStored(ItemStack container) {
        return storage.getMaxEnergyStored();
    }
/*
    @Override
    public int getDisplayDamage (ItemStack stack)
    {
        if (!stack.hasTagCompound())
        {
            EnergyUtility.setDefaultEnergyTag(stack, 0);
        }
        return 1 + capacity - stack.getTagCompound().getInteger("Energy");
    }
*/
    @Override
    public int getEnergyStored (ItemStack container)
    {
        if (!container.hasTagCompound())
        {
            EnergyUtility.setDefaultEnergyTag(container, 0);
        }
        return container.getTagCompound().getInteger("Energy");
    }
}
