package ga.polards.ffa.commands;

import ga.polards.ffa.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.material.Command;

import java.util.Objects;

public class registerCommands {

    private Main main;

    public registerCommands(Main main) {
        this.main = main;
    }

    public void onCommands(){
        regCmd("ffaadmin", new ffaAdmin(main));
    }

    private void regCmd(String cmd, CommandExecutor executor){
        //Bukkit.getPluginCommand(cmd).setExecutor(executor);
        Objects.requireNonNull(Bukkit.getPluginCommand(cmd)).setExecutor(executor);
    }

    /*
    private void regCmd(CommandExecutor executor){
        //Bukkit.getPluginCommand(cmd).setExecutor(executor);
        Objects.requireNonNull(Bukkit.getPluginCommand("ffaadmin")).setExecutor(executor);
    }

    private void regCmd(String ffaadmin, CommandExecutor executor){
        Bukkit.getPluginCommand("ffa").setExecutor(executor);
    }*/

}
