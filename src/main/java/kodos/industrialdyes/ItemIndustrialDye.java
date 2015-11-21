package kodos.industrialdyes;

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

    public ItemIndustrialDye(IIcon[] icons) {
        this.icons = icons;
    }
}
