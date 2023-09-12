package com.telus.Basicprograms;

import java.util.Scanner;

public class Fibonacci_Series
{

	public static void main(String args[])
	{
		System.out.println("Enter Number");
		int n=new Scanner(System.in).nextInt();
		System.out.println("Number is "+n);
	int n1=0,n2=1,n3,count=n;
		for(int i=2;i<=count;i++) {
			n3=n2+n1;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;

		}



	}
}