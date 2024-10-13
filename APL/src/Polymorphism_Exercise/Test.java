package Polymorphism_Exercise;

import java.util.Scanner;

public class Test {
    public static void main (String [] args) {
        // scanning inputs from user
        Scanner sc = new Scanner (System.in);
        String input = sc.nextLine();

        // creating car and truck objects
        Car car = new Car(5); // 5 liters per km
        Truck truck = new Truck(8); // 8 liters per km

        // parsing input commands
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String vehicleType = tokens[1];
            String action = tokens[0];
            double parameter = Double.parseDouble(tokens[2]);

            if (vehicleType.equals("Car")) {
                if (action.equals("Drive")) {
                    car.drive(parameter);
                } else if (action.equals("Refuel")) {
                    car.refuel(parameter);
                }
            } else if (vehicleType.equals("Truck")) {
                if (action.equals("Drive")) {
                    truck.drive(parameter);
                } else if (action.equals("Refuel")) {
                    truck.refuel(parameter);
                }
            }

            input = sc.nextLine();
        }

        // printing final fuel levels
        System.out.println(car);
        System.out.println(truck);
    }
}

// abstract class for vehicles
abstract class Vehicle {
    protected double fuelQuantity;
    protected double fuelConsumption;

    public Vehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    public abstract void drive(double distance);

    public abstract void refuel(double amount);

}

// subclass for car
class Car extends Vehicle {

    public Car(double fuelConsumption) {
        super(0, fuelConsumption + 0.9); // adding air conditioner consumption
    }

    @Override
    public void drive(double distance) {
        double fuelNeeded = distance * this.fuelConsumption;
        if (fuelNeeded > this.fuelQuantity) {
            System.out.println("Car needs refueling");
        } else {
            this.fuelQuantity -= fuelNeeded;
            System.out.printf("Car travelled %.0f km%n", distance);
        }
    }

    @Override
    public void refuel(double amount) {
        this.fuelQuantity += amount;
    }

    @Override
    public String toString() {
        return String.format("Car: %.2f", this.fuelQuantity);
    }

}

// subclass for truck
class Truck extends Vehicle {

    public Truck(double fuelConsumption) {
        super(0, fuelConsumption + 1.6); // adding air conditioner consumption
    }

    @Override
    public void drive(double distance) {
        double fuelNeeded = distance * this.fuelConsumption;
        if (fuelNeeded > this.fuelQuantity) {
            System.out.println("Truck needs refueling");
        } else {
            this.fuelQuantity -= fuelNeeded;
            System.out.printf("Truck travelled %.0f km%n", distance);
        }
    }

    @Override
    public void refuel(double amount) {
        this.fuelQuantity += amount * 0.95; // accounting for hole in tank
    }

    @Override
    public String toString() {
        return String.format("Truck: %.2f", this.fuelQuantity);
    }

}
