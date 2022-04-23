package net.ddns.mlgland.towerwars.events;

import net.ddns.mlgland.towerwars.events.player.OnPlayerJoin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerEvents implements Listener {

    @EventHandler
    public static void onPlayerJoin(PlayerJoinEvent event) {
        OnPlayerJoin.invoke(event);
    }

}
