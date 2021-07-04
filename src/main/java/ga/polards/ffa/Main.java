package ga.polards.ffa;

import ga.polards.ffa.commands.registerCommands;
import ga.polards.ffa.listeners.registerListeners;
import ga.polards.ffa.utils.lobbyManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private lobbyManager lobbyManager;

    public Main() {
        this.lobbyManager = new lobbyManager(this);
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        new registerListeners(this).onLoad();
        new registerCommands(this).onCommands();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public lobbyManager getLobbyManager() {
        return lobbyManager;
    }
}
