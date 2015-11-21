package kodos.industrialdyes;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;


@Mod(modid = IndustrialDyes.MODID, version = IndustrialDyes.VERSION)

public class IndustrialDyes
{
    public static final String MODID = "industrialdyes";
    public static final String VERSION = "0.1";
    public static Item itemIndustrialDye;

    public static CreativeTabs tabIDyes = new CreativeTabs("industrialDyes") {
        @Override
        public Item getTabIconItem() {
            return new ItemStack(itemIndustrialDye, 1, 15).getItem();
        }
    };
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println(MODID + ": This is a test.");

        itemIndustrialDye = new ItemIndustrialDye();

        GameRegistry.registerItem(itemIndustrialDye, "industrialDye");

        OreDictionary.registerOre("dye", new ItemStack(itemIndustrialDye, 1, 32767));
        OreDictionary.registerOre("dyeBlack", new ItemStack(itemIndustrialDye, 1, 0));
        OreDictionary.registerOre("dyeRed", new ItemStack(itemIndustrialDye, 1, 1));
        OreDictionary.registerOre("dyeGreen", new ItemStack(itemIndustrialDye, 1, 2));
        OreDictionary.registerOre("dyeBrown", new ItemStack(itemIndustrialDye, 1, 3));
        OreDictionary.registerOre("dyeBlue", new ItemStack(itemIndustrialDye, 1, 4));
        OreDictionary.registerOre("dyePurple", new ItemStack(itemIndustrialDye, 1, 5));
        OreDictionary.registerOre("dyeCyan", new ItemStack(itemIndustrialDye, 1, 6));
        OreDictionary.registerOre("dyeLightGray", new ItemStack(itemIndustrialDye, 1, 7));
        OreDictionary.registerOre("dyeGray", new ItemStack(itemIndustrialDye, 1, 8));
        OreDictionary.registerOre("dyePink", new ItemStack(itemIndustrialDye, 1, 9));
        OreDictionary.registerOre("dyeLime", new ItemStack(itemIndustrialDye, 1, 10));
        OreDictionary.registerOre("dyeYellow", new ItemStack(itemIndustrialDye, 1, 11));
        OreDictionary.registerOre("dyeLightBlue", new ItemStack(itemIndustrialDye, 1, 12));
        OreDictionary.registerOre("dyeMagenta", new ItemStack(itemIndustrialDye, 1, 13));
        OreDictionary.registerOre("dyeOrange", new ItemStack(itemIndustrialDye, 1, 14));
        OreDictionary.registerOre("dyeWhite", new ItemStack(itemIndustrialDye, 1, 15));
        System.out.println(MODID + ": Dye items have been Oredict'd!");
    }
}
