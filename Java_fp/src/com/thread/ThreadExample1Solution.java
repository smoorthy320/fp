package com.thread;

public class ThreadExample1Solution {
	public static void main(String args[]) throws InterruptedException {
		ThreadExample1 nn = new ThreadExample1();
		System.out.println("Main Thread");
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Main Thread :" + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Main is exiting");
	}
}