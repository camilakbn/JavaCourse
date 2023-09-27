package com.listaExercicios;

import java.util.Scanner;

public class ExercicioGui2 {

	public static void main(String[] args) {

		//peça pra o usuário digitar um número e imprima o número seguinte a ele
		//o programa termina quando o usuário digitar um valor negativo

		Scanner programa = new Scanner (System.in);

		int numero = 0;	

		while(numero >= 0) {
			System.out.println("Digite um número: ");
			numero = programa.nextInt();
			System.out.printf("O número digitado foi %d \n", numero);			

			if (numero >= 0) {
				System.out.printf("O número seguinte ao digitado é %d \n\n", ++numero);			
			}
		}

		System.out.println("Obrigada!");

		programa.close();

	}

}
