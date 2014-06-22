/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minetweaker.mods.ic2;

import minetweaker.MineTweakerAPI;
import minetweaker.mods.ic2.expand.ItemExpansion;
import minetweaker.mods.ic2.machines.Compressor;
import minetweaker.mods.ic2.machines.Extractor;
import minetweaker.mods.ic2.machines.Macerator;
import minetweaker.mods.ic2.machines.ThermalCentrifuge;

/**
 *
 * @author Stan
 */
public class ClassRegistry {
	public static void register() {
		MineTweakerAPI.registerClass(ItemExpansion.class);
		
		MineTweakerAPI.registerClass(Compressor.class);
		MineTweakerAPI.registerClass(Extractor.class);
		MineTweakerAPI.registerClass(Macerator.class);
		MineTweakerAPI.registerClass(ThermalCentrifuge.class);
	}
}
