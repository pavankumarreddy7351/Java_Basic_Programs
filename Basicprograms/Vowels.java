package com.telus.Basicprograms;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		String name=new Scanner(System.in).nextLine();
//		int count=0;
//		for(int i=0;i<name.length();i++) {
//			char ch=name.charAt(i);
//			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch==' ') {
//				count++;
//			}
//		}
//		System.out.println(count);
		int count=0;
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch==' ') {
				count++;
			}
		}
		System.out.println(count);


	}

}
