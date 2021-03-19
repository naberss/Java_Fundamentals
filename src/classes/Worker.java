package classes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.enums.Worker_Level;

public class Worker {

	private String name;
	private Worker_Level level;
	private double base_salary;
	private Department department;
	private List<Hour_Contract> contracts = new ArrayList<>();

	public Worker(String name, Worker_Level level, Double base_salary, Department department) {
		this.name = name;
		this.level = level;
		this.base_salary = base_salary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Worker_Level getLevel() {
		return level;
	}

	public void setLevel(Worker_Level level) {
		this.level = level;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Hour_Contract> getContracts() {
		return contracts;
	}

	public Double getContractsIncome(String month_year) {
		double sum = 0;

		for (Hour_Contract list : this.contracts) {
			
			Calendar cal = Calendar.getInstance();
			cal.setTime(list.getDate());
			
			int P_year = Integer.parseInt(month_year.substring(3));
            int P_month =  Integer.parseInt(month_year.substring(0,1));
            
			if (cal.get(Calendar.YEAR) == P_year && (cal.get(Calendar.MONTH)+1) == P_month) {
				
				sum+= (list.getValue_Per_Hour() * list.getHours()); 
			}
		}

		return sum;
	}

	public double getBase_salary() {
		return base_salary;
	}

	public void setBase_salary(double base_salary) {
		this.base_salary = base_salary;
	}

	public void addContract(Hour_Contract contract) {
		contracts.add(contract);
	}

	public void removeContract(Hour_Contract contract) {
		contracts.remove(contract);
	}

	public Double income(int month, int year) {

		double sum = base_salary;
		Calendar cal = Calendar.getInstance();

		for (Hour_Contract c : contracts) {
			cal.setTime(c.getDate());
			int M1 = (cal.get(Calendar.MONTH) + 1);
			int Y1 = cal.get(Calendar.YEAR);
			if (M1 == month || Y1 == year) {
				sum += (c.total_value());
			}
		}
		return sum;

//-------------------------------------------------------------//

	}

}
