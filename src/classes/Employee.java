package classes;

public class Employee implements Comparable<Employee> {

	protected String name;
	protected Integer hours;
	protected Double ValuePerHour;
	protected String type;

	public Employee(String name, Integer hours, Double ValuePerHour, String type) {
		this.name = name;
		this.hours = hours;
		this.ValuePerHour = ValuePerHour;
		this.type = type;
	}

	public Employee(String name, Double ValuePerHour) {
		this.name = name;
		this.ValuePerHour = ValuePerHour;
	}

	public Employee() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return ValuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		ValuePerHour = valuePerHour;
	}

	public double payment() {
		return (this.hours * this.ValuePerHour);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("Name: " + this.name + " \n");
		sb.append("Total hours per day: " + this.hours + " \n");
		sb.append("Value per hour: " + this.ValuePerHour + " \n");
		sb.append("Type: " + this.type + " \n");

		return sb.toString();
	}

	@Override
	public int compareTo(Employee o) {
		return name.compareTo(o.getName());
	}

}
