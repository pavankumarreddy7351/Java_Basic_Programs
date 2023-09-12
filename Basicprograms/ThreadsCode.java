package com.telus.Basicprograms;

public class ThreadsCode extends Thread{

	@Override
	public void run() {
		System.out.println("Thread "+Thread.currentThread().getName());

		for(int i=1;i<=10;i++) {
			System.out.println("i values is :"+i);
			System.out.println("Thread "+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		ThreadsCode t1=new ThreadsCode();
		ThreadsCode t2=new ThreadsCode();
		t1.start();
		t1.run();
		t2.start();
		t2.run();
		ThreadsCode t3=new ThreadsCode();
		ThreadsCode t4=new ThreadsCode();
		t3.run();
		t4.run();
		System.out.println("Existing Main Thread");



	}

}
