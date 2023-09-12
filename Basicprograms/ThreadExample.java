package com.telus.Basicprograms;


public class ThreadExample extends Thread {

    private String name;

    public ThreadExample(String name) {
        this.name = name;
        System.out.println("Thread "+Thread.currentThread().getName());

    }

    @Override
	public void run() {
    	System.out.println("Thread "+Thread.currentThread().getName());

        for (int i = 1; i <= 10; i++) {
            System.out.println(name + ": " + i);
            System.out.println("Thread "+Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadExample("Thread 1"));
        Thread t2 = new Thread(new ThreadExample("Thread 2"));
        Thread t3 = new Thread(new ThreadExample("Thread 3"));
        Thread t4 = new Thread(new ThreadExample("Thread 4"));
        Thread t5 = new Thread(new ThreadExample("Thread 5"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads have finished.");
    }
}


