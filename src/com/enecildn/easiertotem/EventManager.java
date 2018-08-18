package com.enecildn.easiertotem;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class EventManager implements Listener
{
	@EventHandler
	public static void onEntityDamage(EntityDamageEvent event)
	{
		if (event.getEntity() instanceof Player)
		{
			Player player = (Player) event.getEntity();
			if (event.getFinalDamage() >= player.getHealth())
			{
				if (player.getInventory().contains(Material.TOTEM))
				{
					if (player.getInventory().getItemInMainHand().getType() != Material.TOTEM &&
						player.getInventory().getItemInOffHand().getType() != Material.TOTEM)
					{
						event.setCancelled(true);
						player.setHealth(1);
						if (player.getActivePotionEffects() != null)
						{
							for (PotionEffect effect : player.getActivePotionEffects())
							{
								player.removePotionEffect(effect.getType());
							}
						}
						player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 800, 1));
						player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 100, 1));
						player.getInventory().remove(new ItemStack(Material.TOTEM, 1));
						player.playSound(player.getLocation(), Sound.ITEM_TOTEM_USE, 1, 1);
					}
				}
			}
		}
	}
}
