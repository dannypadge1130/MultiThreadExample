package com.danpadgett;

public class TestThread implements Runnable {

	private static int counter = 0;
	
	public void run() {
		printCounter();
	}
	
	public synchronized void printCounter() {
		//if(counter % 2 == 0) {
			counter++;
//		} else {
//			counter--;
//		}
			
		System.out.println("Count: "+counter);	
	}
}
