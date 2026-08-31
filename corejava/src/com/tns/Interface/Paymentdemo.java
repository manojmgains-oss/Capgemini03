package com.tns.Interface;

interface Payment {
    void pay(double amount);
    void checkStatus();
}

class UPI implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }

    @Override
    public void checkStatus() {
        System.out.println("UPI Payment Successfully");
    }
}

public class Paymentdemo {

    public static void main(String[] args) {
        UPI n = new UPI();

        n.pay(12);
        n.checkStatus();
    }
}
