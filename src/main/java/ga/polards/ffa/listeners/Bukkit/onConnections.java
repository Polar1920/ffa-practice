package ga.polards.ffa.listeners.Bukkit;

import ga.polards.ffa.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class onConnections implements Listener {

    private Main main;

    public onConnections(Main main) {
        this.main = main;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        //Bukkit.ge
    }
}
