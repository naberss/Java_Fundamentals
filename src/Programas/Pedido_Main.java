package Programas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import classes.Department;
import classes.Hour_Contract;
import classes.Worker;
import entidades.enums.Worker_Level;

public class Pedido_Main {

	public static void main(String[] args) throws ParseException {
		List<Worker> employees = new ArrayList<Worker>();
		register_user(employees);
		find_worker(employees);

	}

	public static void register_user(List<Worker> employees) throws ParseException {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the employee department: \n");
		String department = scan.next();

		System.out.println("Enter the employee name: \n");
		String name = scan.next();

		System.out.println("Enter the employee level: \n");
		String level = scan.next();

		System.out.println("Enter the employee base salary: \n");
		double bs_salary = scan.nextDouble();

		System.out.println("How many contracts will this person have? \n");
		int qtd_contracts = scan.nextInt();

		Department dpt = new Department(department);
		Worker worker = new Worker(name, Worker_Level.valueOf(level), bs_salary, dpt);

		System.out.println("First step completed, now let's move on for some contracts \n");

		for (int i = 0; i < qtd_contracts; i++) {

			System.out.println("Enter the " + (i + 1) + "º contract date: \n");
			String contract_Date = scan.next();
			SimpleDateFormat sdf1 = new SimpleDateFormat("DD/MM//YYYY");
			Date d1 = sdf1.parse(contract_Date);

			System.out.println("Enter the " + (i + 1) + "º contract value per hour: \n");
			Double value_per_hour = scan.nextDouble();

			System.out.println("Enter the " + (i + 1) + "º contract total hours: \n");
			int hours = scan.nextInt();

			Hour_Contract contract = new Hour_Contract(d1, value_per_hour, hours);
			worker.addContract(contract);

		}

		scan.close();
		employees.add(worker);

		System.out.println("Worker registered succesfully ! \n");
	}

	public static void find_worker(List<Worker> employees) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the employee name you wanna look for: \n");
		String worker = scan.next();

		List<Worker> result = employees.stream().filter(Worker -> Worker.getName().equalsIgnoreCase(worker))
				.collect(Collectors.toList());

		if (result != null) {

			for (Worker list : result) {
				System.out.println(list.toString());
				System.out.println("Wanna know the employee income? \n");
				String answer = scan.next();
				if (answer.charAt(0) == 'Y') {
					System.out.println("enter date (MM/YYYY) \n");
					String date = scan.next();
					System.out.println(" the income is " + list.getContractsIncome(date) + "\n");
				}

			}
			scan.close();
		} else
			System.out.println("No employee was found");
	}

}
