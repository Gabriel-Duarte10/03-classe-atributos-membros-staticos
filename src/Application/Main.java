package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;
import entities.Retangulo;


public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*Retangulo ret;
		ret = new Retangulo();
		System.out.println("Exercio 1");
		System.out.println("Digite a altura e a base do retangulo: ");
		ret.altura = sc.nextDouble();
		ret.base = sc.nextDouble();
		double arearet = ret.area();
		double perimetroret = ret.perimetro();
		double diagonal = ret.diagonal();
		System.out.println(arearet);
		System.out.println(perimetroret);
		System.out.println(diagonal);*/
		
		Funcionarios empregado;
		empregado = new Funcionarios();
		System.out.println("Exercicio 2");
		System.out.println("Digite o nome o salario bruto e a taxa consumida: ");
		empregado.name = sc.next();
		sc.next();
		empregado.salarioBruto = sc.nextDouble();
		empregado.taxa = sc.nextDouble();
		double salLiquido = empregado.salarioliquido();
		System.out.printf("Empregado: %s. R$%.2f\n", empregado.name, salLiquido);
		System.out.println("Digite a porcentagem de acrescimo");
		int acrescimo = sc.nextInt();
		double salarioTotal = empregado.salariofinal(acrescimo);
		System.out.printf("Salario total: %s. R$%.2f", empregado.name, salarioTotal);
		
		
		
		
		sc.close();
	}

}
