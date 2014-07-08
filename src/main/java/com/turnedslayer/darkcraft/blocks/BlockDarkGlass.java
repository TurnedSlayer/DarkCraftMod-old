package com.turnedslayer.darkcraft.blocks;

/**
 * Created by turnedslayer.
 */

import com.turnedslayer.darkcraft.DarkCraft;
import com.turnedslayer.darkcraft.libs.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class BlockDarkGlass extends Block {


    protected String folder;


    public BlockDarkGlass() {
        super(Material.glass);
        this.setBlockName(Strings.blockDarkGlass);
        this.setHardness(0.6F);
        this.setResistance(2.0F);
        this.setCreativeTab(DarkCraft.DarkCraftTab);
        this.setStepSound(Block.soundTypeGlass);
        this.setBlockTextureName("turnedslayer_darkcraft:blockDarkGlass");
        this.lightOpacity = 0;

    }

    @Override
    public int getLightOpacity() {
        return this.lightOpacity;
    }

    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }
}


