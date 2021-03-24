package Programas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import classes.Client_order;
import classes.Order_item;
import classes.Product_order;
import entidades.enums.OrderStatus;

public class Order_Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		List<Order_item> orders = new ArrayList<>();
		
		register_order(orders);
		

	}

	public static void register_order(List<Order_item> orders) throws ParseException {

		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("DD/MM/YYYY");

		System.out.println("Enter client name: \n");
		String client_name = scan.next();

		System.out.println("Enter client email: \n");
		String client_email = scan.next();

		System.out.println("Enter client birthdate (DD/MM/YYYY): \n");
		String client_birthdate_string = scan.next();
		Date client_birthdate = sdf1.parse(client_birthdate_string);
		Client_order client = new Client_order(client_name, client_email, client_birthdate);

		System.out.println("Enter order status: \n");
		String order_status = scan.next();
		OrderStatus status = OrderStatus.valueOf(order_status);

		Date Order_moment = new Date(System.currentTimeMillis());

		System.out.println("Enter product 1 name: \n");
		String p1_name = scan.next();

		System.out.println("Enter product 1 price: \n");
		Double p1_price = scan.nextDouble();

		Product_order p1 = new Product_order(p1_name, p1_price);

		System.out.println("Enter product 1 quantity: \n");
		int p1_quantity = scan.nextInt();
		scan.close();

		Order_item order1 = new Order_item(p1_quantity, p1);
		orders.add(order1);

		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment:" + sdf1.format(Order_moment) + "\n");
		sb.append("Order status:" + status + "\n");
		sb.append(client.toString());
		System.out.println(sb);
		double total_orders = 0;
		for (Order_item itens : orders) {
			System.out.println(itens.ToString());
			total_orders += itens.getPrice();
		}
		System.out.println("Total price: $" + total_orders);

	}

}
