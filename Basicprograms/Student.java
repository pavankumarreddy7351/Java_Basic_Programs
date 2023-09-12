package com.telus.Basicprograms;

import java.util.HashMap;
import java.util.Map.Entry;

public class Student {
	int id;
	String name;
	Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	public static void main(String[] args) {

		HashMap<Student,String> h=new HashMap();
		Student s1=new Student(1,"Student-1");
		Student s2=new Student(2,"Student-2");
		Student s3=new Student(3,"Student-3");
		Student s4=new Student(4,"Student-4");
		Student s5=s2;
		Student s6=new Student(6,"Student-5");

		h.put(s1,"A");
		h.put(s2,"B");
		h.put(s3,"C");
		h.put(s4, "A");
        h.put(s5,"C");
		h.put(s6, "A");
		for (Entry<Student, String> entry : h.entrySet()) {
			Student key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key: " + key.id + ", Value: " + value);

		}
	}


}
