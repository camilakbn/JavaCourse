package com.listaExercicios;

import java.util.Scanner;

public class ExercicioParesImpares {

	public static void main(String[] args) {

		//criar um aplicativo que recebe um inteiro e mostra os n�meros pares e �mpares (separados), de 1 at� esse inteiro

		Scanner programa = new Scanner (System.in);

		int valor = 0;
		int x = 1;

		while(valor <= 0) {
			System.out.println("Digite um n�mero: ");
			valor = programa.nextInt();
		}

		/*
		 * 
		 * vc vai fazer de x at� "valor"
		 * vc precisa incrementar o x at� ele ter o mesmo valor de "valor"
		 * x � um numero que vai ser incrementado e validado a cada vez que o loop rodar:
		 * 	EX: x = 1 ... x � par? se sim imprima. x = 2...
		 * esse x � a variavel que vai ser incrementada at� chegar no valor "valor".
		 * */
		
		System.out.println("N�meros pares entre 1 e " + valor);
		
		for(; x <= valor; x++) {
			
			if(x % 2 == 0) {
				System.out.println(x);
			}
		}
		
		System.out.println("\nN�meros �mpares entre 1 e " + valor);
		
		for(x = 1; x <= valor; x++) {

			if(!(x % 2 == 0)) {
				System.out.println(x);
			}
		}
		
		programa.close();

	}
}