package Programas;

import java.util.HashMap;
import java.util.Map;

public class Map_Test {

	public static void main(String[] args) {

		Map<String, Integer> myMap = new HashMap<>();

		myMap.put("Key1", 1);
		myMap.put("Key2", 2);
		myMap.put("Key3", 3);
		myMap.put("Key4", 4);
		myMap.put("Key4", 356);
		

		myMap.keySet().remove("Key1");
		
		
		System.out.println(myMap.containsKey("Key1"));
		

		myMap.put("Key1", 1);

		for (String key : myMap.keySet()) {
			System.out.println("Key: " + key.toString() + " Value: " + myMap.get(key));
		}

	}

}
