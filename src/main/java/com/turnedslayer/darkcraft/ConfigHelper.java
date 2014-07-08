package com.turnedslayer.darkcraft;

/**
 * Created by TurnedSlayer.
 */

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHelper
{
    public static void init(File ArmoryConfig)
    {
        Configuration config = new Configuration(ArmoryConfig);

        try
        {
            config.load();


        }

        catch (Exception exception)
        {
            //.armoryLogger.log(Level.SEVERE, "Armory has encountered a problem loading its configuration!", exception);
        }

        finally
        {
            config.save();
        }
    }

}