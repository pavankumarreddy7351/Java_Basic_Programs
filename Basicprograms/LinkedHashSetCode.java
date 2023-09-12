package com.telus.Basicprograms;

import java.util.LinkedHashSet;

public class LinkedHashSetCode {
public static void main(String[] args) {

    LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

    linkedHashSet.add("one");
    linkedHashSet.add("two");
    linkedHashSet.add("three");
    linkedHashSet.add("four");

    System.out.println("Size of set: " + linkedHashSet.size());

    int index = 0;
    for (String element : linkedHashSet) {
        System.out.println("Element " + (index++) + ": " + element);
    }

    linkedHashSet.remove("four");

    System.out.println("Updated set: " + linkedHashSet);
    index = 0;
    for (String element : linkedHashSet) {
        System.out.println("Element " + (index++) + ": " + element);
    }

}
}
