package Programas;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import classes.CarRental;
import classes.Vehicle;
import services.BrazilTaxService;
import services.RentalService;

public class Interfaces_solution {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		try (Scanner scan = new Scanner(System.in);) {

			System.out.println("Enter rental data:");
			System.out.print("Car model: ");
			String CarModel = scan.nextLine();
			System.out.print("Enter start date (dd/MM/yyyy hh:ss): ");
			Date start = sdf.parse(scan.next());
			System.out.print("Enter finish date (dd/MM/yyyy hh:ss): ");
			Date finish = sdf.parse(scan.next());

			CarRental cr = new CarRental(start, finish, new Vehicle(CarModel));

			System.out.println("Enter price per hour: ");
			double pricePerHour = scan.nextDouble();

			System.out.println("Enter price per day: ");
			double pricePerDay = scan.nextDouble();

			RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

			rentalService.processInvoice(cr);

			System.out.println(cr.getInvoice().toString());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
