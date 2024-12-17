package dev.nyanchuk.services;

import dev.nyanchuk.models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StoreServiceTest {

    private Store store;
    private Computer computer1;
    private Computer computer2;
    private StoreService storeService;

    @BeforeEach
    void setUp() {
        // Initialize the store and computers
        store = new Store("Tech Store", "John Doe", "12345");
        computer1 = new Computer(1, "Dell", 16, "Intel i7", OperatingSystem.MS_WINDOWS, 1200);
        computer2 = new Computer(2, "Apple", 8, "M1", OperatingSystem.APPLE_MACOS, 1500);
        
        storeService = new StoreService();
        
        // Add computers to store
        storeService.addComputer(store, computer1);
        storeService.addComputer(store, computer2);
    }

    // Test adding a computer to the store
    @Test
    void testAddComputer() {
        assertEquals(2, store.getComputers().size()); // Ensure two computers are in the store
        Computer computer3 = new Computer(3, "HP", 8, "Intel i5", OperatingSystem.LINUX_UBUNTU, 1000);
        storeService.addComputer(store, computer3);
        assertEquals(3, store.getComputers().size()); // Ensure the new computer was added
    }

    // Test listing all computers in the store
    @Test
    void testListComputers() {
        storeService.listComputers(store);
        assertNotNull(store.getComputers()); // Ensure the list is not null
        assertTrue(store.getComputers().size() > 0); // Ensure there is at least one computer
    }

    // Test removing a computer from the store by its brand
    @Test
    void testRemoveComputer() {
        storeService.removeComputer(store, "Dell");
        assertEquals(1, store.getComputers().size()); // Only one computer should remain
        assertNull(storeService.searchComputer(store, "Dell")); // Searching for Dell should return null
    }

    // Test searching for a computer by its brand
    @Test
    void testSearchComputer() {
        Computer foundComputer = storeService.searchComputer(store, "Apple");
        assertNotNull(foundComputer); // Ensure the computer is found
        assertEquals("Apple", foundComputer.getBrand()); // Check if the found computer's brand is "Apple"
    }
}
