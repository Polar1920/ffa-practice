package ga.polards.ffa.listeners;

import ga.polards.ffa.Main;
import ga.polards.ffa.listeners.Bukkit.onConnections;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

public class registerListeners {

    private final Main main;
    //private Object Listener;

    public registerListeners(Main main) { this.main = main; }

    public void onLoad(){
        //Bukkit.getPluginManager().registerEvents(new onConnections(main), main);
        register(new onConnections(main));
    }

    private void register(Listener listener){
        Bukkit.getPluginManager().registerEvents(listener, main);
    }
}
