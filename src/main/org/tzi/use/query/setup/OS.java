package org.tzi.use.query.setup;

public enum OS{
    LINUX {public String toString(){return "Linux";}},
    MACOS {public String toString(){return "MacOs";}},
    WINDOWS {public String toString(){return "Windows";}},
    UNKNOWN {public String toString(){return "Unknown";}}
}