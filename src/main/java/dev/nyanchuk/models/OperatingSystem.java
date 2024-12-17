package dev.nyanchuk.models;

public enum OperatingSystem {
    MS_WINDOWS("Microsoft Windows"),
    APPLE_MACOS("Apple macOS"),
    LINUX_UBUNTU("Linux Ubuntu"),
    UNIX_FREEBSD("Unix FreeBSD");

    private final String description;

    // Constructor
    OperatingSystem(String description) {
        this.description = description;
    }

    // Getter
    public String getDescription() {
        return description;
    }
}

