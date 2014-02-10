import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;



public class DomuzListener implements Listener {


    @EventHandler(priority = EventPriority.HIGH)

    public void onPlayerClick(PlayerInteractEvent event)
    {
        Player player = event.getPlayer();
        if((event.getAction() == Action.RIGHT_CLICK_BLOCK) || (event.getAction() == Action.RIGHT_CLICK_AIR))
        {
            if(player.getItemInHand().getType() == Material.PORK || player.getItemInHand().getType() == Material.GRILLED_PORK)
            {
                player.sendMessage(ChatColor.DARK_RED + "Günah olum domuz eti yenirmi çarpilacan simdi!");
                player.getWorld().strikeLightning(player.getLocation());
            }
        }
    }

}