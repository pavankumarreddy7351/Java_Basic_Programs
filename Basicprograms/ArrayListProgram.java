package com.telus.Basicprograms;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayListProgram {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		System.out.println("Default size of ArrayList is " + list.size());
		list.add("array");
		System.out.println(list);


		Vector<String> vector = new Vector<>();
		int defaultCapacity = vector.capacity();
		System.out.println("Default capacity of Vector is " + defaultCapacity);
		System.out.println("Default size of Vector is " + vector.size());

		Vector<String> v=new Vector<String>();

		v.add("pavan");
		v.add("paone");
		v.add("pa1");
		v.add("pavan");
		v.add("paone");
		v.add(0,"1st place");
		v.add(1,"Second place");
		v.add("paone");


		System.out.println(v);
		System.out.println("Size :"+v.size());
		System.out.println(v.get(0));
		System.out.println("Capacity :"+v.capacity());

		v.add("pa1");
		v.add(0,"pavan");
		v.add("paone");

		System.out.println(v);
		System.out.println(v.get(0));
		System.out.println("Size :"+v.size());
		System.out.println("Capacity :"+v.capacity());



		ArrayList<String> a=new ArrayList<String>();

		a.add("pavan");
		a.add("paone");
		a.add("pa1");
		a.add("pawan");
		a.add("paone");
		a.add(0,"1st place");
		a.add(1,"Second place");
		a.add("paone");
		a.add(0,"1st place");
		a.add(1,"Second place");
		a.add("paone");

		System.out.println(a);
		System.out.println("Size :"+a.size());
		System.out.println(a.get(0));


		a.add("pa1");
		a.add(0,"pawan");
		a.add("paone");

		System.out.println(a);
		System.out.println(a.get(0));
		System.out.println("Size :"+a.size());

	}

}
