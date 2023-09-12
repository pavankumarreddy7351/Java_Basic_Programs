package com.telus.Basicprograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter number");
		int n=new Scanner(System.in).nextInt();
		System.out.println(n);
		int r,sum=0,temp;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;

		}
		if(temp==sum) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("npalindrome");
		}


	}
}



