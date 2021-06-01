package services;

public class PaypalService implements OnlinePaymentService {

	public PaypalService() {
	}

	@Override
	public Double interest(Double amount, Integer installmentNumber) {
		return (amount * (0.01 * installmentNumber));
	}

	@Override
	public Double paymentFee(Double amount) {
		return (amount * 0.02);
	}

}
