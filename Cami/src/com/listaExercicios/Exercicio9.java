package com.listaExercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		//crie um programa que recebe 10 valores e ao final imprima o maior n�mero

		Scanner valores = new Scanner (System.in);

		int contador = 0;
		int valor = 0;
		int maior = -10000000;

		for(; contador < 10; contador++) {
			System.out.println("Digite um n�mero: ");
			valor = valores.nextInt();

			if(valor > maior) {
				maior = valor;
			}

		}

		System.out.println("O maior n�mero digitado foi: " + maior);

		valores.close();

	}

}
