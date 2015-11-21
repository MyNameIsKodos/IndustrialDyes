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
    public static Item ItemIndustrialDye;

    public static CreativeTabs tabCity = new CreativeTabs("industrialDyes") {
        @Override
        public Item getTabIconItem() {
            return new ItemStack(ItemIndustrialDye, 1, 15).getItem();
        }
    };
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println(MODID + ": This is a test.");

        ItemIndustrialDye = new ItemIndustrialDye();
        GameRegistry.registerItem(ItemIndustrialDye, "industrialDye");
        
        OreDictionary.registerOre("dye", new ItemStack(ItemIndustrialDye, 1, 32767));
        OreDictionary.registerOre("dyeBlack", new ItemStack(ItemIndustrialDye, 1, 0));
        OreDictionary.registerOre("dyeRed", new ItemStack(ItemIndustrialDye, 1, 1));
        OreDictionary.registerOre("dyeGreen", new ItemStack(ItemIndustrialDye, 1, 2));
        OreDictionary.registerOre("dyeBrown", new ItemStack(ItemIndustrialDye, 1, 3));
        OreDictionary.registerOre("dyeBlue", new ItemStack(ItemIndustrialDye, 1, 4));
        OreDictionary.registerOre("dyePurple", new ItemStack(ItemIndustrialDye, 1, 5));
        OreDictionary.registerOre("dyeCyan", new ItemStack(ItemIndustrialDye, 1, 6));
        OreDictionary.registerOre("dyeLightGray", new ItemStack(ItemIndustrialDye, 1, 7));
        OreDictionary.registerOre("dyeGray", new ItemStack(ItemIndustrialDye, 1, 8));
        OreDictionary.registerOre("dyePink", new ItemStack(ItemIndustrialDye, 1, 9));
        OreDictionary.registerOre("dyeLime", new ItemStack(ItemIndustrialDye, 1, 10));
        OreDictionary.registerOre("dyeYellow", new ItemStack(ItemIndustrialDye, 1, 11));
        OreDictionary.registerOre("dyeLightBlue", new ItemStack(ItemIndustrialDye, 1, 12));
        OreDictionary.registerOre("dyeMagenta", new ItemStack(ItemIndustrialDye, 1, 13));
        OreDictionary.registerOre("dyeOrange", new ItemStack(ItemIndustrialDye, 1, 14));
        OreDictionary.registerOre("dyeWhite", new ItemStack(ItemIndustrialDye, 1, 15));
        System.out.println(MODID + ": Dye items have been Oredict'd!");
    }
}
