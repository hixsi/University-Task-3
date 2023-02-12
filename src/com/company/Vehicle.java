package com.company;

import java.util.Comparator;

public class Vehicle implements Comparable<Vehicle> {
    double weight;
    int isEmergencyVehicle;

    public Vehicle(double weight, int isEmergencyVehicle) {
        this.weight = weight;
        this.isEmergencyVehicle = isEmergencyVehicle;
    }

    public double getWeight() {
        return weight;
    }

    public int isEmergencyVehicle() {
        return isEmergencyVehicle;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "weight=" + weight +
                ", isEmergencyVehicle=" + isEmergencyVehicle +
                '}';
    }

    @Override
    public int compareTo(Vehicle o) {

        return Integer.compare(this.isEmergencyVehicle,o.isEmergencyVehicle);
    }

    public static Comparator<Vehicle> comparatorByWeight = (v1,v2) -> Double.compare(v1.weight,v2.weight);
    public static Comparator<Vehicle> comparatorByEmergency = (v1,v2) -> Double.compare(v1.isEmergencyVehicle,v2.isEmergencyVehicle);
}
