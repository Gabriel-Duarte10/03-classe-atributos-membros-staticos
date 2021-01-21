package entities;

public class Funcionarios {
	
	public String name;
	public double salarioBruto;
	public double taxa;
	
	public double salarioliquido() {
		return salarioBruto-taxa;
	}
	public double salariofinal(int porcentagem) {
		return salarioliquido()+((salarioBruto*(double)porcentagem)/100);
		
	}
	
}
