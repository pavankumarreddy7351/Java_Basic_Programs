package com.telus.Basicprograms;

public class ThreadCode  extends Thread{
	public ThreadCode(String name) {
		super(name);
	}
	@Override
	public void run() {
		System.out.println("Thread "+ Thread.currentThread().getName()+" is running");

	}
	public static void main(String[] args) {

		ThreadCode t1=new ThreadCode("Thread one");
		ThreadCode t2=new ThreadCode("Thread two");
		t1.start();


		t1.run();
		t2.start();
		t2.run();

		Thread mainthread=Thread.currentThread();
		String mainThreadName = mainthread.getName();
		System.out.println("Main thread name:  "+mainThreadName);
	}

}
