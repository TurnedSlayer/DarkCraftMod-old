package com.turnedslayer.darkcraft.help;

import com.turnedslayer.darkcraft.libs.References;
import net.minecraft.util.ResourceLocation;

/**
 * Created by TurnedSlayer.
 */
public class Textures {

    public static final String RESOURCE_PREFIX = References.MODID.toLowerCase() + ":";

    //gui texture locations
    public static final String GUI_RESOURCE_LOCATION = "textures/gui/";
    public static final ResourceLocation BASICFURNACE = getResourceLocation(GUI_RESOURCE_LOCATION + "BasicFurnace.png");

    //block texture locations
    public static final String BLOCK_RESOURCE_LOCATION = "";
    public static final ResourceLocation BasicFurnace = getResourceLocation(BLOCK_RESOURCE_LOCATION + "blockDarkBasicFurnace");
    public static final ResourceLocation DarkGlass = getResourceLocation(BLOCK_RESOURCE_LOCATION + "blockDarkGlass");
    public static final ResourceLocation DarkFlux = getResourceLocation(BLOCK_RESOURCE_LOCATION + "blockDarkFlux");

    //Models
    public static final String MODEL_RESOURCELOCATION = "textures/models";
    public static final ResourceLocation BluesteelModel = getResourceLocation(RESOURCE_PREFIX + MODEL_RESOURCELOCATION + "Charged Bluesteel Layer");


    private static ResourceLocation getResourceLocation(String location)
    {
        return new ResourceLocation(References.MODID.toLowerCase(), location);
    }
}
