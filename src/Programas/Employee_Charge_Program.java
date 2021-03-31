package Programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import classes.Employee;
import classes.OutsourcedEmployee;

public class Employee_Charge_Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Integer vld_opt = null;
		List<Employee> employee = new ArrayList<>();

		do {

			System.out.println(
					"1 - Enter new employee \n" + "2 - Show all registered employees \n" + "3 - Quit program \n");

			vld_opt = scan.nextInt();

			switch (vld_opt) {

			case 1:
				register_employee(employee);
				break;

			case 2:
				System.out.println(List_employees(employee));
				break;

			default:
				System.out.println("Option not found, try a valid one! \n");

			}

		} while (vld_opt != 3);
		scan.close();

	}

	public static void register_employee(List<Employee> employees) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter employee type \n" + "1 - normal \n" + "2 - outsourced \n");
		int vld_emp_type = scan.nextInt();

		while (vld_emp_type != 1 && vld_emp_type != 2) {
			System.out.println("Value unknown, please follow menu instructions");
			System.out.println("Enter employee type \n" + "1 - normal \n" + "2 - outsourced");
			vld_emp_type = scan.nextInt();
		}

		System.out.print("\nEnter employee name: ");
		String name = scan.next();

		System.out.print("\nEnter total hours of work per day: ");
		int hours = scan.nextInt();

		System.out.print("\nEnter value received per hour: ");
		double valuePerHour = scan.nextDouble();

		if (vld_emp_type == 1) {
			Employee emp = new Employee(name, hours, valuePerHour, "N");
			employees.add(emp);
		} else {
			System.out.print("\nEnter the additional Charge value: ");
			double additionalCharge = scan.nextDouble();
			OutsourcedEmployee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge, "O");
			employees.add(emp);
		}

		System.out.println("Employee sucessfully registered! \n");

	}

	public static String List_employees(List<Employee> employees) {

		StringBuilder sb = new StringBuilder();
		sb.append("PAYMENTS: \n");

		for (Employee employee : employees) {
			sb.append(employee.getName() + " - $ ");
			if (employee.getType().compareToIgnoreCase("n") == 0) {
				sb.append(employee.payment()+ "\n");

			} else {
				OutsourcedEmployee employee_aux = (OutsourcedEmployee) employee;
				sb.append(employee_aux.payment() + "\n");
			}
		}

		return sb.toString();

	}

}
