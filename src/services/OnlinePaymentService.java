package services;

public interface OnlinePaymentService {

	public Double interest(Double amount, Integer installmentNumber);
	public Double paymentFee(Double amount);
}
