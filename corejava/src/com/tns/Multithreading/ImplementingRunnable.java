package com.tns.Multithreading;

class whatsapp implements Runnable{

	@Override
	public void run() {
	for(int i=0;i<5;i++) {
		System.out.println("Eclips id:"+""+Thread.currentThread().getId());
	}
		
	}
	
}


public class ImplementingRunnable {
	public static void main(String[] args) {
		whatsapp w= new whatsapp();
		Thread obj=new Thread(w);
		obj.start();
		System.out.println("Main Thread :"+" "+Thread.currentThread().getId());
	}

}
