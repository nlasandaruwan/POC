package com.runable;

public class MyRunnable2 implements Runnable{

	@Override
	public void run() {
		for (int x = 1; x <= 10; x++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Run by MyRunnable2 : " + Thread.currentThread().getName()+ ", x is " + x);
		}
	}

}
