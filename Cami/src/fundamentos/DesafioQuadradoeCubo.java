package fundamentos;

import java.util.Scanner;

public class DesafioQuadradoeCubo {

	public static void main(String[] args) {
		
		//criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor
		
		Scanner mathpow = new Scanner (System.in);
		
		System.out.println("Digite um n�mero: ");
		double numero = mathpow.nextDouble();
		
		double numero2 = Math.pow(numero, 2);
		
		double numero3 = Math.pow(numero, 3);
		
		System.out.printf("Os valores do n�mero digitado ao quadrado e ao cubo s�o %.0f e %.0f", numero2, numero3);

		mathpow.close();
		
	}

}
