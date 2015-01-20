package com.danpadgett;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadExample {

	public static final int THREAD_SIZE = 5;
	public static final int COUNT_MAX = 1000;
	
	
	public static void main(String[] args) {

		TestThread testThread = new TestThread();
		ExecutorService executor = Executors.newFixedThreadPool(THREAD_SIZE);
		for(int i = 0; i<COUNT_MAX; i++) {
			executor.submit(testThread);
		}
		executor.shutdown();
	}
}
