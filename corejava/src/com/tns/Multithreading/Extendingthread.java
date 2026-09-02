package com.tns.Multithreading;
// demo for multithreading

class Eclips extends Thread{
	public void run() {
		System.out.println("Eclips id :"+" "+Thread.currentThread().getId());
	}
}
	class Chrome extends Thread{
		public void run() {
			System.out.println("Chrome id :"+" "+Thread.currentThread().getId());
	}
	}
		class Notepad extends Thread{
			public void run() {
				System.out.println("Notepad id :"+" "+Thread.currentThread().getId());
		}
	
}

public class Extendingthread {
	public static void main(String[] args) {
		Eclips e=new Eclips();
		e.start();
		
		Chrome c=new Chrome();
		c.start();
		
		Notepad n=new Notepad();
		n.start();
		for(int i=0;i<5;i++);
		System.out.println("Main Thread ID"+" "+Thread.currentThread().getId());
	}

}
	
