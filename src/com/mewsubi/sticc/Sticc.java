package com.mewsubi.sticc;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import org.bukkit.inventory.meta.ItemMeta;

import org.bukkit.plugin.java.JavaPlugin;

public class Sticc extends JavaPlugin {

    @Override
    public void onEnable() {
        
        ItemStack sticc = new ItemStack( Material.STICK );

        ItemMeta sticcMeta = sticc.getItemMeta();
        sticcMeta.setDisplayName( "Sticc" );
        sticc.setItemMeta( sticcMeta );

        NamespacedKey sticcKey = new NamespacedKey( this, "sticc" );

        ShapedRecipe sticcRecipe = new ShapedRecipe( sticcKey, sticc );
        sticcRecipe.shape( "S" );
        sticcRecipe.setIngredient( 'S', Material.STICK );

        this.getServer().addRecipe( sticcRecipe );

    }

    @Override
    public void onDisable() {

    }

}
