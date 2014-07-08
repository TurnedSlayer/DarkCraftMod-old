package com.turnedslayer.darkcraft.blocks;

import com.turnedslayer.darkcraft.DarkCraft;
import com.turnedslayer.darkcraft.help.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;



public class BlockFancy extends Block
{
    public BlockFancy()
    {
        super(Material.rock);
        this.setCreativeTab(DarkCraft.DarkCraftTab);

    }

    @SideOnly(Side.CLIENT)
    private IIcon[] texture;

    public static final String[] NAMES = { "DarkBlock", "DarkBlueBlock", "DarkRedBlock", "DarkGreenBlock", "DarkWhiteBlock" };

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister) {
        texture = new IIcon[NAMES.length];


        for(int i = 0; i < 2; i++) {
            texture[i] = par1IconRegister.registerIcon(Textures.DarkFlux + NAMES[i]);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list){
        for(int i = 0; i < NAMES.length; ++i) {
            list.add(new ItemStack(block, 1, i));
        }
    }


    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return texture[meta];
    }


    @Override
    public int damageDropped(int meta) {
        return meta;
    }


}