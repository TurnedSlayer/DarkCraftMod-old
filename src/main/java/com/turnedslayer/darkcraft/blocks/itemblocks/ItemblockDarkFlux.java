package com.turnedslayer.darkcraft.blocks.itemblocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemblockDarkFlux extends ItemBlock {
    public ItemblockDarkFlux(Block block)
    {
        super(block);
        setHasSubtypes(true);
    }


    public static final String[] NAMES = { "DarkFlux", "DarkFluxCrystal" };

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        int i = itemStack.getItemDamage();
        if (i < 0 || i >= NAMES.length) {
            i = 0;
        }
        return super.getUnlocalizedName() + "." + NAMES[i];
    }
    @Override
    public int getMetadata ( int meta)
    {
        return meta;
    }


}

