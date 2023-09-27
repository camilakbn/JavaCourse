package com.listaExercicios;

import java.util.Scanner;

public class ExercicioParesImpares {

	public static void main(String[] args) {

		//criar um aplicativo que recebe um inteiro e mostra os números pares e ímpares (separados), de 1 até esse inteiro

		Scanner programa = new Scanner (System.in);

		int valor = 0;
		int x = 1;

		while(valor <= 0) {
			System.out.println("Digite um número: ");
			valor = programa.nextInt();
		}

		/*
		 * 
		 * vc vai fazer de x até "valor"
		 * vc precisa incrementar o x até ele ter o mesmo valor de "valor"
		 * x é um numero que vai ser incrementado e validado a cada vez que o loop rodar:
		 * 	EX: x = 1 ... x é par? se sim imprima. x = 2...
		 * esse x é a variavel que vai ser incrementada até chegar no valor "valor".
		 * */
		
		System.out.println("Números pares entre 1 e " + valor);
		
		for(; x <= valor; x++) {
			
			if(x % 2 == 0) {
				System.out.println(x);
			}
		}
		
		System.out.println("\nNúmeros Ímpares entre 1 e " + valor);
		
		for(x = 1; x <= valor; x++) {

			if(!(x % 2 == 0)) {
				System.out.println(x);
			}
		}
		
		programa.close();

	}
}