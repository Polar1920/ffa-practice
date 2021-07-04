package ga.polards.ffa.utils;

import ga.polards.ffa.Main;
import org.bukkit.entity.Player;

public class lobbyManager {

    private Main main;

    public lobbyManager(Main main) {
        this.main = main;
    }

    public void setLobby(Player player) {
        main.getConfig();
    }

    public void getLobby() {
    }
}
