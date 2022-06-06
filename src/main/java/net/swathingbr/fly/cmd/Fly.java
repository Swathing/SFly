package net.swathingbr.fly.cmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player p = (Player)sender;
            if(p.hasPermission("fly.use")) {
                if(p.getAllowFlight() == false) {
                    p.setAllowFlight(true);
                    p.sendMessage("§aFly on");
                } else {
                    p.setAllowFlight(false);
                    p.sendMessage("§cFly off");
                }
            } else {
                p.sendMessage("§cNo permission!");
            }
        } else {
            sender.sendMessage("§cOnly players can execute this command.");
        }
        return false;
    }
}
