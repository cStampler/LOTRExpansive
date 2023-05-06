package drealm.database;

import lotr.common.LOTRMod;
import lotr.common.world.structure.LOTRChestContents;
import net.minecraft.init.*;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;

public class DRChestContents {
	public static LOTRChestContents RED_DWARF_HOUSE_LARDER = new LOTRChestContents(2, 5, new WeightedRandomChestContent[] { new WeightedRandomChestContent(new ItemStack(Items.bread), 1, 3, 100), new WeightedRandomChestContent(new ItemStack(Items.cooked_porkchop), 1, 2, 75), new WeightedRandomChestContent(new ItemStack(Items.cooked_beef), 1, 2, 75), new WeightedRandomChestContent(new ItemStack(LOTRMod.muttonCooked), 1, 2, 75), new WeightedRandomChestContent(new ItemStack(Items.cooked_chicken), 1, 3, 75), new WeightedRandomChestContent(new ItemStack(Items.cooked_fished), 1, 3, 50), new WeightedRandomChestContent(new ItemStack(LOTRMod.gammon), 1, 2, 50), new WeightedRandomChestContent(new ItemStack(LOTRMod.deerCooked), 1, 2, 50), new WeightedRandomChestContent(new ItemStack(LOTRMod.mug), 1, 3, 25), new WeightedRandomChestContent(new ItemStack(LOTRMod.aleHorn), 1, 2, 25), new WeightedRandomChestContent(new ItemStack(LOTRMod.gobletWood), 1, 3, 25), new WeightedRandomChestContent(new ItemStack(LOTRMod.gobletGold), 1, 3, 25), new WeightedRandomChestContent(new ItemStack(LOTRMod.ceramicPlate), 1, 2, 50), new WeightedRandomChestContent(new ItemStack(LOTRMod.woodPlate), 1, 2, 50) });
	public static LOTRChestContents RED_MOUNTAINS_STRONGHOLD = new LOTRChestContents(3, 5, new WeightedRandomChestContent[] { new WeightedRandomChestContent(new ItemStack(DRRegistry.helmet_red_dwarven), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(DRRegistry.body_red_dwarven), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(DRRegistry.legs_red_dwarven), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(DRRegistry.boots_red_dwarven), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(DRRegistry.sword_red_dwarven), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(DRRegistry.spear_red_dwarven), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(DRRegistry.battleaxe_red_dwarven), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(DRRegistry.dagger_red_dwarven), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(DRRegistry.hammer_red_dwarven), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(DRRegistry.pike_red_dwarven), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(DRRegistry.pickaxe_red_dwarven), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(DRRegistry.mattock_red_dwarven), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(DRRegistry.throwing_axe_red_dwarven), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(DRRegistry.boar_armor_red_dwarven), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(Items.coal), 1, 3, 100), new WeightedRandomChestContent(new ItemStack(Blocks.torch), 2, 4, 100), new WeightedRandomChestContent(new ItemStack(Items.iron_ingot), 1, 1, 75), new WeightedRandomChestContent(new ItemStack(LOTRMod.ironNugget), 1, 6, 25), new WeightedRandomChestContent(new ItemStack(DRRegistry.red_dwarf_steel), 1, 1, 75), new WeightedRandomChestContent(new ItemStack(LOTRMod.mug), 1, 3, 50), new WeightedRandomChestContent(new ItemStack(LOTRMod.aleHorn), 1, 3, 50), new WeightedRandomChestContent(new ItemStack(LOTRMod.gobletWood), 1, 3, 50), new WeightedRandomChestContent(new ItemStack(Items.cooked_porkchop), 1, 1, 75), new WeightedRandomChestContent(new ItemStack(Items.cooked_chicken), 1, 1, 75), new WeightedRandomChestContent(new ItemStack(Items.cooked_beef), 1, 1, 75), new WeightedRandomChestContent(new ItemStack(LOTRMod.muttonCooked), 1, 1, 75), new WeightedRandomChestContent(new ItemStack(LOTRMod.deerCooked), 1, 1, 50), new WeightedRandomChestContent(new ItemStack(LOTRMod.gammon), 1, 1, 75), new WeightedRandomChestContent(new ItemStack(Items.compass), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(LOTRMod.dwarvenRing), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(LOTRMod.mithrilBook), 1, 1, 15) });
	public static LOTRChestContents RED_MOUNTAINS_SMITHY = new LOTRChestContents(3, 4, new WeightedRandomChestContent[] { new WeightedRandomChestContent(new ItemStack(Items.coal), 1, 4, 100), new WeightedRandomChestContent(new ItemStack(Items.coal, 1, 1), 1, 4, 100), new WeightedRandomChestContent(new ItemStack(LOTRMod.rock, 1, 3), 1, 8, 50), new WeightedRandomChestContent(new ItemStack(Items.iron_ingot), 1, 3, 50), new WeightedRandomChestContent(new ItemStack(LOTRMod.ironNugget), 1, 6, 10), new WeightedRandomChestContent(new ItemStack(DRRegistry.red_dwarf_steel), 1, 3, 50), new WeightedRandomChestContent(new ItemStack(LOTRMod.bronze), 1, 3, 50), new WeightedRandomChestContent(new ItemStack(LOTRMod.copper), 1, 3, 50), new WeightedRandomChestContent(new ItemStack(LOTRMod.tin), 1, 3, 50), new WeightedRandomChestContent(new ItemStack(LOTRMod.silver), 1, 3, 50), new WeightedRandomChestContent(new ItemStack(Items.bucket), 1, 2, 50), new WeightedRandomChestContent(new ItemStack(Items.cooked_porkchop), 1, 4, 25), new WeightedRandomChestContent(new ItemStack(Items.cooked_chicken), 1, 4, 25), new WeightedRandomChestContent(new ItemStack(Items.cooked_beef), 1, 4, 25), new WeightedRandomChestContent(new ItemStack(LOTRMod.muttonCooked), 1, 4, 25), new WeightedRandomChestContent(new ItemStack(LOTRMod.gammon), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(LOTRMod.deerCooked), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(Items.bread), 1, 3, 50), new WeightedRandomChestContent(new ItemStack(LOTRMod.mithrilBook), 1, 1, 15) });
	public static LOTRChestContents WIND_DWARF_HOUSE_LARDER = new LOTRChestContents(2, 5, new WeightedRandomChestContent[] { new WeightedRandomChestContent(new ItemStack(Items.bread), 1, 3, 100), new WeightedRandomChestContent(new ItemStack(Items.cooked_porkchop), 1, 2, 75), new WeightedRandomChestContent(new ItemStack(Items.cooked_beef), 1, 2, 75), new WeightedRandomChestContent(new ItemStack(LOTRMod.muttonCooked), 1, 2, 75), new WeightedRandomChestContent(new ItemStack(Items.cooked_chicken), 1, 3, 75), new WeightedRandomChestContent(new ItemStack(Items.cooked_fished), 1, 3, 50), new WeightedRandomChestContent(new ItemStack(LOTRMod.gammon), 1, 2, 50), new WeightedRandomChestContent(new ItemStack(LOTRMod.deerCooked), 1, 2, 50), new WeightedRandomChestContent(new ItemStack(LOTRMod.mug), 1, 3, 25), new WeightedRandomChestContent(new ItemStack(LOTRMod.aleHorn), 1, 2, 25), new WeightedRandomChestContent(new ItemStack(LOTRMod.gobletWood), 1, 3, 25), new WeightedRandomChestContent(new ItemStack(LOTRMod.gobletGold), 1, 3, 25), new WeightedRandomChestContent(new ItemStack(LOTRMod.ceramicPlate), 1, 2, 50), new WeightedRandomChestContent(new ItemStack(LOTRMod.woodPlate), 1, 2, 50) });
	public static LOTRChestContents WIND_MOUNTAINS_STRONGHOLD = new LOTRChestContents(3, 5, new WeightedRandomChestContent[] { new WeightedRandomChestContent(new ItemStack(DRRegistry.helmet_wind_dwarven), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(DRRegistry.body_wind_dwarven), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(DRRegistry.legs_wind_dwarven), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(DRRegistry.boots_wind_dwarven), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(DRRegistry.sword_wind_dwarven), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(DRRegistry.spear_wind_dwarven), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(DRRegistry.battleaxe_wind_dwarven), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(DRRegistry.dagger_wind_dwarven), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(DRRegistry.hammer_wind_dwarven), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(DRRegistry.pike_wind_dwarven), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(DRRegistry.pickaxe_wind_dwarven), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(DRRegistry.mattock_wind_dwarven), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(DRRegistry.throwing_axe_wind_dwarven), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(DRRegistry.boar_armor_wind_dwarven), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(Items.coal), 1, 3, 100), new WeightedRandomChestContent(new ItemStack(Blocks.torch), 2, 4, 100), new WeightedRandomChestContent(new ItemStack(Items.iron_ingot), 1, 1, 75), new WeightedRandomChestContent(new ItemStack(LOTRMod.ironNugget), 1, 6, 25), new WeightedRandomChestContent(new ItemStack(DRRegistry.wind_dwarf_steel), 1, 1, 75), new WeightedRandomChestContent(new ItemStack(LOTRMod.mug), 1, 3, 50), new WeightedRandomChestContent(new ItemStack(LOTRMod.aleHorn), 1, 3, 50), new WeightedRandomChestContent(new ItemStack(LOTRMod.gobletWood), 1, 3, 50), new WeightedRandomChestContent(new ItemStack(Items.cooked_porkchop), 1, 1, 75), new WeightedRandomChestContent(new ItemStack(Items.cooked_chicken), 1, 1, 75), new WeightedRandomChestContent(new ItemStack(Items.cooked_beef), 1, 1, 75), new WeightedRandomChestContent(new ItemStack(LOTRMod.muttonCooked), 1, 1, 75), new WeightedRandomChestContent(new ItemStack(LOTRMod.deerCooked), 1, 1, 50), new WeightedRandomChestContent(new ItemStack(LOTRMod.gammon), 1, 1, 75), new WeightedRandomChestContent(new ItemStack(Items.compass), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(LOTRMod.dwarvenRing), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(LOTRMod.mithrilBook), 1, 1, 15) });
	public static LOTRChestContents WIND_MOUNTAINS_SMITHY = new LOTRChestContents(3, 4, new WeightedRandomChestContent[] { new WeightedRandomChestContent(new ItemStack(Items.coal), 1, 4, 100), new WeightedRandomChestContent(new ItemStack(Items.coal, 1, 1), 1, 4, 100), new WeightedRandomChestContent(new ItemStack(LOTRMod.rock, 1, 3), 1, 8, 50), new WeightedRandomChestContent(new ItemStack(Items.iron_ingot), 1, 3, 50), new WeightedRandomChestContent(new ItemStack(LOTRMod.ironNugget), 1, 6, 10), new WeightedRandomChestContent(new ItemStack(DRRegistry.wind_dwarf_steel), 1, 3, 50), new WeightedRandomChestContent(new ItemStack(LOTRMod.bronze), 1, 3, 50), new WeightedRandomChestContent(new ItemStack(LOTRMod.copper), 1, 3, 50), new WeightedRandomChestContent(new ItemStack(LOTRMod.tin), 1, 3, 50), new WeightedRandomChestContent(new ItemStack(LOTRMod.silver), 1, 3, 50), new WeightedRandomChestContent(new ItemStack(Items.bucket), 1, 2, 50), new WeightedRandomChestContent(new ItemStack(Items.cooked_porkchop), 1, 4, 25), new WeightedRandomChestContent(new ItemStack(Items.cooked_chicken), 1, 4, 25), new WeightedRandomChestContent(new ItemStack(Items.cooked_beef), 1, 4, 25), new WeightedRandomChestContent(new ItemStack(LOTRMod.muttonCooked), 1, 4, 25), new WeightedRandomChestContent(new ItemStack(LOTRMod.gammon), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(LOTRMod.deerCooked), 1, 1, 25), new WeightedRandomChestContent(new ItemStack(Items.bread), 1, 3, 50), new WeightedRandomChestContent(new ItemStack(LOTRMod.mithrilBook), 1, 1, 15) });
}