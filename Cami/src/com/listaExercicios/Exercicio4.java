package com.listaExercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		//criar um programa que receba um número e diga se ele é um número primo

		Scanner numeros = new Scanner (System.in);

		int primo = 0;
		int i = 2;

		System.out.println("Por favor, digite um número: ");
		primo = numeros.nextInt();

		for (; i < primo; i++) {

			if (primo % i == 0) {
				break;
			} //quando o "i" sai do for, ele está com o valor atual do for, no caso o valor vai ser atualizado pelo i++
		}

		if(i == primo) {
			System.out.println("O número "+primo+" é primo");
		}else {
			System.out.println("O número " +primo+" não é primo");
		}

		System.out.println("\nObrigada pela sua visita!");

		numeros.close();

	}

}
