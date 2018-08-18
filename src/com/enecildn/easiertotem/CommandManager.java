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
				player.sendMessage(ChatColor.GREEN + "��" + ChatColor.AQUA + "��" + ChatColor.GREEN + "��");
				player.sendMessage(ChatColor.GOLD + "��" + ChatColor.DARK_GREEN + "��" + ChatColor.GOLD + "��");
				player.sendMessage(ChatColor.GRAY + "��" + ChatColor.GOLD + "��" + ChatColor.GRAY + "��");
				player.sendMessage(ChatColor.GREEN + "�� Emerald, " + ChatColor.AQUA + "�� Block of Diamond, " + ChatColor.GOLD + "�� Wood Planks, " +
								   ChatColor.DARK_GREEN + "�� Hay Bale, " + ChatColor.GRAY + "�� Empty");
			}
			return true;
		}
		return false;
	}
}
