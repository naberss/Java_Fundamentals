package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

	private List<T> list = new ArrayList<>();
	T macaco;

	public void addValue(T value) {
		list.add(value);
	}

	public T first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("What the f*** are u doing?");
		}
		return list.get(0);
	}
	
	public void print() {
		System.out.println();
	}

}
