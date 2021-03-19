package classes;

import java.util.Date;

public class Hour_Contract {

	private Date date;
	private Double Value_Per_Hour;
	private Integer Hours;

	public Hour_Contract(Date date, Double value_Per_Hour, Integer hours) {
		this.date = date;
		Value_Per_Hour = value_Per_Hour;
		Hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValue_Per_Hour() {
		return Value_Per_Hour;
	}

	public void setValue_Per_Hour(Double value_Per_Hour) {
		Value_Per_Hour = value_Per_Hour;
	}

	public Integer getHours() {
		return Hours;
	}

	public void setHours(Integer hours) {
		Hours = hours;
	}

	public Double total_value() {
		return (this.Value_Per_Hour * this.Hours);

	}

}
