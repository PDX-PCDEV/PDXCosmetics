package com.pdxmc.paradoxcosmetics.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class guiUtil {

    static String name;
    static int rows;

    public guiUtil(String name1, int space1){
        this.name = name1;
        this.rows = space1;
    }

    public static Inventory inventory = Bukkit.createInventory(null, rows * 9, name);

    public void addItem(int placement, Material material, int amount, String name, List<String> lore){
        ItemStack is = new ItemStack(material, amount);
        ItemMeta im = is.getItemMeta();
        im.setDisplayName(name);
        im.setLore(lore);
        is.setItemMeta(im);
        inventory.setItem(placement, is);
    }
}
