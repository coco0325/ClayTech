package club.claycoffee.ClayTech.implementation.machines;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

import club.claycoffee.ClayTech.ClayTech;
import club.claycoffee.ClayTech.api.ClayTechManager;
import club.claycoffee.ClayTech.api.listeners.MachineTickEvent;
import club.claycoffee.ClayTech.utils.Lang;
import club.claycoffee.ClayTech.utils.RocketUtils;
import club.claycoffee.ClayTech.utils.Utils;
import io.github.thebusybiscuit.slimefun4.core.attributes.EnergyNetComponent;
import io.github.thebusybiscuit.slimefun4.core.networks.energy.EnergyNetComponentType;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.mrCookieSlime.CSCoreLibPlugin.Configuration.Config;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ClickAction;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.ChestMenu.AdvancedMenuClickHandler;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineRecipe;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.interfaces.InventoryBlock;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import me.mrCookieSlime.Slimefun.api.BlockStorage;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.api.energy.ChargableBlock;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;

@SuppressWarnings("deprecation")
public class SpaceSuitOxygenInjector extends SlimefunItem implements InventoryBlock, EnergyNetComponent {
	public static Map<Block, MachineRecipe> processing = new HashMap<>();
	public static Map<Block, Integer> progress = new HashMap<>();
	public final static int[] inputslots = new int[] { 22 };
	public final static int[] outputslots = new int[] {};

	protected final List<MachineRecipe> recipes = new ArrayList<>();

	private static final int[] BORDER_A = { 0, 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 15, 16, 17, 18, 19, 20, 24, 25, 26, 27,
			28, 29, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44 };
	private static final int[] BORDER_B = { 12, 13, 14, 21, 23, 30, 31, 32 };
	private static final ItemStack BORDER_A_ITEM = Utils.newItemD(Material.LIGHT_BLUE_STAINED_GLASS_PANE,
			Lang.readMachinesText("SPLIT_LINE"));
	private static final ItemStack BORDER_B_ITEM = Utils.newItemD(Material.LIME_STAINED_GLASS_PANE,
			Lang.readMachinesText("SPLIT_LINE"));
	private static final List<Material> LEAVES = Arrays
			.asList(new Material[] { Material.OAK_LEAVES, Material.ACACIA_LEAVES, Material.BIRCH_LEAVES,
					Material.DARK_OAK_LEAVES, Material.JUNGLE_LEAVES, Material.SPRUCE_LEAVES });
	private static ItemStack item;

	public SpaceSuitOxygenInjector(Category category, SlimefunItemStack item, String id, RecipeType recipeType,
			ItemStack[] recipe) {

		super(category, item, recipeType, recipe);
		createPreset(this, getInventoryTitle(), this::SetupMenu);

		registerBlockHandler(id, (p, b, tool, reason) -> {
			BlockMenu inv = BlockStorage.getInventory(b);
			if (inv != null) {
				for (int slot : getInputSlots()) {
					if (inv.getItemInSlot(slot) != null) {
						if (inv.getItemInSlot(slot).getType() != Material.BEDROCK) {
							b.getWorld().dropItemNaturally(b.getLocation(), inv.getItemInSlot(slot));
							inv.replaceExistingItem(slot, null);
						}
					}
				}

				for (int slot : getOutputSlots()) {
					if (inv.getItemInSlot(slot) != null) {
						b.getWorld().dropItemNaturally(b.getLocation(), inv.getItemInSlot(slot));
						inv.replaceExistingItem(slot, null);
					}
				}
			}

			progress.remove(b);
			processing.remove(b);
			return true;
		});
	}

	@Override
	public EnergyNetComponentType getEnergyComponentType() {
		return EnergyNetComponentType.CONSUMER;
	}

	@Override
	public int getCapacity() {
		return 256;
	}

	@Override
	public int[] getInputSlots() {
		return inputslots;
	}

	@Override
	public int[] getOutputSlots() {
		return outputslots;
	}

	public String getInventoryTitle() {
		return Lang.readMachinesText("CLAY_SPACESUIT_OXYGEN_INJECTOR");
	}

	public ItemStack getProgressBar() {
		return new ItemStack(Material.REDSTONE_TORCH);
	}

	public int getEnergyConsumption() {
		return 80;
	}

	public int getSpeed() {
		return 1;
	}

	public String getMachineIdentifier() {
		return "CLAY_SPACESUIT_OXYGEN_INJECTOR";
	}

	public void SetupMenu(BlockMenuPreset Preset) {
		Preset.addItem(43, BORDER_A_ITEM.clone(), ChestMenuUtils.getEmptyClickHandler());
		Preset.addItem(43, BORDER_A_ITEM.clone(), ChestMenuUtils.getEmptyClickHandler());
		Preset.addItem(5, BORDER_A_ITEM.clone(), ChestMenuUtils.getEmptyClickHandler());
		for (int eachID : BORDER_A) {
			Preset.addItem(eachID, BORDER_A_ITEM.clone(), ChestMenuUtils.getEmptyClickHandler());
		}
		for (int eachID : BORDER_B) {
			Preset.addItem(eachID, BORDER_B_ITEM.clone(), ChestMenuUtils.getEmptyClickHandler());
		}
		Preset.addItem(4, Utils.addLore(Utils.newItem(Material.BLACK_STAINED_GLASS_PANE), " "),
				ChestMenuUtils.getEmptyClickHandler());

		Preset.addItem(5, BORDER_A_ITEM.clone(), ChestMenuUtils.getEmptyClickHandler());
		Preset.addItem(43, BORDER_A_ITEM.clone(), ChestMenuUtils.getEmptyClickHandler());
		for (int i : getOutputSlots()) {
			Preset.addMenuClickHandler(i, new AdvancedMenuClickHandler() {

				@Override
				public boolean onClick(Player p, int slot, ItemStack cursor, ClickAction action) {
					return false;
				}

				@Override
				public boolean onClick(InventoryClickEvent e, Player p, int slot, ItemStack cursor,
						ClickAction action) {
					return cursor == null || cursor.getType() == null || cursor.getType() == Material.AIR;
				}
			});
		}
		Preset.addItem(43, BORDER_A_ITEM.clone(), ChestMenuUtils.getEmptyClickHandler());
	}

	public MachineRecipe getProcessing(Block b) {
		return processing.get(b);
	}

	public boolean isProcessing(Block b) {
		return getProcessing(b) != null;
	}

	public void registerRecipe(MachineRecipe recipe) {
		recipe.setTicks(recipe.getTicks() / getSpeed());
		recipes.add(recipe);
	}

	public void registerRecipe(int seconds, ItemStack[] input, ItemStack[] output) {
		registerRecipe(new MachineRecipe(seconds, input, output));
	}

	@Override
	public void preRegister() {
		addItemHandler(new BlockTicker() {
			@Override
			public void tick(Block b, SlimefunItem sf, Config data) {
				SpaceSuitOxygenInjector.this.tick(b);
			}

			@Override
			public boolean isSynchronized() {
				return false;
			}
		});
	}

	protected void tick(Block b) {
		new BukkitRunnable() {

			@Override
			public void run() {
				Bukkit.getPluginManager().callEvent(new MachineTickEvent(b));
			}

		}.runTask(ClayTech.getInstance());
		BlockMenu inv = BlockStorage.getInventory(b);
		// 机器正在处理
		if (isProcessing(b)) {
			// 剩余时间
			int timeleft = progress.get(b);

			if (timeleft > 0) {
				// 还在处理
				ChestMenuUtils.updateProgressbar(inv, 4, timeleft, processing.get(b).getTicks(), getProgressBar());

				if (ChargableBlock.isChargable(b)) {
					if (ChargableBlock.getCharge(b) < getEnergyConsumption())
						return;
					ChargableBlock.addCharge(b, -getEnergyConsumption());
					if (!LEAVES.contains(b.getLocation().add(0, 1, 0).getBlock().getType()))
						return;
					progress.put(b, timeleft - 1);
				} else {
					if (!LEAVES.contains(b.getLocation().add(0, 1, 0).getBlock().getType()))
						return;
					progress.put(b, timeleft - 1);
				}
			} else {
				// 处理结束
				inv.replaceExistingItem(4, Utils.addLore(Utils.newItem(Material.BLACK_STAINED_GLASS_PANE), " "));

				ItemStack spacesuit = item;
				if (RocketUtils.getOxygen(spacesuit) + 5 > RocketUtils.getMaxOxygen(spacesuit)) {
					RocketUtils.setOxygen(spacesuit, RocketUtils.getMaxOxygen(spacesuit));
				} else {
					RocketUtils.setOxygen(spacesuit, RocketUtils.getOxygen(spacesuit) + 5);
				}
				inv.replaceExistingItem(22, spacesuit);
				ClayTech.RunningInjectorsOxygen.remove(inv.toInventory());
				progress.remove(b);
				processing.remove(b);
			}
		} else {
			// 没有在处理
			ItemStack spacesuit = inv.getItemInSlot(22);
			if (spacesuit != null) {
				if (ClayTechManager.isSpaceSuit(spacesuit) && spacesuit.getAmount() == 1
						|| ClayTechManager.isOxygenDistributer(spacesuit) && spacesuit.getAmount() == 1) {
					if (ChargableBlock.isChargable(b)) {
						if (ChargableBlock.getCharge(b) < getEnergyConsumption())
							return;
						ChargableBlock.addCharge(b, -getEnergyConsumption());
					}
					if (!LEAVES.contains(b.getLocation().add(0, 1, 0).getBlock().getType()))
						return;
					if (RocketUtils.getOxygen(spacesuit) >= RocketUtils.getMaxOxygen(spacesuit))
						return;

					MachineRecipe oxygeninjectrecipe = new MachineRecipe(8, new ItemStack[] { spacesuit },
							new ItemStack[] {});
					item = spacesuit.clone();
					inv.consumeItem(22, 1);
					ClayTech.RunningInjectorsOxygen.put(inv.toInventory(), b);
					inv.replaceExistingItem(22, new ItemStack(Material.BEDROCK));
					processing.put(b, oxygeninjectrecipe);
					progress.put(b, oxygeninjectrecipe.getTicks());
				}
			}
		}
	}
}
