package com.listaExercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		//criar um programa que receba um n�mero e verifique se ele est� entre 0 e 10 e � par.

		Scanner programa = new Scanner (System.in);

		int numero = 0;

		do {
			System.out.println("Digite um n�mero de 0 a 10: ");
			numero = programa.nextInt();
		}
		while(!(numero >=0 && numero <=10));

		if(numero % 2 == 0)
			System.out.printf("O n�mero %d est� entre 0 e 10 e � par", numero);
		else
			System.out.printf("O n�mero %d est� entre 0 e 10 e n�o � par", numero);

		System.out.println("\n\nVolte sempre!");

		programa.close();
	}

}
