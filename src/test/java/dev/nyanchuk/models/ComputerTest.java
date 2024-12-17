package dev.nyanchuk.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ComputerTest {

    private Computer computer1;
    private Computer computer2;

    @BeforeEach
    void setUp() {
        // Create two computer objects with different attributes
        computer1 = new Computer("Dell", 16, "Intel i7", OperatingSystem.MS_WINDOWS, 1200);
        computer2 = new Computer("Apple", 8, "M1", OperatingSystem.APPLE_MACOS, 1500);
    }

    // Test Getters and Setters
    @Test
    void testGetters() {
        assertEquals("Dell", computer1.getBrand());
        assertEquals("Apple", computer2.getBrand());
        computer1.setBrand("HP");
        assertEquals("HP", computer1.getBrand());

        assertEquals(16, computer1.getMemory());
        assertEquals(8, computer2.getMemory());
        computer2.setMemory(16);
        assertEquals(16, computer2.getMemory());

        assertEquals("Intel i7", computer1.getProcessor());
        assertEquals("M1", computer2.getProcessor());
        computer1.setProcessor("Intel i9");
        assertEquals("Intel i9", computer1.getProcessor());

        assertEquals(OperatingSystem.MS_WINDOWS, computer1.getOperatingSystem());
        assertEquals(OperatingSystem.APPLE_MACOS, computer2.getOperatingSystem());
        computer2.setOperatingSystem(OperatingSystem.LINUX_UBUNTU);
        assertEquals(OperatingSystem.LINUX_UBUNTU, computer2.getOperatingSystem());

        assertEquals(1200, computer1.getPrice(), 0.01);
        assertEquals(1500, computer2.getPrice(), 0.01);
        computer1.setPrice(1300);
        assertEquals(1300, computer1.getPrice(), 0.01);
    }

    // Test the displayInfo method
    @Test
void testDisplayInfo() {
    // Create a stream to capture the output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    // Redirect System.out to the printStream
    System.setOut(printStream);

    // Call displayInfo to print to the new stream
    computer1.displayInfo();

    // Get the captured output as a string
    String output = outputStream.toString().trim(); // trim to remove extra spaces and newlines

    // Check if the output contains parts of the expected information
    assertTrue(output.contains("Brand: Dell"));
    assertTrue(output.contains("Memory: 16 GB"));
    assertTrue(output.contains("Processor: Intel i7"));
    assertTrue(output.contains("Operating System: Microsoft Windows"));
    assertTrue(output.contains("Price: $1200.0"));

    // Reset System.out to its original stream
    System.setOut(System.out);
}
}
