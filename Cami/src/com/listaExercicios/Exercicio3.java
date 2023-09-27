package com.listaExercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		//criar um programa que receba duas notas parciais, calcular a m�dia final
		//se a nota do aluno for maior ou igual a 7.0 imprime no console "aprovado"
		//se a nota for menor que 7.0 e maior do que 4.0 imprime no console "recupera��o"
		//caso contr�rio, imprime no console "reprovado"

		// Vari�veis
		Scanner exercicio = new Scanner (System.in);
		String notaAtual = "";
		double nota1 = -1, nota2 = -1;
		boolean validarNota = true;
		
		System.out.println("Ol�!");
		while (validarNota) {
			System.out.println("Digite a sua primeira nota, de 0 a 10: ");
			notaAtual = exercicio.nextLine().replace(",", ".");
			nota1 = Double.parseDouble(notaAtual);
			if(nota1 >= 0 && nota1 <= 10)
				break;
			System.out.println("Nota digitada Inv�lida!\nPor favor digite um n�mero maior ou igual a 0 e menor ou igual a 10");
		}

		while (validarNota) {
			System.out.println("Digite a sua segunda nota, de 0 a 10: ");
			notaAtual = exercicio.nextLine().replace(",", ".");
			nota2 = Double.parseDouble(notaAtual);
			if(nota2 >= 0 && nota2 <= 10)
					break;
			System.out.println("Nota digitada Inv�lida!\nPor favor digite um n�mero maior qou igual a 0 e menor ou igual a 10");
		}
		
		double media = (nota1 + nota2) / 2;

		if (media >= 7)
			System.out.printf("Sua m�dia foi %.1f. Voc� est� aprovado!", media);

		else if (media >= 4)
			System.out.printf("Sua m�dia foi %.1f. Voc� est� em recupera��o!", media);

		else
			System.out.printf("Sua m�dia foi %.1f. Voc� est� reprovado!", media);

		System.out.println("\n\nBons estudos!");

		exercicio.close();

	}

}
