package com.tns.StreamAPI;

import java.util.Arrays;
import java.util.List;

class Items {

    private String electronic;
    private int price;

    public Items(String electronic, int price) {
        this.electronic = electronic;
        this.price = price;
    }

    public String getElectronic() {
        return electronic;
    }

    public void setElectronic(String electronic) {
        this.electronic = electronic;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return electronic + " : " + price;
    }
}

public class Exp2 {

    public static void main(String[] args) {

        List<Items> s1 = Arrays.asList(
            new Items("Laptop", 5000),
            new Items("Tablet", 500),
            new Items("Smartphone", 1000),
            new Items("MacBook", 5000)
        );

        List<Items> result = s1.stream()
            .filter(item -> item.getPrice() >= 5000)
            .toList();

        System.out.println(result);
    }
}
