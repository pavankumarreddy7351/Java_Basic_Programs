package com.telus.Basicprograms;

public class CheckIfStringIsNumber {
	public static void main(String[] args) {
		String input1 = "12345Test";
		String input2 = "12345";

		System.out.println("Input 1: " + input1);
		if (isNumber(input1)) {
			System.out.println("Given String is a number");
		} else {
			System.out.println("Given String is not a number");
		}

		System.out.println("\nInput 2: " + input2);
		if (isNumber(input2)) {
			System.out.println("Given String is a number");
		} else {
			System.out.println("Given String is not a number");
		}
	}

	public static boolean isNumber(String str) {
		try {
			Double.parseDouble(str); // Attempt to parse the string as a double
			return true; // If parsing is successful, it's a number
		} catch (NumberFormatException e) {
			return false; // If an exception is caught, it's not a number
		}
	}
}