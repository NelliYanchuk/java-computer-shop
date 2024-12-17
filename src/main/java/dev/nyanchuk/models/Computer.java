package dev.nyanchuk.models;

public class Computer {
    private int id;
    private String brand;
    private int memory;
    private String processor;
    private OperatingSystem operatingSystem;
    private double price;

    // Constructor
    public Computer(int id, String brand, int memory, String processor, OperatingSystem operatingSystem, double price) {
        this.id = id;
        this.brand = brand;
        this.memory = memory;
        this.processor = processor;
        this.operatingSystem = operatingSystem;
        this.price = price;
    }

    public Computer() {
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to display computer information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Memory: " + memory + " GB");
        System.out.println("Processor: " + processor);
        System.out.println("Operating System: " + operatingSystem.getDescription());
        System.out.println("Price: $" + price);
    }

}
