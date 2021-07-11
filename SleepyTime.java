package com.lethargic.SleepyTime;

import xyz.nkomarn.harbor.util.Config;

import java.util.Arrays;
import java.util.Optional;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLeaveBedEvent;

public class SleepyTime extends JavaPlugin implements Listener {

    @EventHandler
    public void onPlayerWakeUp(PlayerLeaveBedEvent event) {
        Bukkit.broadcastMessage("someone left a bed!");
    }

    private Config config;
    private Checker checker;
    private Messages messages;

    public void onEnable() {
        config = new Config(this);
        checker = new Checker(this);
        messages = new Messages(this);
        playerManager = new PlayerManager(this);
        essentials = (Essentials) pluginManager.getPlugin("Essentials");
    }

    @Override
    public void onDisable() {
    }

    @NotNull
    public Config getConfiguration() {
        return config;
    }
}
