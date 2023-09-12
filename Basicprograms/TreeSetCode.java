package com.telus.Basicprograms;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetCode {
	  public static void main(String[] args) {

	        Integer[] array = {20,30};

	       TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(array));

	        boolean isAscending = true;
	        int previous = Integer.MIN_VALUE;
	        for (int current : treeSet) {
	            if (current < previous) {
	                isAscending = false;
	                break;
	            }
	            previous = current;
	        }

	        if (isAscending) {
	            System.out.println("The elements in the TreeSet are in ascending order.");
	        } else {
	            System.out.println("The elements in the TreeSet are not in ascending order.");
	        }
	    }
}
