package com.turnedslayer.darkcraft;

/**
 * Created by TurnedSlayer.
 */

import com.turnedslayer.darkcraft.help.BlockHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class DarkCraftTab extends CreativeTabs
{

    public DarkCraftTab(int id, String mod_id)
    {
        super(id, mod_id);
    }

    @Override
    public Item getTabIconItem()
    {
        return Item.getItemFromBlock(BlockHelper.blockDark);
    }
}