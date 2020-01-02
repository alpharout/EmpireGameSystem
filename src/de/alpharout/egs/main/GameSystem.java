package de.alpharout.egs.main;

import de.alpharout.egs.data.Data;
import org.bukkit.plugin.java.JavaPlugin;

public class GameSystem extends JavaPlugin {
    private static GameSystem instance;

    @Override
    public void onEnable() {
        instance = this;

        Data.log("The system was started.");
    }

    @Override
    public void onDisable() {
        Data.log("The system was stopped.");
    }

    public GameSystem getInstance() {
        return instance;
    }
}
