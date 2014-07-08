package com.turnedslayer.darkcraft.items;

import com.turnedslayer.darkcraft.DarkCraft;
import com.turnedslayer.darkcraft.help.ItemHelper;

/**
 * Created by TurnedSlayer.
 */
public class ItemDiamondInfusedBluesteelIngot extends ItemDarkCraft {

    public ItemDiamondInfusedBluesteelIngot()
    {
        super();
        this.setCreativeTab(DarkCraft.DarkCraftTab);
        this.setUnlocalizedName("itemDiamondInfusedBluesteelIngot");
        ItemHelper.register(this);


    }

}
