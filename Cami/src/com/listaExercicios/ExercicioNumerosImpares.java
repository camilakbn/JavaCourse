package com.listaExercicios;

import java.util.Scanner;

public class ExercicioNumerosImpares {

	public static void main(String[] args) {

		//perguntar ao usu�rio se ele quer que mostre n�mero �mpar ou par de 1 a 100

		Scanner numeros = new Scanner (System.in);

		String numero = "";

		System.out.println("Voc� gostaria de exibir n�meros pares ou �mpares?");
		numero = numeros.next();

		if(numero.equalsIgnoreCase("pares")) {

			for(int par = 2; par <= 100; par+=2) {
				System.out.println(par);
			}
		}
		
		else if(numero.equalsIgnoreCase("�mpares")) {
			
			for(int impar = 1; impar <= 100; impar+=2) {
				System.out.println(impar);
			}
		}
		
		else
			System.out.println("Nenhuma op��o escolhida, obrigada e volte sempre!");

		numeros.close();
	}

}
