package Programas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import classes.Generic_product;
import classes.Imported_product;
import classes.Used_product;

public class Program_products {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		List<Generic_product> products = new ArrayList<>();
		Integer vld_acao = null;

		do {

			System.out.println("\n1 - Register Product \n" + "2 - List Products \n" + "3 - Quit program \n");
			vld_acao = scan.nextInt();

			switch (vld_acao) {

			case 1:
				 register_product(products); 
				break;

			case 2:
				list_products(products);
				break;

			case 3:
				System.out.println("Thanks for the preference!");
				break;

			default:
				System.out.println("Invalid option, try an existing one!");
			}

		} while (vld_acao != 3);

		scan.close();

	}

	public static void register_product(List<Generic_product> products) throws ParseException {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter product type \n*1 - Generic\n*2 - Imported\n*3 - Used\n ");
		int type = scan.nextInt();

		while (type != 1 && type != 2 && type != 3) {
			System.out.print("Invalid option, one of the listed bellow \n");
			System.out.print("Enter product type (1 - Generic, 2 - Imported, 3 - Used): ");
			type = scan.nextInt();
		}

		System.out.print("Enter product name: ");
		String name = scan.next();

		System.out.print("Enter product price: ");
		double price = scan.nextDouble();

		if (type == 1) {
			Generic_product product = new Generic_product(name, price);
			products.add(product);
		} else if (type == 2) {
			System.out.print("Enter custom fee: ");
			double CustomFee = scan.nextDouble();

			Imported_product product = new Imported_product(name, price, CustomFee);
			products.add(product);
		} else {
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
			System.out.print("Enter manufacture date (DD/MM/YYYY): ");
			String manufacture_Date_text = scan.next();
			Date manufacture_Date = sdf1.parse(manufacture_Date_text);

			Used_product product = new Used_product(name, price, manufacture_Date);
			products.add(product);
		}

		System.out.println("Product Registered!");

	}

	public static void list_products(List<Generic_product> products) {
		for (Generic_product prod : products) {
			if (prod instanceof Imported_product) {
				System.out.println(((Imported_product) prod).priceTag());
			} else if (prod instanceof Used_product) {
				System.out.println(((Used_product) prod).priceTag());
			} else {
				System.out.println(prod.priceTag());
			}
		}

	}

}
