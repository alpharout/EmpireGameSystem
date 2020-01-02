package de.alpharout.egs.data;

import org.bukkit.Bukkit;

public class Data {
    private static String name = "§6Empire Game System";
    private static String prefix = "§7[" + name + "§7] ";
    private static String version = "v0.0.1 DEV-BUILD";
    private static String author = "alphaR0ut";

    public static String getName() {
        return name;
    }

    public static String getPrefix() {
        return prefix;
    }

    public static String getVersion() {
        return version;
    }

    public static String getAuthor() {
        return author;
    }

    public static void log(String msg) {
        Bukkit.getConsoleSender().sendMessage(prefix + msg);
    }
}
