package club.claycoffee.ClayTech.api.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

public class PlayerDrinkEvent extends Event {
	private Player eatPlayer;
	private ItemStack drink;
	private static final HandlerList handlers = new HandlerList();

	public PlayerDrinkEvent(Player p, ItemStack ClayFoodStack) {
		this.eatPlayer = p;
		this.drink = ClayFoodStack;
	}

	/**
	 *
	 * @return the player who drunk the food.
	 */
	public Player getPlayer() {
		return eatPlayer;
	}

	/**
	 *
	 * @return the drink drunk by the player.
	 */
	public ItemStack getDrink() {
		return drink;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
}