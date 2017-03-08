package com.amit.javacode;

public class ThreadMain 
{
	public static void main(String[] args) throws Exception {
		System.out.println("Thread example");
		ThreadExample t = new ThreadExample();
		new Thread(t,"one").start();
		ThreadExample t1 = new ThreadExample();
		Thread two = new Thread(t1, "two");
		two.start();
		
		if(Thread.currentThread().getName().equalsIgnoreCase("one"))
		{
			System.out.println("Here");
			two.join();
		}
		
		//new ThreadExample().start();
	}
}
