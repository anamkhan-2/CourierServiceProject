package com.example.demo2;

public interface CourierService {
    void addPackage(Package p);
    void removePackageById(int trackingNumber);
    void displayPackages();

}

