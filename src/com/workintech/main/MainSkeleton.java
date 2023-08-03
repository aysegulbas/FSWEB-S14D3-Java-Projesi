package com.workintech.main;

import com.workintech.RD.CarSkeleton;
import com.workintech.RD.ElectricCar;
import com.workintech.RD.GasPoweredCar;
import com.workintech.RD.HybridCar;

public class MainSkeleton {
    public static void main(String[] args) {
        System.out.println("*********************************************");
        System.out.println("[B] CarSkeleton Sınıfı Testleri:");
        System.out.println("---------------------------------------------------------");
        System.out.println("[1] carSkeleton Objesi Yaratma:");
        CarSkeleton carSkeleton = new CarSkeleton("Citroen", "C3");
        System.out.println(carSkeleton.startEngine());
        System.out.println(carSkeleton.drive());
        System.out.println("[2] carSkeleton Sınıfına Ait electricCar tipinde obje yaratma:");
        CarSkeleton electricCar = new ElectricCar("Citroen", "Model: Ami", 5.9, 5);
        System.out.println(electricCar.startEngine());
        System.out.println(electricCar.drive());
        System.out.println("[3] carSkeleton Sınıfına Ait electricCar tipinde obje yaratma:");
        CarSkeleton gasPoweredCar = new GasPoweredCar("Citroen", "Model: C4", 4.8, 4);
        System.out.println(gasPoweredCar.startEngine());
        System.out.println(gasPoweredCar.drive());
        System.out.println("[4] carSkeleton Sınıfına Ait hybridCar tipinde obje yaratma:");
        CarSkeleton hybridCar = new HybridCar("Toyota", "Model: Corolla", 4.6, 5, 4);
        System.out.println(hybridCar.startEngine());
        System.out.println(hybridCar.drive());
    }
}
