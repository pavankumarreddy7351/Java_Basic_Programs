package com.telus.Basicprograms;

public class Swap_two_numbers {

	public static void main(String[] args) {
		int a=10,b=11;
		System.out.println(a+" "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
		// swap with out two numbers
		float first = 12.0f, second = 24.5f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        first = first - second;
        second = first + second;
        first = second - first;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);



	}

}
