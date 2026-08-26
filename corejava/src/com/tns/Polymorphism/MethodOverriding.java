package com.tns.Polymorphism;

class BankAccount{
	void calculateInterest(double amount) {
		System.out.println("Calculate Standard Bank Interest");
		System.out.println("Amount" +amount);
	}
}
class SavingsAccount extends BankAccount{
	void calculateInterest(double amount){
	    double interest=amount*0.04;
		System.out.println("Saving Account");
		System.out.println("Principle :" +amount);
		System.out.println("Interest :" +interest);
	}
}
class FixedDeposit extends BankAccount{
	void calculateInterest(double amount) {
		double interest=amount*0.07;
		System.out.println("Fixed Deposite");
		System.out.println("principle :" +amount);
		System.out.println("Interest :" +interest);
	}
}
class CurrentAccount extends BankAccount{
	void calculateInterest(double amount) {
		System.out.println("current account");
		System.out.println("no interest provided");
	}
}
public class MethodOverriding{
public static void main(String[] args) {
	BankAccount a;
	a=new SavingsAccount();
	a.calculateInterest(10000);
	System.out.println();
	
	a=new FixedDeposit();
	a.calculateInterest(100000);
	System.out.println();
	
	a=new CurrentAccount();
	a.calculateInterest(10000);
}
}
