package com.turnedslayer.darkcraft.blocks;

import com.turnedslayer.darkcraft.DarkCraft;
import com.turnedslayer.darkcraft.libs.References;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by TurnedSlayer.
 */
public class BlockDarkOre extends BlockDarkCraft {

    public BlockDarkOre() {
        super(Material.rock);
        this.setCreativeTab(DarkCraft.DarkCraftTab);
        this.setBlockTextureName(References.RESOURCESPREFIX + "blockDarkOre");
        GameRegistry.registerBlock(this, "blockDarkOre");
        this.setBlockName("blockDarkOre");
        this.setHardness(1f);
        //this.setHarvestLevel();

    }

}
