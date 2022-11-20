package changehearts.changehearts;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    private EventListener listeners;
    @Override
    public void onEnable() {
        this.listeners = new EventListener();
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(this.listeners, this);
        getCommand("azhearts").setExecutor(new command());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
