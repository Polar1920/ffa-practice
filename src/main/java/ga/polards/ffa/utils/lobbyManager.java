package ga.polards.ffa.utils;

import ga.polards.ffa.Main;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.Objects;

public class lobbyManager {

    private Main main;

    public lobbyManager(Main main) {
        this.main = main;
    }

    public void setLobby(Player player) {
        main.getConfig().set("spawn", locationUtils.serializeLocation(player.getLocation()));
        player.sendMessage(Tools.color(Statics.PREFIX + "location saved"));
    }

    public void getLobby(Player player) {
        if(main.getConfig().getString("spawn", "").isEmpty()) return;

        //Location location = locationUtils.deserializeLocation(main.getConfig().getString("spawn"));
        Location location = locationUtils.deserializeLocation(Objects.requireNonNull(main.getConfig().getString("spawn")));

        player.teleport(location);
    }

}
