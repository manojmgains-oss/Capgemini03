package com.tns.Interface;

interface GPS {
    void trackloaction();
    void calculateRoute();
}

interface VehicalSafety {
    void detectcollision();
    void applyemergencyBreak();
}

class SmartVehical implements GPS, VehicalSafety {

    String vehicalnumber;
    int model;
    double currentspeed;
    String location;
    boolean collisionDetection;
    double speedlimit;

    SmartVehical(String vehicalnumber, int model, double currentspeed,
                 String location, boolean collisionDetection, double speedlimit) {

        this.vehicalnumber = vehicalnumber;
        this.model = model;
        this.currentspeed = currentspeed;
        this.location = location;
        this.collisionDetection = collisionDetection;
        this.speedlimit = speedlimit;
    }

    @Override
    public void detectcollision() {
        collisionDetection = false;

        if (collisionDetection) {
            System.out.println("WARNING: Collision Detected");
            applyemergencyBreak();
        } else {
            System.out.println("No collision detected");
        }
    }

    @Override
    public void applyemergencyBreak() {
        currentspeed = 0;
        System.out.println("Emergency brake activated");
        System.out.println("Vehicle stopped safely");
    }

    @Override
    public void trackloaction() {
        System.out.println("Current location: " + location);
    }

    @Override
    public void calculateRoute() {
        String route = "Route: CityCenter -> MainRoad -> Airport";
        System.out.println(route);
    }
}

public class Task2 {

    public static void main(String[] args) {

        SmartVehical vehical = new SmartVehical(
            "KA01AB1234",
            2025,
            60.0,
            "CityCenter",
            false,
            80.0
        );

        vehical.trackloaction();
        vehical.calculateRoute();
        vehical.detectcollision();
    }
}

