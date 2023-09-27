package com.listaExercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		//jogo da adivinhação: tentar adivinhar um número entre 0 e 100 ok
		//armazene um número aleatório em uma variável ok
		//o jogador tem 10 tentativas para adivinhar o número gerado ok
		//ao final de cada tentativa, imprima a quantidade de tentativas restantes ok
		//e imprima se o número inserido é maior ou menor do que o número armazenado ok

		Scanner programa = new Scanner (System.in);

		int numero = 50;
		int respostaUsuario = 0;


		System.out.println("Olá! Nesse desafio você irá tentar adivinhar um número que está entre 0 e 100.");
		System.out.println("Você terá 10 tentativas para adivinhar :)\n");

		for(int i = 10; i >=1 && i <= 10 ; i--) {
			System.out.printf("Por favor, digite um número, você tem %d tentativas: \n", i);
			respostaUsuario = programa.nextInt();

			if(respostaUsuario > numero) {
				System.out.printf("O número %d é maior que o número que você está tentando adivinhar.\n\n", respostaUsuario);
			}
			else if(respostaUsuario < numero) {
				System.out.printf("O número %d é menor que o número que você está tentando adivinhar.\n\n", respostaUsuario);
			}
			else {
				System.out.printf("Parabéns, você acertou, o número é %d!! \n", numero);
				break;
			}
		}

		System.out.println("\nObrigada por participar do desafio!");

		programa.close();

	}

}
