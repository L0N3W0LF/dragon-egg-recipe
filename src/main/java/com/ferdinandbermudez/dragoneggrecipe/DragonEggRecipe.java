package com.ferdinandbermudez.dragoneggrecipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = DragonEggRecipe.MODID, version = DragonEggRecipe.VERSION)
public class DragonEggRecipe {
    public static final String MODID = "dragoneggrecipe";
    public static final String VERSION = "1.2.0";

    @EventHandler
    public void init(FMLInitializationEvent event) {
        ResourceLocation name  = new ResourceLocation(MODID + ":dragonegg");
        ResourceLocation group = new ResourceLocation(MODID + ":recipe");
        ItemStack dragonEgg = new ItemStack(Blocks.DRAGON_EGG);
        ItemStack dragonEggCore = new ItemStack(Items.NETHER_STAR);
        ItemStack dragonEggShell = new ItemStack(Blocks.OBSIDIAN);
        GameRegistry.addShapedRecipe(name, group, dragonEgg, "sss", "scs", "sss", 'c', dragonEggCore, 's', dragonEggShell);
    }
}
