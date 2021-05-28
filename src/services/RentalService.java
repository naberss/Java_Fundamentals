package services;

import java.util.concurrent.TimeUnit;

import classes.CarRental;
import classes.Invoice;

public class RentalService {

	private Double pricePerHour;
	private Double pricePerDay;

	private TaxService taxService;

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
	}

	public void processInvoice(CarRental carRental) {

		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();
		double hours = (double) TimeUnit.HOURS.convert((t2 - t1), TimeUnit.MILLISECONDS);

		double basicPayment;

		if (hours <= 12) {
			basicPayment = Math.ceil(hours) * pricePerHour;
		} else {
			basicPayment = (Math.ceil(hours) / 24) * pricePerDay;
		}

		double tax = this.taxService.tax(basicPayment);

		carRental.setInvoice(new Invoice(basicPayment, tax));

	}

}
