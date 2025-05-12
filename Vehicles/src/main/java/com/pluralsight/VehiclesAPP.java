package com.pluralsight;

public class VehiclesAPP {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Pink");
        slowRide.setFuelCapacity(2);
        slowRide.setNumberOfPassengers(2);

        Car nissanGTR = new Car();
        nissanGTR.setColor("Jet Black");
        nissanGTR.setFuelCapacity(20);
        nissanGTR.setNumberOfPassengers(4);

        SemiTruck truck = new SemiTruck();
        truck.setColor("Tiffany Blue");
        truck.setCargoCapacity(10000);
        truck.setNumberOfPassengers(2);

        Hovercraft jetpack = new Hovercraft();
        jetpack.setColor("Silver");
        jetpack.setFuelCapacity(1);
        jetpack.setNumberOfPassengers(1);

        System.out.println("Moped color: " + slowRide.getColor());
        System.out.println("Nissan GT-R fuel capacity: " + nissanGTR.getFuelCapacity());
        System.out.println("SemiTruck cargo capacity: " + truck.getCargoCapacity());
        System.out.println("Hovercraft passengers: " + jetpack.getNumberOfPassengers());
    }
}
