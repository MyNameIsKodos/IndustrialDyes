package kodos.industrialdyes;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemDye;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Created by Kodos on 11/21/2015.
 */
public class ItemIndustrialDye extends ItemDye {
    @SideOnly(Side.CLIENT)
    private IIcon[] icons;

    public ItemIndustrialDye() {
        super();
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconregister) {
        icons = new IICon[16];

        for(int i = 0; i < icons.length;, i++) {
            icons[i] = iconregister.registerIcon(IndustrialDyes.MODID + ":" + (this.getUnlocalizedName().substring(5)) + i);
        }
    }
}
