package com.enecildn.easiertotem;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandManager implements CommandExecutor
{
	public CommandManager(EasierTotem et)
	{
		et.getCommand("et").setExecutor(this);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] data)
	{
		if (label.equalsIgnoreCase("et"))
		{
			if (sender instanceof Player)
			{
				Player player = (Player) sender;
				player.sendMessage(ChatColor.WHITE + "[" + ChatColor.GREEN + "EasierTotem" + ChatColor.WHITE + "] " +
								   ChatColor.AQUA + "How to craft Totem of Undying:");
				player.sendMessage(ChatColor.GREEN + "бс" + ChatColor.AQUA + "бс" + ChatColor.GREEN + "бс");
				player.sendMessage(ChatColor.GOLD + "бс" + ChatColor.DARK_GREEN + "бс" + ChatColor.GOLD + "бс");
				player.sendMessage(ChatColor.GRAY + "бс" + ChatColor.GOLD + "бс" + ChatColor.GRAY + "бс");
				player.sendMessage(ChatColor.GREEN + "бс Emerald, " + ChatColor.AQUA + "бс Block of Diamond, " + ChatColor.GOLD + "бс Wood Planks, " +
								   ChatColor.DARK_GREEN + "бс Hay Bale, " + ChatColor.GRAY + "бс Empty");
			}
			return true;
		}
		return false;
	}
}
