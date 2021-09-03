package me.vcoding.trollplugin;

import org.bukkit.plugin.java.JavaPlugin;

import me.vcoding.trollplugin.troll.Commands;

public class Main extends JavaPlugin {

	public void onEnable() {
		getCommand("troll").setExecutor(new Commands());
		
		System.out.println("[TrollPlugin by VCoding] Enabled!");
	}
	
	public void onDisable() {
		System.out.println("[TrollPlugin by VCoding] Disabled!");
	}
	
}
