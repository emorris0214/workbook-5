package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        assets.add(new House("My house", "2003-03-13", 140000, "3618 4th Ave", 2, 1000, 5000));
        assets.add(new House("Auntie's house", "2019-04-1", 165000, "1626 4th Ave", 3, 1500, 7000));
        assets.add(new Vehicle("Mom's SUV", "2017-06-16", 31000, "Ford Escape", 2017, 100000));
        assets.add(new Vehicle("Dream Car", "2026-05-25", 77000, "Dodge Charger SRT Hellcat", 2022, 90000));
        assets.add(new Vehicle("Crash Out Mobile", "2025-05-13", 9000, "Honda Civic", 2012, 40000));
        assets.add(new Cash("Savings Account", "2021-08-20", 2000.50));
        assets.add(new Cash("Emergency Fund", "2025-01-01", 200.45));

        for (Asset a : assets) {
            System.out.println("Description: " + a.getDescription());
            System.out.println("Date Acquired: " + a.getDateAcquired());
            System.out.println("Original Cost: $" + a.getOriginalCost());
            System.out.println("Current Value is placed at: $" + a.getValue());

            if (a instanceof House) {
                House h = (House) a;
                System.out.println("Address: " + h.getAddress());
            } else if (a instanceof Vehicle) {
                Vehicle v = (Vehicle) a;
                System.out.println("Make/Model: " + v.getMakeModel());
                System.out.println("Year: " + v.getYear());
            }

            System.out.println("-----------------");

            /* Instantiating Asset: Compiler Error
            Asset a = new Asset("Invalid", "Today", 100.0);
             */

        }
      }
    }
