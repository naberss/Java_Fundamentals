package Programas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import classes.HashCodeEquals_TestClass;

public class HashSet_Test {

	public static void main(String[] args) {

		Set<String> mySet = new HashSet<>();
		Set<String> mySet2 = new TreeSet<>();
		Set<String> mySet3 = new LinkedHashSet<>();
		Set<HashCodeEquals_TestClass> mySet4 = new HashSet<>();
		List<String> myList = new ArrayList<>();

		mySet.add("pera");
		mySet.add("mamao");
		mySet.add("Abacaxi");
		mySet.add("Abacaxi");

		mySet2.add("pera");
		mySet2.add("mamao");
		mySet2.add("Abacaxi");

		mySet3.add("pera");
		mySet3.add("mamao");
		mySet3.add("Abacaxi");

		mySet4.add(new HashCodeEquals_TestClass("Key1", "1"));
		mySet4.add(new HashCodeEquals_TestClass("Key2", "3"));
		mySet4.add(new HashCodeEquals_TestClass("Key2", "2"));

		myList.add("pera");
		myList.add("mamao");
		myList.add("banana");
		myList.add("saci");

		System.out.println(mySet.contains("pera"));
		System.out.println(mySet);
		System.out.println(myList);

		mySet.addAll(myList);

		System.out.println(mySet);
		System.out.println(mySet2);
		System.out.println(mySet3);
		System.out.println(mySet4);
		
		System.out.println(mySet4.size());
		

	}

}
