package com.telus.Basicprograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("enter string");

		String str=new Scanner(System.in).nextLine();
		String reverse="";
		char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);


	}

}
