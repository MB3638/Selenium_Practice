package org.example.selenium;

abstract class AnalogWatch extends Watch {

    public AnalogWatch(String brand, String type) {
        super(brand, type);
    }

    // Abstract method: Must be implemented by subclasses
    public abstract void wind();
}