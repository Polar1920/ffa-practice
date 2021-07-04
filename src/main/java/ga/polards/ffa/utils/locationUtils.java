package ga.polards.ffa.utils;

import org.bukkit.Bukkit;
import org.bukkit.Location;

import java.util.Objects;

public class locationUtils {

    public static String serializeLocation(Location location){

        /*return location.getWorld().getName()
                + ":" + location.getX()
                + ":" + location.getY()
                + ":" + location.getZ()
                + ":" + location.getPitch()
                + ":" + location.getYaw();*/

        return Objects.requireNonNull(location.getWorld()).getName()
                + ":" + location.getX()
                + ":" + location.getY()
                + ":" + location.getZ()
                + ":" + location.getPitch()
                + ":" + location.getYaw();
    }

    public static Location deserializeLocation(String location){
        String[] locationParts = location.split(":");

        return new Location(Bukkit.getWorld(locationParts[0]),
                Double.parseDouble(locationParts[1]) + 0.5,
                Double.parseDouble(locationParts[2]),
                Double.parseDouble(locationParts[3]) + 0.5,
                Float.parseFloat(locationParts[4]),
                Float.parseFloat(locationParts[5])
        );
    }
}
