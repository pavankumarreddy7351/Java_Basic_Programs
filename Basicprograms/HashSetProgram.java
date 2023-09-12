package com.telus.Basicprograms;

import java.util.HashSet;

public class HashSetProgram {

	public static void main(String[] args) {

		 HashSet<String> s=new HashSet<>();
		 s.add("pavan");
		 s.add("paone");
		 s.add("pa1");
		 System.out.println("All elements :"+s.size());
		 System.out.println("All elements :"+s);
		 s.remove("pa1");
		 System.out.println("All elements :"+s);
		 HashSet<Integer> n=new HashSet<>();
		 n.add(123);
		 n.add(321);
		 n.add(231);
		 System.out.println("All elements :"+n);
		 HashSet<String> s1=new HashSet<>();
		 s1.add("prakash");
		 s.addAll(s1);
		 for (String element : s) {
	            System.out.println(element);
	        }

	}

}
