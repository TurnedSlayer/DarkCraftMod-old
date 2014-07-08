package com.turnedslayer.darkcraft.items;

import com.turnedslayer.darkcraft.DarkCraft;
import com.turnedslayer.darkcraft.help.ItemHelper;

/**
 * Created by TurnedSlayer.
 */
public class ItemBluesteelIngot extends ItemDarkCraft{

    public ItemBluesteelIngot()
    {
        super();
        this.setUnlocalizedName("itemBluesteelIngot");
        this.setCreativeTab(DarkCraft.DarkCraftTab);
        ItemHelper.register(this);
    }
}
