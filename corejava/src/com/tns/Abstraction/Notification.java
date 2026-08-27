package com.tns.Abstraction;

abstract class Car {
    abstract void sendmessage(String message);
}

class Carspeed extends Car {

    @Override
    void sendmessage(String message) {
        String carStatus = "Moving in Highway";

        System.out.println("Car: BMW");
        System.out.println("Car Status: " +carStatus);
        System.out.println("Speed of Car: " +message);
    }
}

public class Notification {
    public static void main(String[] args) {
        Carspeed s = new Carspeed();
        s.sendmessage("TwoHundred Kilometers Per Hour");
    }
}
