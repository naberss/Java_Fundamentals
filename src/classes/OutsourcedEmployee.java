package classes;

public class OutsourcedEmployee extends Employee {

	private double additionalCharge;

	public OutsourcedEmployee(String name, Integer hours, Double ValuePerHour, double additionalCharge,String type) {
		super(name, hours, ValuePerHour,type);
		this.additionalCharge = additionalCharge;
	}

	@Override
	public double payment() {
		double plus_value = (this.additionalCharge + (this.additionalCharge * 0.1));
		return (this.hours * this.ValuePerHour) + plus_value;
	}

}
