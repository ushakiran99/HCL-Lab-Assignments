package com.main;

import java.util.Date;

import com.pojo.MyThread;

public class MyThreadMain {

	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		System.out.println("Initial thread is : " + mythread.getName());
		mythread.setName("MyThread");
		System.out.println("After changing the thread is : " + mythread.getName());
		System.out.println(new Date());
		mythread.start();
		System.out.println("The Thread is in sleep for 10 seconds");

	}

}
