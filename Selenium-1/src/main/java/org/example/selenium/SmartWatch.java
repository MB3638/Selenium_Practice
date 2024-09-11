package org.example.selenium;

class SmartWatch extends Watch { // Inheritance
    private boolean hasHeartRateMonitor;

    public SmartWatch(String brand, String type, boolean hasHeartRateMonitor) {
        super(brand, type);
        this.hasHeartRateMonitor = hasHeartRateMonitor;
    }

    public boolean hasHeartRateMonitor() {
        return hasHeartRateMonitor;
    }

    public void setHeartRateMonitor(boolean hasHeartRateMonitor) {
        this.hasHeartRateMonitor = hasHeartRateMonitor;
    }

    // Polymorphism
    @Override
    public void displayTime() {
        System.out.println(getBrand() + " SmartWatch is displaying time with advanced features.");
    }
}