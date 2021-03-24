package classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client_order {

	private String name;
	private String email;
	private Date birthDate;

	public Client_order(String name, String email, Date birthDate) {
		super();
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String ToString() {
		SimpleDateFormat sdf1 = new SimpleDateFormat("DD//MM/YYYY");

		return "Client: " + this.name + "(" + sdf1.format(birthDate) + ") - " + this.email + "\n";

	}

}
