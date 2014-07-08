package com.turnedslayer.darkcraft.help.Gui;

import com.turnedslayer.darkcraft.blocks.tiles.TileDarkBasicFurnace;
import com.turnedslayer.darkcraft.help.Gui.basicFurnace.ContainerBasicFurnace;
import com.turnedslayer.darkcraft.help.Gui.basicFurnace.GuiBasicFurnace;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;



/**
 * Created by TurnedSlayer.
 */

public class GuiHandler implements IGuiHandler
{
    public GuiHandler(){}

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if(ID == 0)
        {
            // Create an Object of our TE, so we can give that to our inventory.
            TileDarkBasicFurnace tileDarkBasicFurnace = (TileDarkBasicFurnace) world.getTileEntity(x, y, z);
            return new ContainerBasicFurnace(player.inventory, tileDarkBasicFurnace);
        }
        return null;
    }

    /**
     * Gets the client element.
     * This means, do something client side, when this ID gets called.
     */
    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        TileDarkBasicFurnace tileDarkBasicFurnace = (TileDarkBasicFurnace) world.getTileEntity(x, y, z);
        if(ID == 0) return new GuiBasicFurnace(player.inventory,tileDarkBasicFurnace );
        return null;
    }
}