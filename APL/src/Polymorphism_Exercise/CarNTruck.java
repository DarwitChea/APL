package Polymorphism_Exercise;

import java.util.Scanner;

public class CarNTruck{
    public static class Vehicle {
        double fuel, lpk, distance;

        public Vehicle(double fuel, double lpk) {
            this.fuel = fuel;
            this.lpk = lpk;
        }

        void drive(double distance) {
            double fuelNeed = distance * lpk;
            if(fuelNeed <= this.fuel){
                System.out.println("The car travelled "+ distance + " km");
                this.fuel -= fuelNeed;
            }
            else{
                System.out.println("The car need refuelling.");
            }
        }
        void refuel(double refuel){
            if(refuel <= 0){
                System.out.println("Invalid Input. Try again!");
                return;
            }
            this.fuel += refuel;
        }

        @Override
        public String toString() {
            return String.format(this.getClass().getSimpleName() + " : %.2f liters",this.fuel);
        }
    }

    public static class Car extends Vehicle{
        public Car(double fuel, double lpk) {
            super(fuel, lpk + 0.9);
        }
    }
    public static class Truck extends Vehicle{
        public Truck(double fuel, double lpk) {
            super(fuel, lpk + 1.6);
        }

        @Override
        void refuel(double refuel) {
            super.refuel(refuel*0.95);
        }
    }

    public static void main(String[] args) {
        // Car
        Scanner scn = new Scanner(System.in);
        String[] carQuery = scn.nextLine().split(" ");

        double carFuel = Double.parseDouble(carQuery[1]);
        double carLpk = Double.parseDouble(carQuery[2]);
        Car car = new Car(carFuel,carLpk);
        car.drive(9);
        System.out.println(car.toString());

        // Truck
        String truck = scn.nextLine();
        String[] truckQuery = truck.split(" ");

        double truckFuel = Double.parseDouble(truckQuery[1]);
        double truckLpk = Double.parseDouble(truckQuery[2]);
        Truck truck1 = new Truck(truckFuel,truckLpk);
        truck1.drive(10);
        System.out.println(truck1.toString());
    }
}
