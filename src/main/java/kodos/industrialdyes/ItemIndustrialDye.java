package kodos.industrialdyes;

import java.util.List;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemDye;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class ItemIndustrialDye extends ItemDye {
    @SideOnly(Side.CLIENT)
    private IIcon[] icons;

    public ItemIndustrialDye() {
        super();
        setHasSubtypes(true);
        this.setCreativeTab(IndustrialDyes.tabIDyes);
        this.setUnlocalizedName("industrialDye");
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconregister) {
        icons = new IIcon[16];

        for(int i = 0; i < icons.length; i++) {
            icons[i] = iconregister.registerIcon(IndustrialDyes.MODID + ":" + (this.getUnlocalizedName().substring(5)) + i);
        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIconFromDamage(int meta){
        if (meta > 16) { meta = 0; }
        return this.icons[meta];
    }

    @Override
    public void getSubItems(Item item, CreativeTabs tab, List list) {
        for(int i = 0; i < 16; i++) {
            list.add(new ItemStack(item, 1, i));
        }
    }
}