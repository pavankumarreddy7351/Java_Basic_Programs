package com.telus.Basicprograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter Number");
		int n=new Scanner(System.in).nextInt();
//		int fact=1;
//		for(int i=1;i<=n;i++) {
//			fact=fact*i;
//		}
//		System.out.println(fact);
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
