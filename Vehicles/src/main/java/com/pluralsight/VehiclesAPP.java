package com.pluralsight;

public class VehiclesAPP {
    public static void main(String[] args) {
        Moped slowRide = new Moped("Pink", 2, 1, 2);

        Car nissanGTR = new Car("Tiffany Blue", 4, 1, 20 );

        SemiTruck truck = new SemiTruck("Black", 2, 48000, 150);

        Hovercraft jetpack = new Hovercraft("Silver", 1, 0, 2);

        System.out.println("Moped color: " + slowRide.getColor());
        System.out.println("Nissan GT-R fuel capacity: " + nissanGTR.getFuelCapacity());
        System.out.println("SemiTruck cargo capacity: " + truck.getCargoCapacity());
        System.out.println("Hovercraft passengers: " + jetpack.getNumberOfPassengers());
    }
}
