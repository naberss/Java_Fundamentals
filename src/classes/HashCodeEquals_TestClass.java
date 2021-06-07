package classes;

public class HashCodeEquals_TestClass implements Comparable<HashCodeEquals_TestClass> {

	protected String name;
	protected String email;

	public HashCodeEquals_TestClass(String name, String email) {
		this.name = name;
		this.email = email;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashCodeEquals_TestClass other = (HashCodeEquals_TestClass) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(HashCodeEquals_TestClass o) {
		return name.compareToIgnoreCase(o.getName());
	}

	@Override
	public String toString() {
		return "HashCodeEquals_TestClass [name=" + name + ", email=" + email + "]";
	}

}
