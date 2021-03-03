package Programas.Exercicios_fixacao;

public class Exercicio_1_section_8_classe {

	public double Height;
	public double Width;

	public double area() {
		return this.Height * this.Width;
	}

	public double perimeter() {
		return ((this.Height * 2) + (this.Width * 2));
	}

	public double diagonal() {
		return (Math.sqrt(Math.pow(this.Width, 2) + Math.pow(this.Height, 2)));
	}

	public boolean is_rectangle() {
		return (this.Width > this.Height ? true : false);
	}

	public String toString() {
		return "Retangulo -> \n" + "Altura: " 
	           + this.Height + "\n" 
			   + "Largura: " + this.Height + "\n" 
	           + "Área: "+ area() + "\n" 
	           + "Perimetro: " + this.perimeter() + "\n" 
	           + "Diagonal: " + this.diagonal() + "\n";
	}

}
