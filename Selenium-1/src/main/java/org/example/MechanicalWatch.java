package org.example;
class MechanicalWatch extends AnalogWatch {

    // Using the final keyword to indicate that this field cannot be changed
    private final int maxWindingTimes;

    public MechanicalWatch(String brand, String type, int maxWindingTimes) {
        super(brand, type);
        this.maxWindingTimes = maxWindingTimes;
    }

    @Override
    public void wind() {
        System.out.println(getBrand() + " Mechanical Watch needs to be wound to work.");
    }

    // Example of using final keyword
    public final int getMaxWindingTimes() {
        return maxWindingTimes;
    }
}