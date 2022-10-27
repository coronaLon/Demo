package pl.coronacreeper.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import pl.coronacreeper.Main;

public class Spawn implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(!Main.isPlayer(sender)) return true;

        Player p = (Player) sender;
        p.teleport(p.getWorld().getSpawnLocation());
        return false;
    }
}
