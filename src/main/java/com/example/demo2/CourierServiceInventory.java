package com.example.demo2;


public class CourierServiceInventory implements CourierService{
    private Package[] packages = new Package[100];

    public CourierServiceInventory() {

    }

    public Package[] getPackages() {
        return packages;
    }

    public void setPackages(Package[] packages) {
        this.packages = packages;
    }

    public void addPackage(Package p) {
        for(int i =0; i<packages.length; i++) {
            if(packages[i] == null) {
                packages[i] = p;
                break;
            }
        }
    }
    public void removePackageById(int trackingNumber) {
        for(int i=0; i< packages.length; i++) {
            if(packages[i] !=null && packages[i].getTrackingNumber() == trackingNumber) {
                packages[i]=null;
                for(i = i+1;i< packages.length-1;i++) {
                    if(packages[i] != null){
                        packages[i].setTrackingNumber(packages[i].getTrackingNumber() - 1);
                    }
                }
                break;
            }
        }
    }
    public void displayPackages() {
        for(Package p: packages) {
            if(p != null) {
                System.out.println(p);
            }
        }
    }
    public Package searchPackage(int trackingNumber) {
        Package temp = null;
        for(int i=0; i< packages.length; i++) {
            if(packages[i] != null  &&  packages[i].getTrackingNumber()==trackingNumber) {
                temp = packages[i];
                break;
            }
        }
        return temp;
    }

}

