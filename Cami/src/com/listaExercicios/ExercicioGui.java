package com.listaExercicios;

import java.util.Scanner;

public class ExercicioGui {

	public static void main(String[] args) {

		//mandar o usu�rio digitar 10 n�meros e depois exibir o menor n�mero digitado por ele, o maior e depois os dois ao mesmo tempo

		Scanner numeros = new Scanner (System.in);

		int numero = 0;
		int menor = 10000000;
		int contador = 0;
		int maior = -100000000;

		for(;contador < 10; contador++) {
			System.out.println("Digite um n�mero: ");
			numero = numeros.nextInt();

			if (numero < menor) {
				menor = numero;
			}
			
			if (numero > maior) {
				maior = numero;
			}
			
		}

		System.out.println("O menor numero digitado foi: " + menor);
		System.out.println("O maior numero digitado foi: " + maior);

		numeros.close();

	}

}
