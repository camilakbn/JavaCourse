package com.listaExercicios;

import java.util.Scanner;

public class ExercicioGui2 {

	public static void main(String[] args) {

		//pe�a pra o usu�rio digitar um n�mero e imprima o n�mero seguinte a ele
		//o programa termina quando o usu�rio digitar um valor negativo

		Scanner programa = new Scanner (System.in);

		int numero = 0;	

		while(numero >= 0) {
			System.out.println("Digite um n�mero: ");
			numero = programa.nextInt();
			System.out.printf("O n�mero digitado foi %d \n", numero);			

			if (numero >= 0) {
				System.out.printf("O n�mero seguinte ao digitado � %d \n\n", ++numero);			
			}
		}

		System.out.println("Obrigada!");

		programa.close();

	}

}
