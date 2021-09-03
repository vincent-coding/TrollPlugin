package me.vcoding.trollplugin.troll;

import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.vcoding.trollplugin.utils.Utils;

public class API {
	// TODO: Finish it
	public static void Anvil(Player sender, Player target) {
		for(int i = 0; i < 5; i++) {
			target.getWorld().getBlockAt(new Location(target.getWorld(), target.getLocation().getX(), target.getLocation().getY() + i, target.getLocation().getZ())).setType(Material.AIR);
		}
		target.getWorld().getBlockAt(new Location(target.getWorld(), target.getLocation().getX(), target.getLocation().getY() + 5D, target.getLocation().getZ())).setType(Material.ANVIL);
		sender.sendMessage(Utils.Success + "");
	}
	
	/**
	 * Sets the target on fire for 5 to 30 seconds
	 * 
	 * @param sender   The player who executes the command
	 * @param target   The player who is targeted by the command
	 * @since 0.1
	 */
	public static void Burn(Player sender, Player target) {
		target.setFireTicks(Utils.RandomNumber(30, 5) * 20);
		sender.sendMessage(Utils.Success + "The player was set on fire.");
	}
	
	/**
	 * Makes a creeper appear at the current position of the target player
	 * 
	 * @param sender   The player who executes the command
	 * @param target   The player who is targeted by the command
	 * @since 0.1
	 */
	public static void Creeper(Player sender, Player target) {
		Creeper creeper = (Creeper)target.getWorld().spawnEntity(target.getLocation(), EntityType.CREEPER);
		creeper.setPowered(true);
		sender.sendMessage(Utils.Success + "The creeper has appeared at the player's location");
	}
	
	/**
	 * Dropping all of a player's inventory
	 *
	 * @param sender   The player who executes the command
	 * @param target   The player who is targeted by the command
	 * @since 0.1
	 * 
	 */
	public static void DropInventory(Player sender, Player target) {
		Inventory inventory = target.getInventory();
		for(int i = 0; i < 36; i++) {
			try {
				target.getWorld().dropItem(target.getLocation(), inventory.getItem(i)).setPickupDelay(60);
			} catch(Exception e) {}
		}
		target.getInventory().clear();
		sender.sendMessage(Utils.Success + "The player's inventory has been dropped.");
	}
	
	/**
	 * Dropping all of a player's ender chest
	 *
	 * @param sender   The player who executes the command
	 * @param target   The player who is targeted by the command
	 * @since 0.1
	 * 
	 */
	public static void DropEnderChest(Player sender, Player target) {
		Inventory enderchest = target.getEnderChest();
		for(int i = 0; i < 27; i++) {
			try {
				target.getWorld().dropItem(target.getLocation(), enderchest.getItem(i)).setPickupDelay(60);
			} catch(Exception e) {}
		}
		target.getEnderChest().clear();
		sender.sendMessage(Utils.Success + "The player's ender chest has been dropped.");
	}
	
	/**
	 * Causes an explosion to appear at the current position of the target player
	 * 
	 * @param sender   The player who executes the command
	 * @param target   The player who is targeted by the command
	 * @since 0.1
	 */
	public static void Explode(Player sender, Player target) {
		target.getWorld().createExplosion(target.getLocation(), 2);
		sender.sendMessage(Utils.Success + ChatColor.DARK_GREEN + target.getName() + ChatColor.GREEN + " exploded well.");
	}
	
	/**
	 * Makes the target player think that he has just obtained all rights on the server
	 * 
	 * @param sender   The player who executes the command
	 * @param target   The player who is targeted by the command
	 * @since 0.1
	 */
	public static void FakeOP(Player sender, Player target) {
		target.sendMessage(ChatColor.GRAY + "" + ChatColor.ITALIC + "[Server: Opped " + target.getName() + "]");
		sender.sendMessage(Utils.Success + "The player has received the fake OP message.");
	}
	
	/**
	 * Causes a lava prison to appear around the target
	 * 
	 * @param sender   The player who executes the command
	 * @param target   The player who is targeted by the command
	 * @since 0.1
	 */
	public static void LavaPrison(Player sender, Player target) {
		World  w = target.getWorld();
		Double x = target.getLocation().getX();
		Double y = target.getLocation().getY();
		Double z = target.getLocation().getZ();
		Structures.spawnLavaPrison(w, x, y, z);
		target.teleport(new Location(w, x, y, z));
		sender.sendMessage(Utils.Success + "The player has been teleported into a lava prison.");
	}
	
	/**
	 * Makes a lightning bolt appear on the target player
	 * 
	 * @param sender   The player who executes the command
	 * @param target   The player who is targeted by the command
	 * @since 0.1
	 */
	public static void Lightning(Player sender, Player target) {
		target.getWorld().strikeLightning(target.getLocation());
		sender.sendMessage(Utils.Success + "A lightning bolt did appear on the player.");
	}
	
	/**
	 * Shuffle the target player's hotbar
	 * 
	 * @param sender   The player who executes the command
	 * @param target   The player who is targeted by the command
	 * @since 0.1
	 */
	public static void MixHotBar(Player sender, Player target) {
		Inventory inventory = target.getInventory();
		for(int i = 0; i < 9; i++) {
			int randInt = new Random().nextInt(9);
			try {inventory.getItem(i);}
			catch(Exception e) {continue;}
			ItemStack item = null;
			try {
				item = inventory.getItem(randInt);
				inventory.clear(randInt);
			} catch(Exception e) {}
			
			inventory.setItem(randInt, inventory.getItem(i));
			inventory.clear(i);
			
			if(item != null) {inventory.setItem(i, item);}
		}
		sender.sendMessage(Utils.Success + "The player's hotbar has been mixed well!");
	}
	
	// TODO: Finish it
	public static void NoBreak(Player sender, Player target) {
		target.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 10 * 20, 255));
		sender.sendMessage(Utils.Success + "");
	}
	
	// TODO: Finish it
	public static void NoHit(Player sender, Player target) {
		target.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 10 * 20, 255));
		sender.sendMessage(Utils.Success + "");
	}
	
	// TODO: Finish it
	public static void NoMove(Player sender, Player target) {
		target.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 10 * 20, 255));
		target.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 10 * 20, 250));
		sender.sendMessage(Utils.Success + "");
	}
	
	/**
	 * Makes a pumpkin appear on the head of the targeted player
	 * 
	 * @param sender   The player who executes the command
	 * @param target   The player who is targeted by the command
	 * @since 0.1
	 */
	public static void Pumpkin(Player sender, Player target) {
		ItemStack pumpkin = new ItemStack(Material.PUMPKIN);
		target.getInventory().setHelmet(pumpkin);
		sender.sendMessage(Utils.Success + "A pumpkin did appear on the player's head.");
	}

	/**
	 * Displays the list of available arguments
	 * 
	 * @param sender   The player who executes the command
	 * @since 0.1
	 */
	public static void ShowHelp(Player sender) {
		sender.sendMessage("help !!!");
	}
	
	/**
	 * Send lots of totally random messages for 10 seconds
	 * 
	 * @param sender   The player who executes the command
	 * @param target   The player who is targeted by the command
	 * @since 0.1
	 */
	public static void Spam(Player sender, Player target) {
		sender.sendMessage(Utils.Success + "Spamming started well for " + ChatColor.DARK_GREEN + target.getName() + ChatColor.GREEN + "\nThe effect will last 10 seconds.");
		long time = System.currentTimeMillis();
		long end = time + (10 * 1000);
		while(time < end) {
			if(target.isOnline()) {
				target.sendMessage(Utils.RandomString(Utils.RandomNumber(64, 12)));
				time = System.currentTimeMillis();
			} else {
				sender.sendMessage(Utils.Error + "The player " + ChatColor.DARK_RED + target.getName() + ChatColor.RED + "\nThe spamming stopped automatically.");
				break;
			}
		}
		sender.sendMessage(Utils.Success + "The spamming of the player " + ChatColor.DARK_GREEN + target.getName() + ChatColor.GREEN + " has stopped because the time is over.");
	}
	
	/**
	 * Teleports the target to 256 blocks high
	 * 
	 * @param sender   The player who executes the command
	 * @param target   The player who is targeted by the command
	 * @since 0.1
	 */
	public static void Top(Player sender, Player target) {
		World  w = target.getWorld();
		Double x = target.getLocation().getX();
		Double z = target.getLocation().getZ();
		Structures.spawnGlassPlatform(w, x, 255D, z);
		target.teleport(new Location(w, x, 256, z));
		sender.sendMessage(Utils.Success + "The player has been teleported to layer 256.");
	}
	
	/**
	 * Creates a hole in the void at the target's coordinates
	 * 
	 * @param sender   The player who executes the command
	 * @param target   The player who is targeted by the command
	 * @since 0.1
	 */
	public static void Void(Player sender, Player target) {
		for(int i = 0; i < target.getLocation().getY(); i++) {
			target.getWorld().getBlockAt(new Location(target.getWorld(), target.getLocation().getX(), i, target.getLocation().getZ())).setType(Material.AIR);
		}
		sender.sendMessage(Utils.Success + "A hole to the void has been dug at the coordinate of the target.");
	}
	
}
