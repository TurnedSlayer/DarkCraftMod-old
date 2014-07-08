package com.turnedslayer.darkcraft.proxy;

import com.turnedslayer.darkcraft.blocks.tiles.TileDarkBasicFurnace;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by TurnedSlayer.
 */
public class CommonProxy {

    public void registerTileEntities()
    {
        GameRegistry.registerTileEntity(TileDarkBasicFurnace.class, "TileDarkBasicFurnace" );
    }
}