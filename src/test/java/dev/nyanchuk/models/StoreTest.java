package dev.nyanchuk.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class StoreTest {

    private Store store;
    private Computer computer1;
    private ArrayList<Computer> computerList;

    // Setup method, annotated with @BeforeEach to run before each test
    @BeforeEach
    void setUp() {
        // Initialize the computer list and add a computer
        computerList = new ArrayList<>();
        computer1 = new Computer(1, "Dell", 16, "Intel i7", OperatingSystem.MS_WINDOWS, 1200);
        computerList.add(computer1);

        // Initialize the store with the computer list
        store = new Store("Tech Store", "John Doe", "12345", computerList);
    }

    // Test the getter for computers
    @Test
    void testGetComputers() {
        assertEquals(computerList, store.getComputers());
    }

    // Test the setter for computers
    @Test
    void testSetComputers() {
        ArrayList<Computer> newComputerList = new ArrayList<>();
        Computer computer2 = new Computer(2, "HP", 8, "Intel i5", OperatingSystem.LINUX_UBUNTU, 900);
        newComputerList.add(computer2);

        store.setComputers(newComputerList);

        assertEquals(newComputerList, store.getComputers());
    }

    // Test store setters and getters
    @Test
    void testSetName() {
        store.setName("Compycom");
        assertEquals("Compycom", store.getName());
    }

    @Test
    void testSetOwner() {
        store.setOwner("Nelli Yanchuk");
        assertEquals("Nelli Yanchuk", store.getOwner());
    }

    @Test
    void testSetTaxId() {
        store.setTaxId("99999");
        assertEquals("99999", store.getTaxId());
    }
}
