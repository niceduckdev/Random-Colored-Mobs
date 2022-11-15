package niceduckdev.randomcoloredmobs;

import org.bukkit.plugin.java.JavaPlugin;

public final class RandomColoredMobs extends JavaPlugin {
    private static RandomColoredMobs instance;

    @Override
    public void onEnable() {
        instance = this;
        getServer().getPluginManager().registerEvents(new Listeners(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static RandomColoredMobs getInstance() {
        return instance;
    }
}
