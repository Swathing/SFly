package net.swathingbr.fly;

import net.swathingbr.fly.cmd.Fly;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Master extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginCommand("fly").setExecutor(new Fly());
        Bukkit.getConsoleSender().sendMessage("§a[SFly] Enabled successfully!");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§c[SFly] Disabled successfully!");
    }
}
