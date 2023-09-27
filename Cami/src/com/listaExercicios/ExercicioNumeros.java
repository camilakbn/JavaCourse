package com.listaExercicios;

import java.util.Scanner;

public class ExercicioNumeros {

	public static void main(String[] args) {

		//ver quantos pares e ímpares tem entre 1 e 100
		//pedir pra o usuário digitar um número com valores acima de 1
		//o contador de ímpares e pares não entra no for

		Scanner contagem = new Scanner (System.in);

		int pares = 0;
		int impares = 0;
		int numeroUsuario = 0;

		while(numeroUsuario <= 1) {
			System.out.println("Digite um número: ");
			numeroUsuario = contagem.nextInt();
		}

		for(int numero = 1; numero <= numeroUsuario; numero++) {

			if(numero % 2 == 0)
				pares++;	
			else
				impares++;
		}

		System.out.println("A quantidade de números pares é de: " + pares);
		System.out.println("A quantidade de números ímpares é de: " + impares);

		contagem.close();

	}

}
