package pl.coronacreeper.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pl.coronacreeper.Main;

public class Enderchest implements @Nullable CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(!Main.isPlayer(sender)) return true;
        Player player = (Player) sender;
        player.openInventory(player.getEnderChest());
        return false;
    }
}
