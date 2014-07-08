package com.turnedslayer.darkcraft.blocks.itemblocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Created by TurnedSlayer.
 */
public class ItemblockFancyBricks extends ItemBlock {

    public ItemblockFancyBricks(Block block)
    {
        super(block);
        setHasSubtypes(true);
    }


    public static final String[] NAMES = { "DarkBricks", "DarkBlueBricks", "DarkRedBricks", "DarkGreenBricks", "DarkWhiteBricks" };

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
