package org.example.selenium;

class Watch { // Encapsulation
    private String brand;
    private String type;
    private static int watchCount = 0;

    public Watch(String brand, String type) {
        this.brand = brand;
        this.type = type;
        watchCount++;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void displayTime() {
        System.out.println(brand + " " + type + " is displaying time.");
    }

    public static int getWatchCount() {
        return watchCount;
    }
}