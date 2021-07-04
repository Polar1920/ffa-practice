package ga.polards.ffa;

import ga.polards.ffa.listeners.registerListeners;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        new registerListeners(this).onLoad();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
