package com.listaExercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		//criar um programa que enquanto estiver recebendo n�meros positivos, imprime no console a soma dos n�meros inseridos
		//caso receba um n�mero negativo, encerre o programa. tente utilizar a estrutura do while

		Scanner programa = new Scanner (System.in);

		int numero = 0,
				soma = numero;

		while(numero >= 0) {
			System.out.println("Digite um n�mero: ");
			numero = programa.nextInt();
			
			if(numero >=0) {
				soma += numero; //isso � igual a: soma = soma + numero
				
				System.out.println("A soma dos n�meros �: " + soma);
			}
		}		
		
		System.out.println("Bye!");

		programa.close();

	}

}
