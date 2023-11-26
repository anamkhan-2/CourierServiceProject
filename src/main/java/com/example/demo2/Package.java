package com.example.demo2;

 public class Package{
    private static int nextTrackingNumber = 1;
    private int trackingNumber;
    private Sender sender;
    private Receiver receiver;
    private PackageType type;
    private double weight;
    private double costPerKG;

    public Package(Sender sender, Receiver receiver, PackageType type, double weight, double costPerKG) {
        this.trackingNumber = nextTrackingNumber++;
        this.sender = sender;
        this.receiver = receiver;
        this.type = type;
        this.weight = weight;
        this.costPerKG = costPerKG;
    }

    public int getTrackingNumber() {
        return trackingNumber;
    }

    public Sender getSender() {
        return sender;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public PackageType getType() {
        return type;
    }

    public static int getNextTrackingNumber() {
        return nextTrackingNumber;
    }

    public static void setNextTrackingNumber(int nextTrackingNumber) {
        Package.nextTrackingNumber = nextTrackingNumber;
    }

    public void setTrackingNumber(int trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public void setType(PackageType type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCostPerKG() {
        return costPerKG;
    }

    public void setCostPerKG(double costPerKG) {
        this.costPerKG = costPerKG;
    }

    public double calculateShippingCost(){
        double totalCost;
        totalCost = getCostPerKG() * getWeight();
        return  totalCost;
    }


    @Override
    public String toString() {
        return "Package{" +
                "trackingNumber=" + trackingNumber +
                ", sender=" + sender +
                ", receiver=" + receiver +
                ", type=" + type +
                ", shippingCost=" + calculateShippingCost() +
                '}';
    }
}

