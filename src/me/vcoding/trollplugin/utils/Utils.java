package me.vcoding.trollplugin.utils;

import java.util.Random;

import org.bukkit.ChatColor;

public class Utils {

	public static String Error   = ChatColor.DARK_RED + "[" + ChatColor.RED + "TrollPlugin" + ChatColor.DARK_RED + "] " + ChatColor.RED; 
	public static String Success = ChatColor.DARK_GREEN + "[" + ChatColor.GREEN + "TrollPlugin" + ChatColor.DARK_GREEN + "] " + ChatColor.GREEN; 
	
	public static String RandomString(int length) {
		
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTVXYZ" +
									"abcdefghijklmnopqrstvxyz" +
									"0123456789";
		
		StringBuilder sb = new StringBuilder(length);
		
		for(int i = 0; i < length; i++) {
			int index = (int)(AlphaNumericString.length() * Math.random());
			sb.append(AlphaNumericString.charAt(index));
		}
		
		return sb.toString();
	}
	
	public static int RandomNumber(int max, int min) {
		return new Random().nextInt((max - min) + 1) + min;
	}
	
}
