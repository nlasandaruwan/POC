package com.test;

import com.runable.MyRunnable;
import com.runable.MyRunnable2;

public class ThreadTest {

	public static void main(String[] args) {
		
		MyRunnable myRunnable = new MyRunnable();
		MyRunnable2 myRunnable2 = new MyRunnable2();
		
		Thread thread1 = new Thread(myRunnable,"My Runnable 01 ");
		Thread thread2 = new Thread(myRunnable,"My Runnable 02 ");
		Thread thread3 = new Thread(myRunnable2,"My Runnable 03 ");
		Thread thread4 = new Thread(myRunnable2,"My Runnable 04 ");
		
		try {
			
			thread3.join();
			thread4.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}
}