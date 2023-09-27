package com.listaExercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		//criar um programa que receba duas notas parciais, calcular a média final
		//se a nota do aluno for maior ou igual a 7.0 imprime no console "aprovado"
		//se a nota for menor que 7.0 e maior do que 4.0 imprime no console "recuperação"
		//caso contrário, imprime no console "reprovado"

		// Variáveis
		Scanner exercicio = new Scanner (System.in);
		String notaAtual = "";
		double nota1 = -1, nota2 = -1;
		boolean validarNota = true;
		
		System.out.println("Olá!");
		while (validarNota) {
			System.out.println("Digite a sua primeira nota, de 0 a 10: ");
			notaAtual = exercicio.nextLine().replace(",", ".");
			nota1 = Double.parseDouble(notaAtual);
			if(nota1 >= 0 && nota1 <= 10)
				break;
			System.out.println("Nota digitada Inválida!\nPor favor digite um número maior ou igual a 0 e menor ou igual a 10");
		}

		while (validarNota) {
			System.out.println("Digite a sua segunda nota, de 0 a 10: ");
			notaAtual = exercicio.nextLine().replace(",", ".");
			nota2 = Double.parseDouble(notaAtual);
			if(nota2 >= 0 && nota2 <= 10)
					break;
			System.out.println("Nota digitada Inválida!\nPor favor digite um número maior qou igual a 0 e menor ou igual a 10");
		}
		
		double media = (nota1 + nota2) / 2;

		if (media >= 7)
			System.out.printf("Sua média foi %.1f. Você está aprovado!", media);

		else if (media >= 4)
			System.out.printf("Sua média foi %.1f. Você está em recuperação!", media);

		else
			System.out.printf("Sua média foi %.1f. Você está reprovado!", media);

		System.out.println("\n\nBons estudos!");

		exercicio.close();

	}

}
