package Programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.AbstractShape;
import classes.Circle;
import classes.Color;
import classes.Rectangle;
import classes.Shape;

public class Program_shape {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer vld_acao = null;
		List<AbstractShape> shapes = new ArrayList<>();

		do {

			System.out.println("\n1 - register shape\n2 - List shapes");
			vld_acao = scan.nextInt();

			switch (vld_acao) {

			case 1:
				registerShape(shapes);
				break;

			case 2:
				listAreas(shapes);
				break;

			default:
				System.out.println("Invalid option, try again!");

			}

		} while (vld_acao != 3);
		scan.close();

	}

	public static void registerShape(List<AbstractShape> shapes) {
		Scanner scan = new Scanner(System.in);
		String color;
		Color real_color;
		System.out.print("Enter shape type (Rectancle - r or Circle - c): ");
		String vld_type = scan.next();

		while (vld_type.equalsIgnoreCase("c") == false && vld_type.equalsIgnoreCase("r") == false) {
			System.out.println("Invalid option, pleases select an valid one!");
			System.out.print("Enter shape type (Rectancle - r or Circle - c): ");
			vld_type = scan.next();
		}

		if (vld_type.equalsIgnoreCase("c")) {
			System.out.print("Enter circle radius: ");
			Double radius = scan.nextDouble();

			System.out.print("Enter circle color: ");
			color = scan.next();
			while (color.equals("Black") == false && color.equals("Blue") == false && color.equals("Red") == false) {
				System.out.print("Please enter an valid option between (Black, Blue, Red): ");
				System.out.print("Enter circle color: ");
				color = scan.next();
			}
			real_color = Color.valueOf(color);
			Circle circle = new Circle(radius, real_color);
			shapes.add(circle);

		} else {
			System.out.print("Enter rectangle width: ");
			Double width = scan.nextDouble();

			System.out.print("Enter rectangle height: ");
			Double height = scan.nextDouble();

			System.out.print("Enter rectangle color: ");
			color = scan.next();
			while (color.equals("Black") == false && color.equals("Blue") == false && color.equals("Red") == false) {
				System.out.print("Please enter an valid option between (Black, Blue, Red): ");
				System.out.print("Enter rectangle color: ");
				color = scan.next();
			}
			real_color = Color.valueOf(color);
			Rectangle rectangle = new Rectangle(width, height, real_color);
			shapes.add(rectangle);
		}

		System.out.println("Shape Registered!");

	}

	public static void listAreas(List<AbstractShape> shapes) {
		System.out.println("SHAPE AREAS: \n");

		for (Shape list : shapes) {

			if (list instanceof Circle) {
				System.out.println(((Circle) list).area());
			} else if (list instanceof Rectangle) {
				System.out.println(((Rectangle) list).area());

			}

		}

		System.out.println("End!");

	}

}
