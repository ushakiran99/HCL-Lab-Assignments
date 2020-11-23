package com.main;

public class DemoThread2 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("running child Thread in loop :" + Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.err.println(e);
			}
		}
	}

	public static void main(String[] args) {
		DemoThread1 demothread = new DemoThread1();
		Thread thread1 = new Thread(demothread);
		Thread thread2 = new Thread(demothread);
		Thread thread3 = new Thread(demothread);
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
