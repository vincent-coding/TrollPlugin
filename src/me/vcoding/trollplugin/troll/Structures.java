package me.vcoding.trollplugin.troll;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;

public class Structures {

	public static void spawnLavaPrison(World w, Double x, Double y, Double z) {
		new Location(w, x, y - 1D, z).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x, y - 2D, z).getBlock().setType(Material.OBSIDIAN);
		
		new Location(w, x - 1D, y - 2D, z).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x, y - 2D, z - 1D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x - 1D, y - 2D, z - 1D).getBlock().setType(Material.OBSIDIAN);

		new Location(w, x + 1D, y - 2D, z).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x, y - 2D, z - 1D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x + 1D, y - 2D, z - 1D).getBlock().setType(Material.OBSIDIAN);
	
		new Location(w, x + 1D, y - 2D, z).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x, y - 2D, z + 1D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x + 1D, y - 2D, z + 1D).getBlock().setType(Material.OBSIDIAN);
		
		new Location(w, x - 1D, y - 2D, z).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x, y - 2D, z - 1D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x - 1D, y - 2D, z + 1D).getBlock().setType(Material.OBSIDIAN);
	
		new Location(w, x - 2D, y - 2D, z).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x - 2D, y - 2D, z - 1D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x - 2D, y - 2D, z - 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x - 2D, y - 2D, z + 1D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x - 2D, y - 2D, z + 2D).getBlock().setType(Material.OBSIDIAN);
		
		new Location(w, x + 2D, y - 2D, z).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x + 2D, y - 2D, z - 1D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x + 2D, y - 2D, z - 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x + 2D, y - 2D, z + 1D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x + 2D, y - 2D, z + 2D).getBlock().setType(Material.OBSIDIAN);
	
		new Location(w, x, y - 2D, z + 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x - 1D, y - 2D, z + 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x + 1D, y - 2D, z + 2D).getBlock().setType(Material.OBSIDIAN);
	
		new Location(w, x, y - 2D, z - 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x - 1D, y - 2D, z - 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x + 1D, y - 2D, z - 2D).getBlock().setType(Material.OBSIDIAN);
		
		new Location(w, x, y - 1D, z + 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x - 1D, y - 1D, z + 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x + 1D, y - 1D, z + 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x, y - 1D, z - 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x - 1D, y - 1D, z - 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x + 1D, y - 1D, z - 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x - 2D, y - 1D, z).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x - 2D, y - 1D, z - 1D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x - 2D, y - 1D, z - 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x - 2D, y - 1D, z + 1D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x - 2D, y - 1D, z + 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x + 2D, y - 1D, z).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x + 2D, y - 1D, z - 1D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x + 2D, y - 1D, z - 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x + 2D, y - 1D, z + 1D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x + 2D, y - 1D, z + 2D).getBlock().setType(Material.OBSIDIAN);
		
		new Location(w, x - 1D, y - 1D, z).getBlock().setType(Material.LAVA);
		new Location(w, x, y - 1D, z - 1D).getBlock().setType(Material.LAVA);
		new Location(w, x - 1D, y - 1D, z - 1D).getBlock().setType(Material.LAVA);
		new Location(w, x + 1D, y - 1D, z).getBlock().setType(Material.LAVA);
		new Location(w, x, y - 1D, z - 1D).getBlock().setType(Material.LAVA);
		new Location(w, x + 1D, y - 1D, z - 1D).getBlock().setType(Material.LAVA);
		new Location(w, x + 1D, y - 1D, z).getBlock().setType(Material.LAVA);
		new Location(w, x, y - 1D, z + 1D).getBlock().setType(Material.LAVA);
		new Location(w, x + 1D, y - 1D, z + 1D).getBlock().setType(Material.LAVA);
		new Location(w, x - 1D, y - 1D, z).getBlock().setType(Material.LAVA);
		new Location(w, x, y - 1D, z - 1D).getBlock().setType(Material.LAVA);
		new Location(w, x - 1D, y - 1D, z + 1D).getBlock().setType(Material.LAVA);
		
		new Location(w, x - 2D, y, z - 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x - 2D, y, z + 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x + 2D, y, z - 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x + 2D, y, z + 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x - 2D, y + 1D, z - 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x - 2D, y + 1D, z + 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x + 2D, y + 1D, z - 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x + 2D, y + 1D, z + 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x - 2D, y + 2D, z - 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x - 2D, y + 2D, z + 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x + 2D, y + 2D, z - 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x + 2D, y + 2D, z + 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x - 2D, y + 3D, z - 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x - 2D, y + 3D, z + 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x + 2D, y + 3D, z - 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x + 2D, y + 3D, z + 2D).getBlock().setType(Material.OBSIDIAN);
		
		new Location(w, x, y + 3D, z + 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x - 1D, y + 3D, z + 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x + 1D, y + 3D, z + 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x, y + 3D, z - 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x - 1D, y + 3D, z - 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x + 1D, y + 3D, z - 2D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x - 2D, y + 3D, z).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x - 2D, y + 3D, z - 1D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x - 2D, y + 3D, z + 1D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x + 2D, y + 3D, z).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x + 2D, y + 3D, z - 1D).getBlock().setType(Material.OBSIDIAN);
		new Location(w, x + 2D, y + 3D, z + 1D).getBlock().setType(Material.OBSIDIAN);
		
		for(int i = 0; i < 3; i++) {
			new Location(w, x     , y + i, z + 2D).getBlock().setType(Material.GLASS);
			new Location(w, x - 1D, y + i, z + 2D).getBlock().setType(Material.GLASS);
			new Location(w, x + 1D, y + i, z + 2D).getBlock().setType(Material.GLASS);
			new Location(w, x     , y + i, z - 2D).getBlock().setType(Material.GLASS);
			new Location(w, x - 1D, y + i, z - 2D).getBlock().setType(Material.GLASS);
			new Location(w, x + 1D, y + i, z - 2D).getBlock().setType(Material.GLASS);
			new Location(w, x - 2D, y + i, z).getBlock().setType(Material.GLASS);
			new Location(w, x - 2D, y + i, z - 1D).getBlock().setType(Material.GLASS);
			new Location(w, x - 2D, y + i, z + 1D).getBlock().setType(Material.GLASS);
			new Location(w, x + 2D, y + i, z).getBlock().setType(Material.GLASS);
			new Location(w, x + 2D, y + i, z - 1D).getBlock().setType(Material.GLASS);
			new Location(w, x + 2D, y + i, z + 1D).getBlock().setType(Material.GLASS);
		}
		
		for(int i = 3; i < 5; i++) {
			new Location(w, x + 1D, y + i, z).getBlock().setType(Material.OBSIDIAN);
			new Location(w, x - 1D, y + i, z).getBlock().setType(Material.OBSIDIAN);
			new Location(w, x, y + i, z - 1D).getBlock().setType(Material.OBSIDIAN);
			new Location(w, x, y + i, z + 1D).getBlock().setType(Material.OBSIDIAN);
			new Location(w, x, y + i, z).getBlock().setType(Material.OBSIDIAN);
			
			if(i == 3) {
				new Location(w, x + 1D, y + i, z + 1D).getBlock().setType(Material.LAVA);
				new Location(w, x - 1D, y + i, z - 1D).getBlock().setType(Material.LAVA);
				new Location(w, x + 1D, y + i, z - 1D).getBlock().setType(Material.LAVA);
				new Location(w, x - 1D, y + i, z + 1D).getBlock().setType(Material.LAVA);
			} else {
				new Location(w, x + 1D, y + i, z + 1D).getBlock().setType(Material.OBSIDIAN);
				new Location(w, x - 1D, y + i, z - 1D).getBlock().setType(Material.OBSIDIAN);
				new Location(w, x + 1D, y + i, z - 1D).getBlock().setType(Material.OBSIDIAN);
				new Location(w, x - 1D, y + i, z + 1D).getBlock().setType(Material.OBSIDIAN);
			}
		}
		
		for(int i = 0; i < 3; i++) {
			new Location(w, x, y + i, z).getBlock().setType(Material.AIR);
			new Location(w, x + 1D, y + i, z + 1D).getBlock().setType(Material.AIR);
			new Location(w, x - 1D, y + i, z + 1D).getBlock().setType(Material.AIR);
			new Location(w, x + 1D, y + i, z - 1D).getBlock().setType(Material.AIR);
			new Location(w, x - 1D, y + i, z - 1D).getBlock().setType(Material.AIR);
			new Location(w, x - 1D, y + i, z).getBlock().setType(Material.AIR);
			new Location(w, x + 1D, y + i, z).getBlock().setType(Material.AIR);
			new Location(w, x, y + i, z + 1D).getBlock().setType(Material.AIR);
			new Location(w, x, y + i, z - 1D).getBlock().setType(Material.AIR);
		}
	}
	
	public static void spawnGlassPlatform(World w, Double x, Double y, Double z) {
		new Location(w, x, y, z).getBlock().setType(Material.GLASS);
		new Location(w, x + 1, y, z).getBlock().setType(Material.GLASS);
		new Location(w, x - 1, y, z).getBlock().setType(Material.GLASS);
		new Location(w, x, y, z + 1).getBlock().setType(Material.GLASS);
		new Location(w, x, y, z - 1).getBlock().setType(Material.GLASS);
		new Location(w, x + 1, y, z + 1).getBlock().setType(Material.GLASS);
		new Location(w, x - 1, y, z + 1).getBlock().setType(Material.GLASS);
		new Location(w, x + 1, y, z - 1).getBlock().setType(Material.GLASS);
		new Location(w, x - 1, y, z - 1).getBlock().setType(Material.GLASS);
	}
	
}
