package pl.coronacreeper.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import pl.coronacreeper.Main;

public class Fly implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(!Main.isPlayer(sender)) return true;

        Player player = (Player) sender;
        if(player.isFlying()) {
            player.setFlying(false);
        } else {
            player.setFlying(true);
        }

        player.sendMessage(ChatColor.GREEN+"Przełączono latanie!");
        return false;
    }
}
