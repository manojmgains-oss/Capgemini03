package com.tns.Abstraction;

abstract class Delivery{
	abstract double calculateCharge(double distance);
	void ShowpDeleiveryType() {
		System.out.println("Select Delivery App");
	}
}
class BikeDelivery extends Delivery{

	@Override
	double calculateCharge(double distance) {
		// TODO Auto-generated method stub
		return distance*40;
	}
}
	class DroneDelivery extends Delivery{

		@Override
		double calculateCharge(double distance) {
			// TODO Auto-generated method stub
			return distance*60;
		}
		
	}
	

public class P1 {
public static void main(String[] args) {
	BikeDelivery b =new BikeDelivery();
	System.out.println("Bike Charge :" +b.calculateCharge(5));
		
	DroneDelivery d= new DroneDelivery();
	System.out.println("Drone Charge :" +d.calculateCharge(10));
}
}


