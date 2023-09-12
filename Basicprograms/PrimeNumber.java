package com.telus.Basicprograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter Number");
		int n=new Scanner(System.in).nextInt();
		System.out.println("Number is:"+n);

//		int flag=0;
//		int p=n/2;
//		if(n==0||n==1) {
//			System.out.println(" not prime");
//		}
//		else {
//			for(int i=2;i<=p;i++) {
//				if(n%i==0) {
//					System.out.println("not prime");
//					flag=1;
//					break;
//				}
//			}
//			if(flag==0) {
//				System.out.println("prime");
//			}
//		}
	int flag=0;
	int p=n/2;
	if(n==0||n==1) {
		System.out.println("not prime");
	}
	else {
		for(int i=2;i<=p;i++) {
			if(n%i==0) {
				System.out.println("not prime");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("prime");
		}
	}
	}

}
