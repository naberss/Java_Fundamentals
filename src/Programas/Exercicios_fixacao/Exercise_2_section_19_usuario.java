package Programas.Exercicios_fixacao;

public abstract class Exercise_2_section_19_usuario {

	protected int ID;
	protected String name;

	public Exercise_2_section_19_usuario(int ID, String name) {
		this.ID = ID;
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ID;
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
		Exercise_2_section_19_usuario other = (Exercise_2_section_19_usuario) obj;
		if (ID != other.ID)
			return false;
		return true;
	}

}
