package me.Schaffer79;

import org.bukkit.plugin.java.JavaPlugin;
import me.Schaffer79.DomuzListener;

public class Main extends JavaPlugin {


    public void onEnable(){
        getLogger().info("Gunah plugini aktif");
        getServer().getPluginManager().registerEvents(new DomuzListener(), this);
    }

}