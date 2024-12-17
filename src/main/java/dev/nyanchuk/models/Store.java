package dev.nyanchuk.models;

import java.util.ArrayList;

public class Store {
    private String name;
    private String owner;
    private String taxId;
    private ArrayList<Computer> computers = new ArrayList<>();

    // Constructor
    public Store(String name, String owner, String taxId, ArrayList<Computer> computers) {
        this.name = name;
        this.owner = owner;
        this.taxId = taxId;
        this.computers = computers;
    }

    public Store(String name, String owner, String taxId) {
        this.name = name;
        this.owner = owner;
        this.taxId = taxId;
    }

    public Store() {
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public ArrayList<Computer> getComputers() {
        return computers;
    }

    public void setComputers(ArrayList<Computer> computers) {
        this.computers = computers;
    }
}

