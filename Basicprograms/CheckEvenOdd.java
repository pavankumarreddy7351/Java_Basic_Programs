package com.telus.Basicprograms;

public class CheckEvenOdd {
	public static void main(String[] args) {
		int number1 = 12345;
		int number2 = 12344;

		System.out.println("Input 1: " + number1);
		if (isEven(number1)) {
			System.out.println("Given number is even");
		} else {
			System.out.println("Given number is odd");
		}

		System.out.println("\nInput 2: " + number2);
		if (isEven(number2)) {
			System.out.println("Given number is even");
		} else {
			System.out.println("Given number is odd");
		}
	}

	public static boolean isEven(int number) {
		return number % 2 == 0;
	}
}
