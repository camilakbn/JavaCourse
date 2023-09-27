package fundamentos;

import java.util.Scanner;

public class DesafioTemperatura {

	public static void main(String[] args) {
		
		//criar um programa que leia a temperatura em fahrenheit e conversa para celsius
		
		Scanner temperatura = new Scanner (System.in);
		
		System.out.print("Informe a temperatura em Fahrenheit: ");
		double fahrenheit = temperatura.nextDouble();
		
		final double subtracao = 32;
		final double divisao = 1.8;
		
		double celsius = (fahrenheit - subtracao) / divisao;
		
		System.out.printf("A temperatura em Celsius é de %.0f ", celsius);
		
		temperatura.close();

	}

}
