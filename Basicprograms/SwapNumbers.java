package com.telus.Basicprograms;

public class SwapNumbers {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		System.out.println("Before swapping:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// Swap the numbers
		int temp = a;
		a = b;
		b = temp;

		System.out.println("\nAfter swapping:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
