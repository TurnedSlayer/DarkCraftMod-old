package com.turnedslayer.darkcraft;

import com.turnedslayer.darkcraft.blocks.tiles.TileDarkBasicFurnace;
import com.turnedslayer.darkcraft.help.BlockHelper;
import com.turnedslayer.darkcraft.help.Gui.GuiHandler;
import com.turnedslayer.darkcraft.help.ItemHelper;
import com.turnedslayer.darkcraft.help.worldGen.EventManager;
import com.turnedslayer.darkcraft.libs.References;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;



@Mod(modid="turnedslayer_darkcraft", name="darkcraft Mod", version="0.0.1")
public class DarkCraft{


    public static final String modid = "turnedslayer_darkcraft";

    public static CreativeTabs DarkCraftTab = new DarkCraftTab(CreativeTabs.getNextID(), References.MODID);

    public static CreativeTabs getCreativeTab()
    {
        return DarkCraftTab;
    }







    @Mod.Metadata
    public static ModMetadata metadata;

    @Mod.Instance
    public static DarkCraft instance;


    @Mod.EventHandler()
    public void preInit(FMLPreInitializationEvent event)
    {
        //Blocks

        BlockHelper.init();

        ItemHelper.init();

        GameRegistry.registerWorldGenerator(new EventManager(), 0);



    }


    @Mod.EventHandler()
    public void init(FMLInitializationEvent event)
    {
        //Gui Handler
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());

        //Tile Entitys
        GameRegistry.registerTileEntity(TileDarkBasicFurnace.class, "TileDarkBasicFurnace");
    }


    @Mod.EventHandler()
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}