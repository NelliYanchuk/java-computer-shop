package dev.nyanchuk.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OperatingSystemTest {

    @Test
    void testGetDescription() {
        assertEquals("Microsoft Windows", OperatingSystem.MS_WINDOWS.getDescription());
        assertEquals("Apple macOS", OperatingSystem.APPLE_MACOS.getDescription());
        assertEquals("Linux Ubuntu", OperatingSystem.LINUX_UBUNTU.getDescription());
        assertEquals("Unix FreeBSD", OperatingSystem.UNIX_FREEBSD.getDescription());
    }

    @Test
    void testValueOf() {
        assertEquals(OperatingSystem.MS_WINDOWS, OperatingSystem.valueOf("MS_WINDOWS"));
        assertEquals(OperatingSystem.APPLE_MACOS, OperatingSystem.valueOf("APPLE_MACOS"));
        assertEquals(OperatingSystem.LINUX_UBUNTU, OperatingSystem.valueOf("LINUX_UBUNTU"));
        assertEquals(OperatingSystem.UNIX_FREEBSD, OperatingSystem.valueOf("UNIX_FREEBSD"));
    }

    @Test
    void testValues() {
        OperatingSystem[] osArray = OperatingSystem.values();
        assertEquals(4, osArray.length); // There are 4 enum constants
        assertEquals(OperatingSystem.MS_WINDOWS, osArray[0]);
        assertEquals(OperatingSystem.APPLE_MACOS, osArray[1]);
        assertEquals(OperatingSystem.LINUX_UBUNTU, osArray[2]);
        assertEquals(OperatingSystem.UNIX_FREEBSD, osArray[3]);
    }
}
