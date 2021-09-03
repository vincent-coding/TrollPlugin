package me.vcoding.trollplugin.troll;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.vcoding.trollplugin.utils.Utils;

public class Commands implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player)sender;
			
			if(!player.hasPermission("troll.command")) {return false;}
			
			if(args.length > 0 && args[0].equalsIgnoreCase("help")) {
				API.ShowHelp(player);
				return true;
			}
			
			if(args.length == 2) {
				Player target = Bukkit.getPlayer(args[1]);
				
				if(target != null && target.isOnline()) {
					if(target.hasPermission("troll.bypass")) {
						player.sendMessage(Utils.Error + "ChatCan't troll " + ChatColor.DARK_RED + target.getName() + ChatColor.RED + " because he has permission: " + ChatColor.DARK_RED + "troll.bypass");
					} else {
						switch(args[0].toLowerCase()) {
							case("anvil"): API.Anvil(player, target); break;
							case("burn"): API.Burn(player, target); break;
							case("creeper"): API.Creeper(player, target); break;
							case("dropinv"): API.DropInventory(player, target); break;
							case("dropec"): API.DropEnderChest(player, target); break;
							case("explode"): API.Explode(player, target); break;
							case("fakeop"): API.FakeOP(player, target); break;
							case("lavaprison"): API.LavaPrison(player, target); break;
							case("lightning"): API.Lightning(player, target); break;
							case("mix"): API.MixHotBar(player, target); break;
							case("nobreak"): API.NoBreak(player, target); break;
							case("nohit"): API.NoHit(player, target); break;
							case("nomove"): API.NoMove(player, target); break;
							case("pumpkin"): API.Pumpkin(player, target); break;
							case("spam"): API.Spam(player, target); break;
							case("top"): API.Top(player, target); break;
							case("void"): API.Void(player, target); break;
								
							default: player.sendMessage(Utils.Error + "Unknown argument.\nDo " + ChatColor.DARK_RED + "/troll help" + ChatColor.RED + " to get the list of available arguments.");
						}
						return true;
					}
				} else {
					player.sendMessage(Utils.Error + "The player you entered doesn't exist or is not connected!");
				}
			} else {
				if(args.length == 0) {
					player.sendMessage(Utils.Error + "Please enter an argument!\nTo see the available list do " + ChatColor.DARK_RED + "/troll help");
				} else if(args.length == 1) {
					player.sendMessage(Utils.Error + "Please specify a target!\n Example: " + ChatColor.DARK_RED + "/troll " + args[0].toString() + " " + player.getName());
				} else {
					player.sendMessage(Utils.Error + "You have entered too many arguments!");
				}
			}
		} else {
			sender.sendMessage(Utils.Error + "You must be a player to execute this command!");
		}
		return false;
	}
}
