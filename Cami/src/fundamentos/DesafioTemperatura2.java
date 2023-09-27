package fundamentos;

import java.util.Scanner;

public class DesafioTemperatura2 {

	public static void main(String[] args) {
		
		//criar um programa que leia a temperatura em celsius e converta para fahrenheit
		
		Scanner temperatura2 = new Scanner (System.in);
		
		System.out.println("Informe a temperatura em Celsius: ");
		double celsius = temperatura2.nextDouble();
		
		final double multiplicacao = 1.8;
		final double soma = 32;
		
		double fahrenheit = (celsius * multiplicacao) + soma;
		
		System.out.printf("A temperatura em Fahrenheit é de %.0f", fahrenheit);
				
		temperatura2.close();
		
	}

}
