package com.tns.Interface;

interface Orderservice {
    boolean validateOrder(double amount);
    void ProcessPayment(double amount);
    void GenerativeInvoice(String OrderId, double amount);
    void UpdateorderStatus(String OderId, String Status);
}

class OnlineOrder implements Orderservice {

    private String customername;
    private String Orderid;

    public OnlineOrder(String customername, String orderid) {
        this.customername = customername;
        this.Orderid = orderid;
    }

    @Override
    public boolean validateOrder(double amount) {
        if (amount > 0) {
            System.out.println("Order validation successful");
            return true;
        }

        System.out.println("Invalid order amount");
        return false;
    }

    @Override
    public void ProcessPayment(double amount) {
        System.out.println("Processing payment: " + amount);
        System.out.println("Payment successful");
    }

    @Override
    public void GenerativeInvoice(String OrderId, double amount) {
        System.out.println("Invoice generated");
        System.out.println("Customer name: " + customername);
        System.out.println("Amount: " + amount);
    }

    @Override
    public void UpdateorderStatus(String OderId, String Status) {
        System.out.println("Order " + OderId + " status updated to: " + Status);
    }
}

public class Mainmethod {

    public static void main(String[] args) {

        OnlineOrder o = new OnlineOrder("Manu", "RD001");

        double amount = 3000;

        if (o.validateOrder(amount)) {
            o.ProcessPayment(amount);
            o.GenerativeInvoice("ORD1002", amount);
            o.UpdateorderStatus("ORD1003", "Confirmed");
        }
    }
}

