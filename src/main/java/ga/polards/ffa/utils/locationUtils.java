package ga.polards.ffa.utils;

import org.bukkit.Location;

import java.util.Objects;

public class locationUtils {

    public static String serializeLocation(Location location){
        //return Objects.requireNonNull(location.getWorld()).getName() + ":" + location.getX() + ":" + location.getY() + ":" + location.getZ() + ":" + location.getPitch() + ":" + location.getYaw();
        return location.getWorld().getName() + ":" + location.getX() + ":" + location.getY() + ":" + location.getZ() + ":" + location.getPitch() + ":" + location.getYaw();
    }
}
