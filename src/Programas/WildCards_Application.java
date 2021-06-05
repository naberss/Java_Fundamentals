package Programas;

import java.util.ArrayList;
import java.util.List;

import classes.Circle;
import classes.Rectangle;
import services.MyShape;

public class WildCards_Application {

	public static void main(String[] args) {

		List<MyShape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));

		System.out.println("Total area: " + totalArea(myCircles));
	}

	public static double totalArea(List<? extends MyShape> list) {
		double sum = 0.0;
		for (MyShape s : list) {
			sum += s.area();
		}
		return sum;
	}
}