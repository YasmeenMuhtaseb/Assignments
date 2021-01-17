package com.phone;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public void displayInfo() {
        System.out.println("Iphone "+this.getVersionNumber()+" from "+this.getCarrier());
    }

    @Override
    public String ring() {
        return "Iphone "+this.getVersionNumber()+" says " +this.getRingTone();
    }

    @Override
    public String unlock() {
        return "Unlocking Via facial recognition.";
    }
}