package pl.coronacreeper;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import pl.coronacreeper.commands.Enderchest;
import pl.coronacreeper.commands.Fly;
import pl.coronacreeper.commands.Spawn;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("fly").setExecutor(new Fly());
        getCommand("enderchest").setExecutor(new Enderchest());
        getCommand("spawn").setExecutor(new Spawn());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static boolean isPlayer(CommandSender commandSender) {
        if(commandSender instanceof Player) return true;
        commandSender.sendMessage(ChatColor.RED+"Musisz być graczem aby użyć tej komendy!");
        return false;
    }
}
