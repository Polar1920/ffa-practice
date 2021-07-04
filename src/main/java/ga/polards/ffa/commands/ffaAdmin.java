package ga.polards.ffa.commands;

import ga.polards.ffa.Main;
import ga.polards.ffa.utils.Statics;
import ga.polards.ffa.utils.Tools;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ffaAdmin implements CommandExecutor {

    private Main main;

    public ffaAdmin(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(cmd.getName().equalsIgnoreCase("ffaadmin")){
            if(!(sender instanceof Player)) {
                sender.sendMessage(Statics.PREFIX + Tools.color("Command only Players"));
                return true;
            }

            Player player = (Player) sender;

            String subCommand = args[0];

            if(subCommand.equalsIgnoreCase("setLobby")){
                main.getLobbyManager().setLobby(player);
            }

        }

        return false;
    }
}
