package Programas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import classes.Client_order;
import classes.Order_item;
import classes.Product_order;
import entidades.enums.OrderStatus;

public class Order_Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		List<Order_item> orders = new ArrayList<>();
		List<Client_order> clients = new ArrayList<>();
		Integer vld_acao = null;
		int global_order_id = 0;

		do {

			System.out.println(" 1 - Register client \n" + " 2 - Register Order \n" + " 3 - Delete Order \n"
					+ " 4 - Delete Client \n" + " 5 - Change Client registration \n"
					+ " 6 - List/Change Client Orders \n" + " 7 - Find Client \n"
					+ " 8 - How many clients are bellow 20 years? \n");

			vld_acao = scan.nextInt();

			switch (vld_acao) {

			case 1:
				register_client(clients);
				break;

			case 2:
				registration_type(orders, clients, global_order_id);
				break;

			case 3:
				delete_order(orders, clients);
				break;

			}

		} while (vld_acao != 5);

		scan.close();

	}

	public static void register_client(List<Client_order> clients) throws ParseException {

		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("DD/MM/YYYY");

		System.out.println("Enter client name: \n");
		String client_name = scan.next();

		System.out.println("Enter client email: \n");
		String client_email = scan.next();

		while (search_client(client_email, clients) != -1) {
			System.out.println("Email already registered, try a new one \n");
			System.out.println("Enter client email: \n");
			client_email = scan.next();
		}

		System.out.println("Enter client birthdate (DD/MM/YYYY): \n");
		String client_birthdate_string = scan.next();
		Date client_birthdate = sdf1.parse(client_birthdate_string);

		scan.close();

		Client_order client = new Client_order(client_name, client_email, client_birthdate);
		clients.add(client);

		System.out.println("Client registered! \n");

	}

	public static void registration_type(List<Order_item> orders, List<Client_order> clients, int global_order_id)
			throws ParseException {
		Scanner scan = new Scanner(System.in);

		System.out.println("1 - Use registered client \n" + "2 - Register a new one \n");
		Integer vld_acao = scan.nextInt();

		while (vld_acao != 1 || vld_acao != 2) {
			System.out.println("Option does not exists, use one of the numbers listed bellow \n");
			System.out.println("1 - Use registered client \n" + "2 - Register a new one \n");
			vld_acao = scan.nextInt();
		}

		scan.close();

		if (vld_acao == 1) {
			register_order1(orders, clients, global_order_id);
		} else {
			register_order2(orders, clients, global_order_id);
		}
	}

	public static void register_order1(List<Order_item> orders, List<Client_order> clients, int global_order_id) {
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("DD/MM/YYYY");

		System.out.println("Enter client email: \n");
		String client_email = scan.next();

		while (search_client(client_email, clients) == -1) {
			System.out.println("No client registered with this email \n");
			System.out.println("Enter an valid client email: \n");
			client_email = scan.next();
		}
		Client_order client = clients.get(search_client(client_email, clients));

		System.out.println("Enter order status: \n");
		String order_status = scan.next();
		OrderStatus status = OrderStatus.valueOf(order_status);

		Date Order_moment = new Date(System.currentTimeMillis());

		System.out.println("Enter product name: \n");
		String p1_name = scan.next();

		System.out.println("Enter product price: \n");
		Double p1_price = scan.nextDouble();

		Product_order p1 = new Product_order(p1_name, p1_price);

		System.out.println("Enter product quantity: \n");
		int p1_quantity = scan.nextInt();
		scan.close();

		Order_item order1 = new Order_item((global_order_id + 1), p1_quantity, p1, client);
		orders.add(order1);

		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment:" + sdf1.format(Order_moment) + "\n");
		sb.append("Order status:" + status + "\n");
		sb.append(client.toString());
		System.out.println(sb);

	}

	public static void register_order2(List<Order_item> orders, List<Client_order> clients, int global_order_id)
			throws ParseException {
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
		clients.add(client);

		System.out.println("Enter order status: \n");
		String order_status = scan.next();
		OrderStatus status = OrderStatus.valueOf(order_status);

		Date Order_moment = new Date(System.currentTimeMillis());

		System.out.println("Enter product name: \n");
		String p1_name = scan.next();

		System.out.println("Enter product price: \n");
		Double p1_price = scan.nextDouble();

		Product_order p1 = new Product_order(p1_name, p1_price);

		System.out.println("Enter product quantity: \n");
		int p1_quantity = scan.nextInt();
		scan.close();

		Order_item order1 = new Order_item((global_order_id + 1), p1_quantity, p1, client);
		orders.add(order1);

		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment:" + sdf1.format(Order_moment) + "\n");
		sb.append("Order status:" + status + "\n");
		sb.append(client.toString());
		System.out.println(sb);
	}

	public static int search_client(String email, List<Client_order> clients) {

		Integer index = null;
		Client_order result = (Client_order) clients.stream().filter(x -> x.getEmail().equalsIgnoreCase(email))
				.collect(Collectors.toList());

		index = clients.indexOf(result);

		return index;
	}

	public static void delete_order(List<Order_item> orders, List<Client_order> clients) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter client email: \n");
		String client_email = scan.next();

		while (search_client(client_email, clients) == -1) {
			System.out.println("No client registered with this email \n");
			System.out.println("Enter an valid client email: \n");
			client_email = scan.next();
		}

		Client_order client = clients.get(search_client(client_email, clients));

		List<Order_item> orders_result = orders.stream().filter(x -> x.getClient().equals(client))
				.collect(Collectors.toList());

		for (Order_item result_list : orders_result) {
			result_list.ToString();
		}

		System.out.println("select an order ID to be deleted: \n");

		final Integer deletable_id = scan.nextInt();

		Order_item exists_id = (Order_item) orders_result.stream().filter(x -> x.getOrder_id() == deletable_id)
				.collect(Collectors.toList());

		while (exists_id == null) {
			System.out.println("This order ID does not exist, for this client at least, try a valid one! \n");
			System.out.println("select the order ID to be deleted: \n");
			int deletable_id_aux = scan.nextInt();
			exists_id = (Order_item) orders_result.stream().filter(x -> x.getOrder_id() == deletable_id_aux)
					.collect(Collectors.toList());
		}

		scan.close();
		orders.remove(exists_id);

		System.out.println("Order sucessfully removed! \n");

	}

	
	/*
	 * public static void delete_client(List<Order_item> orders,List<Client_order>
	 * clients) { Scanner scan = new Scanner(System.in);
	 * System.out.println("Enter client Email \n"); final String client_email =
	 * scan.next();
	 * 
	 * Client_order client = (Client_order)clients.stream().filter(x ->
	 * x.getEmail().equalsIgnoreCase(client_email)).collect(Collectors.toList());
	 * 
	 * while(client == null) {
	 * System.out.println("Client not found, try an valid one! \n");
	 * System.out.println("Enter client Email \n"); String client_email_aux =
	 * scan.next(); client = (Client_order)clients.stream().filter(x ->
	 * x.getEmail().equalsIgnoreCase(client_email_aux)).collect(Collectors.toList())
	 * ; }
	 * 
	 * Client_order client_aux = client;
	 * 
	 * List<Order_item> valid_orders = orders.stream().filter(x ->
	 * x.getClient().equals(client_aux)||x.get).collect(Collectors.toList());
	 * 
	 * 
	 * if()
	 * 
	 * 
	 * 
	 * }
	 */
	
}



