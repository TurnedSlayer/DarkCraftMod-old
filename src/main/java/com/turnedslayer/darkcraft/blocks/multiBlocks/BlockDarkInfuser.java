package com.turnedslayer.darkcraft.blocks.multiBlocks;


import com.turnedslayer.darkcraft.DarkCraft;
import com.turnedslayer.darkcraft.blocks.tiles.IHasFiller;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;


public class BlockDarkInfuser extends Block {

    public  BlockDarkInfuser()
    {
        super(Material.rock);
        this.setCreativeTab(DarkCraft.DarkCraftTab);



    }


  public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack)
  {

      super.onBlockPlacedBy(world, x, y, z, entity, stack);

      int l = MathHelper.floor_double((double) (entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

      if (l == 0) {
          world.setBlockMetadataWithNotify(x, y, z, 2, 2);
      }

      if (l == 1) {
          world.setBlockMetadataWithNotify(x, y, z, 5, 2);
      }

      if (l == 2) {
          world.setBlockMetadataWithNotify(x, y, z, 3, 2);
      }

      if (l == 3) {
          world.setBlockMetadataWithNotify(x, y, z, 4, 2);
      }

      TileEntity tileEntity = world.getTileEntity(x, y, z);

      ((IHasFiller) tileEntity).create();

  }
}
