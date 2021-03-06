package club.claycoffee.ClayTech.listeners;

import club.claycoffee.ClayTech.utils.Lang;
import club.claycoffee.ClayTech.utils.Utils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class ItemInteractListener implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void BlockPlaceEvent(BlockPlaceEvent e) {
        if (Utils.ExitsInList(Lang.readGeneralText("CantPlaceLore"), Utils.getLore(e.getItemInHand()))
                && !e.isCancelled()) {
            e.setCancelled(true);
            e.getPlayer().sendMessage(Lang.readGeneralText("CantPlace"));
        }

    }

    @SuppressWarnings("deprecation")
    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void PlayerInteractEvent(PlayerInteractEvent e) {
        if (e.hasItem()) {
            if (e.getItem().hasItemMeta() && !e.isCancelled()) {
                if (Utils.ExitsInList(Lang.readGeneralText("CantEat"), Utils.getLore(e.getItem()))) {
                    e.getPlayer().sendMessage(Lang.readGeneralText("CantEatMessage"));
                    e.setCancelled(true);
                    return;
                }
                if (Utils.ExitsInList(Lang.readGeneralText("CantInteract"), Utils.getLore(e.getItem()))
                        && e.hasBlock()) {
                    e.getPlayer().sendMessage(Lang.readGeneralText("CantInteractMessage"));
                    e.setCancelled(true);
                    return;
                }
            }
        }
    }
}
