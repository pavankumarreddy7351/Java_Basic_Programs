package com.telus.Basicprograms;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String name="earth";
		String name1="heart";
		name=name.toLowerCase();
		name1=name1.toLowerCase();
		if(name.length()==name1.length()) {
			char[] ch1=name.toCharArray();
			char[] ch2=name1.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean result=Arrays.equals(ch1, ch2);
			if(result) {
				System.out.println("a");
			}
			else {
				System.out.println("na");
			}
		}
		else {
			System.out.println("na");
		}
	}

}
