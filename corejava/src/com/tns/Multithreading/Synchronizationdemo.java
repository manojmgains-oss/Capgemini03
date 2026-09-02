package com.tns.Multithreading;

class Account{
	int balance=1000;
	synchronized void deposit(int amount) {
		System.out.println(Thread.currentThread().getName()+" is depositing: "+amount);
		int currentbalance=balance;
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		balance=currentbalance+amount;
		System.out.println(Thread.currentThread().getName()+ " complete balance: "+balance);
	}
}

class DepositeTask implements Runnable{
  Account account;
  DepositeTask(Account account){
	  this.account=account;
  }
	@Override
	public void run() {
	account.deposit(500);
		
	}
	
}

public class Synchronizationdemo {
public static void main(String[] args) {
	Account account= new Account();
	DepositeTask d=new DepositeTask(account);
	
	Thread t1=new Thread(d,"Manu");
	Thread t2=new Thread(d,"shaiob");
	
	t1.start();
	t2.start();
	
}
}
