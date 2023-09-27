package com.listaExercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		//criar um programa que informa se o ano atual é um ano bissexto

		Scanner anobissexto = new Scanner (System.in);

		System.out.println("Digite o ano: ");
		int ano = anobissexto.nextInt();

		if (ano % 4 == 0 && ((ano % 100) != 0 || ano % 400 == 0))
			System.out.printf("O ano de %d é um ano bissexto!", ano);
		else
			System.out.printf("O ano de %d não é um ano bissexto!", ano);

		System.out.println("\n\nObrigada!");

		anobissexto.close();

	}

}
