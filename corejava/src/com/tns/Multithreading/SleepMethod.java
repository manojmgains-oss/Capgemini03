package com.tns.Multithreading;

class Sleep extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Sleep id "+" "+Thread.currentThread().getId());
			try {
				sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}



public class SleepMethod {
public static void main(String[] args) {
	Sleep n= new Sleep();
	n.start();
}
}
