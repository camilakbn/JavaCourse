package com.listaExercicios;

import java.util.Scanner;

public class ExercicioNumeros {

	public static void main(String[] args) {

		//ver quantos pares e �mpares tem entre 1 e 100
		//pedir pra o usu�rio digitar um n�mero com valores acima de 1
		//o contador de �mpares e pares n�o entra no for

		Scanner contagem = new Scanner (System.in);

		int pares = 0;
		int impares = 0;
		int numeroUsuario = 0;

		while(numeroUsuario <= 1) {
			System.out.println("Digite um n�mero: ");
			numeroUsuario = contagem.nextInt();
		}

		for(int numero = 1; numero <= numeroUsuario; numero++) {

			if(numero % 2 == 0)
				pares++;	
			else
				impares++;
		}

		System.out.println("A quantidade de n�meros pares � de: " + pares);
		System.out.println("A quantidade de n�meros �mpares � de: " + impares);

		contagem.close();

	}

}
