package com.turnedslayer.darkcraft.items;

import com.turnedslayer.darkcraft.DarkCraft;
import com.turnedslayer.darkcraft.help.ItemHelper;


/**
 * Created by TurnedSlayer.
 */
public class ItemDarkGem extends ItemDarkCraft {

 public ItemDarkGem()
 {
     super();
     this.setUnlocalizedName("itemDarkGem");
     this.setCreativeTab(DarkCraft.DarkCraftTab);
     ItemHelper.register(this);

 }

}
