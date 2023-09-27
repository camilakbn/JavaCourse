package com.listaExercicios;

import java.util.Scanner;

public class Exercício8 {

	public static void main(String[] args) {

		//criar um programa que receba uma palavra e imprime no console letra por letra

		Scanner palavras = new Scanner (System.in);

		String palavra = "";
		int contador = 0;

		System.out.println("Olá!");
		System.out.println("Digite uma palavra: ");
		palavra = palavras.next();

		char letras[] = palavra.toCharArray();
		
		for(; contador < letras.length; contador++) {
			System.out.println(letras[contador]);
		}

		System.out.println("\nGoodbye!");

		palavras.close();

	}

}
