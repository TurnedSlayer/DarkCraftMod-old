package com.turnedslayer.darkcraft.help.Gui.basicFurnace;

import com.turnedslayer.darkcraft.blocks.tiles.TileDarkBasicFurnace;
import com.turnedslayer.darkcraft.libs.References;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiBasicFurnace extends GuiContainer
{
    public TileDarkBasicFurnace DarkFurnace;
    private static final ResourceLocation backgroundimage = new ResourceLocation(References.MODID.toLowerCase() + ":" + "textures/gui/Dark Furnace.png");
    //public int rf;


    public GuiBasicFurnace(InventoryPlayer inventoryPlayer, TileDarkBasicFurnace tileDarkBasicFurnace)
    {

        super(new ContainerBasicFurnace(inventoryPlayer, tileDarkBasicFurnace));
        xSize = 176;
        ySize = 164;
        this.DarkFurnace = tileDarkBasicFurnace;

    }

    @Override
    @SideOnly(Side.CLIENT)
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(backgroundimage);
        int var4 = (this.width - this.xSize)/2;
        int var5 = (this.height - this.ySize)/2;
        this.drawTexturedModalRect(var4, var5,0,0,this.xSize,this.ySize);
        int var6;
        int i1;
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        int rf = this.DarkFurnace.storage.getEnergyStored();
        int rf2;
        int rf3;
        rf3 =(this.DarkFurnace.storage.getMaxEnergyStored() / 67 );
        rf2 =( rf / rf3);


        this.drawTexturedModalRect(k + 7, l + 4, 176, 31, rf2 , 8);

    }

    @SideOnly(Side.CLIENT)
    protected void drawGuiContainerBackgroundLayer()
    {
        this.mc.getTextureManager().bindTexture(backgroundimage);
        this.drawTexturedModalRect(176, 39, 20, 244, 100, 39);
    }
}