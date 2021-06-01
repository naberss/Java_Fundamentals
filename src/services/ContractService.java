package services;

import java.util.Calendar;
import java.util.Date;

import classes.Contract;
import classes.Installment;

public class ContractService {

	public ContractService() {
	}

	public void processContract(Contract contract, int totalInstallments, OnlinePaymentService myService) {
		Date dueDate = contract.getDate();
		Calendar cal = Calendar.getInstance();
		cal.setTime(dueDate);

		for (int i = 1; i <= totalInstallments; i++) {
			cal.add(Calendar.MONTH, 1);
			Double installmentProcessedValue = (contract.getTotalValue() / totalInstallments);
			installmentProcessedValue += myService.interest(installmentProcessedValue, i);
			installmentProcessedValue += myService.paymentFee(installmentProcessedValue);
			Installment installment = new Installment(cal.getTime(), installmentProcessedValue, i);
			contract.addInstallments(installment);

		}

	}

}
