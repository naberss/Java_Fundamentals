package Programas;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Pipeline_Demo {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5);

		Stream<Integer> st1 = myList.stream().map(x -> x + 10);

		int sum = st1.reduce(0, (x, y) -> (x + y));
		System.out.println(sum);

		List<Integer> newList = myList.stream()
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10)
				.collect(Collectors
						.toList());
		
		System.out.println(newList.toString());

	}

}
