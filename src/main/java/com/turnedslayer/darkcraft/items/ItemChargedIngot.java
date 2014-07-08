package com.turnedslayer.darkcraft.items;

import com.turnedslayer.darkcraft.DarkCraft;
import com.turnedslayer.darkcraft.help.ItemHelper;

/**
 * Created by TurnedSlayer.
 */
public class ItemChargedIngot extends ItemDarkCraft{

    public ItemChargedIngot()
    {
        super();
        this.setCreativeTab(DarkCraft.DarkCraftTab);
        this.setUnlocalizedName("itemChargedIngot");
        ItemHelper.register(this);

    }
}
