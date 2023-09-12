package com.telus.Basicprograms;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapCode {

	public static void main(String[] args) {
		TreeMap <Integer,String> h=new TreeMap<>();
		h.put(1,"Stundet-1");
		h.put(2,"Stundet-2");
		h.put(3,"Stundet-3");
		h.put(4,"Stundet-4");
		h.put(5,"Stundet-5");
		h.put(6,"Stundet-6");
		String student1=h.get(1);
		String student2=h.get(2);
		String student3=h.get(3);
		String student4=h.get(4);
		String student5=h.get(5);
		String student6=h.get(6);
		h.put(6, "Student-6");
		String student7=h.get(6);
		System.out.println(student6);
		System.out.println(student7);
		for (Map.Entry<Integer, String> entry : h.entrySet()) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key: " + key + ", Value: " + value);

		}

	}
}
