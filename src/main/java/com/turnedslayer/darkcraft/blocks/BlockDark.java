package com.turnedslayer.darkcraft.blocks;

/**
 * Created by TurnedSlayer.
 */

import com.turnedslayer.darkcraft.DarkCraft;
import com.turnedslayer.darkcraft.help.BlockHelper;
import com.turnedslayer.darkcraft.libs.Strings;
import net.minecraft.block.material.Material;

public class BlockDark extends BlockDarkCraft
{

    public BlockDark()
    {
        super(Material.rock);
        this.setBlockName(Strings.blockDark);
        this.setCreativeTab(DarkCraft.DarkCraftTab);
        BlockHelper.register(this);

    }

    @Override
    public int damageDropped(int par1)
    {
        return par1;
    }
/*
    @SideOnly(Side.CLIENT)
    private IIcon[] icons;

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        icons = new IIcon[4];

        for (int i = 0; i < icons.length; i++)
        {
            icons[i] = par1IconRegister.registerIcon(DarkCraft.modid + ":" + (this.getUnlocalizedName().substring(5)) + i);
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int part, int par2)
    {
        return icons[4];


    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int par1, int par2)
    {
        switch (par2)
        {
            case 0:
                return icons[0];
            case 1:
            {
                switch (par1)
                {
                    case 0:
                        return icons[1];
                    case 1:
                        return icons[2];
                    default:
                        return icons[3];
                }
            }
            default:
            {
                System.out.println("Invalid metadata for " + this.getUnlocalizedName());
                return icons[0];
            }
        }
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for (int i = 0; i < 2; i++)
        {
            par3List.add(new ItemStack(par1, 1, i));
        }
    }
*/

}
