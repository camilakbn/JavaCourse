package com.listaExercicios;

import java.util.Scanner;

public class ExercicioNumerosImpares {

	public static void main(String[] args) {

		//perguntar ao usuário se ele quer que mostre número ímpar ou par de 1 a 100

		Scanner numeros = new Scanner (System.in);

		String numero = "";

		System.out.println("Você gostaria de exibir números pares ou ímpares?");
		numero = numeros.next();

		if(numero.equalsIgnoreCase("pares")) {

			for(int par = 2; par <= 100; par+=2) {
				System.out.println(par);
			}
		}
		
		else if(numero.equalsIgnoreCase("ímpares")) {
			
			for(int impar = 1; impar <= 100; impar+=2) {
				System.out.println(impar);
			}
		}
		
		else
			System.out.println("Nenhuma opção escolhida, obrigada e volte sempre!");

		numeros.close();
	}

}
