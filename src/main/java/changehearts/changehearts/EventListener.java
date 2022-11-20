package changehearts.changehearts;

import org.bukkit.*;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class EventListener implements Listener {
    @EventHandler
    public void onjoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        p.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(3);
    }

    @EventHandler
    public void onPlayerDamage(EntityDamageEvent e){
        if (command.ss == false)return;
        if(e.getEntity() instanceof Player){
            Player p = (Player)e.getEntity();
            p.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(p.getAttribute(Attribute.GENERIC_MAX_HEALTH).getBaseValue()+1);
        }
    }

    @EventHandler
    public void onDeth(PlayerDeathEvent e){
        Player p = e.getEntity().getPlayer();
        p.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(3);
        /*
        World w = p.getWorld();
        for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {
            // 全プレイヤー対象
            onlinePlayer.sendMessage(ChatColor.RED + p.getName() + " が死亡した!");
            Location l = onlinePlayer.getLocation();
            l.setY(l.getY() + 2);
            w.createExplosion(l,100F,true,true);
        }

         */
    }
/*
    @EventHandler
    public void onDiamond(EntityPickupItemEvent e){
        if(e.getEntity() instanceof Player && e.getItem().getItemStack().getType() == Material.DIAMOND){
            for(Player op: Bukkit.getOnlinePlayers()){
                op.getLocation().getWorld().playSound(op.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE,1,1);
                op.sendTitle(net.md_5.bungee.api.ChatColor.AQUA + "GAME CLEAR!!!", "体力が１の世界", 40, 110, 40);
            }
        }
    }
 */

}
