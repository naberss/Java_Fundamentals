package Programas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import classes.HashCodeEquals_TestClass;

public class HashCodeEquals_Program {

	public static void main(String[] args) {

		List<HashCodeEquals_TestClass> list1 = Arrays.asList(
				new HashCodeEquals_TestClass("1", "lucas-berto@hotmail.com"),
				new HashCodeEquals_TestClass("1", "lucas-berto@hotmail.com"));

		List<HashCodeEquals_TestClass> list2 = Arrays.asList(
				new HashCodeEquals_TestClass("1", "sandrabberto@gmail.com"),
				new HashCodeEquals_TestClass("2", "sandrabberto@gmail.com"));

		System.out.println(list1.get(1).hashCode());
		System.out.println(list2.get(1).hashCode());

		if (list1.get(0).hashCode() == list1.get(1).hashCode()) {
			if (list1.get(0).equals(list1.get(1))) {
				System.out.println("identicos");
			} else {
				System.out.println("diferentes");
			}
		}

	}

}
