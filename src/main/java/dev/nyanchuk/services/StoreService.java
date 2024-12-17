package dev.nyanchuk.services;

import dev.nyanchuk.models.*;

public class StoreService {

    // Add a computer to the store
    public void addComputer(Store store, Computer computer) {
        store.getComputers().add(computer);
    }

    // Remove a computer from the store by its brand
    public void removeComputer(Store store, String brand) {
        store.getComputers().removeIf(computer -> computer.getBrand().equals(brand));
    }

    // Search for a computer in the store by its brand
    public Computer searchComputer(Store store, String brand) {
        for (Computer computer : store.getComputers()) {
            if (computer.getBrand().equals(brand)) {
                return computer;
            }
        }
        return null; // Return null if no computer is found
    }

    // List all computers in the store
    public void listComputers(Store store) {
        for (Computer computer : store.getComputers()) {
            computer.displayInfo();
        }
    }
}
