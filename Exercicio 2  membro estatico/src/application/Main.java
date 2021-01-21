package application;

import java.util.Locale;
import java.util.Scanner;

import util.Conversor;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("exercicio de conversao");
		System.out.print("Digite o valor do dolar: ");
		double dolar = sc.nextDouble();
		
		System.out.print("Digite quanto vai comprar: ");
		double qtd = sc.nextDouble();
		
		double valor =  Conversor.dolar(dolar, qtd);
		
		System.out.printf("Voce vai gastar %.2f", valor);
		
		
		
		
		
		
		sc.close();
	}

}
