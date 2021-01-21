package entities;

public class Retangulo {
	
	public double altura;
	public double base;
	
	public double area() {
		return base*altura;
	}
	public double perimetro() {
		return 2*(base+altura);
	}
	public double diagonal() {
		return Math.sqrt(Math.pow(altura, 2)+Math.pow(base, 2));
	}
	
}
