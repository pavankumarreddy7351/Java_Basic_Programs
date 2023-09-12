package com.telus.Basicprograms;

import java.util.ArrayList;
import java.util.Iterator;



public class Iteration_AND_For_Each {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<>();
        arr.add("pavan");
        arr.add("Pawan");
        arr.add("paone");


        System.out.println("for-each loop:");
        for (String i : arr) {
            System.out.println(i);
        }


        System.out.println("Iterator:");
        Iterator<String> iterator = arr.iterator();
        while (iterator.hasNext()) {
            String i = iterator.next();
            System.out.println(i);
        }
	}

}
