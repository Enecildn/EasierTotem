package com.enecildn.easiertotem;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class EasierTotem extends JavaPlugin
{
	@SuppressWarnings("deprecation")
	public void onEnable()
	{
		new CommandManager(this);
		getServer().getPluginManager().registerEvents(new EventManager(), this);
		ShapedRecipe totemRecipe = new ShapedRecipe(new ItemStack(Material.TOTEM, 1)).shape("aba", "cdc", "ece")
								   .setIngredient('a', Material.EMERALD).setIngredient('b',	Material.DIAMOND_BLOCK)
								   .setIngredient('c', Material.WOOD).setIngredient('d', Material.HAY_BLOCK).setIngredient('e', Material.AIR);
		getServer().addRecipe(totemRecipe);
	}
}
