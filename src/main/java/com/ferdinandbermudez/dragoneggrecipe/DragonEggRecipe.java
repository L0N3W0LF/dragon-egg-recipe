package com.ferdinandbermudez.dragoneggrecipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = DragonEggRecipe.MODID, version = DragonEggRecipe.VERSION)
public class DragonEggRecipe {
    public static final String MODID = "DragonEggRecipe";
    public static final String VERSION = "1.0";

    @EventHandler
    public void init(FMLInitializationEvent event) {
        ItemStack dragonEgg = new ItemStack(Blocks.dragon_egg);
        ItemStack dragonEggCore = new ItemStack(Items.nether_star);
        ItemStack dragonEggShell = new ItemStack(Blocks.obsidian);
        GameRegistry.addRecipe(dragonEgg, "sss", "scs", "sss", 'c', dragonEggCore, 's', dragonEggShell);
    }
}
