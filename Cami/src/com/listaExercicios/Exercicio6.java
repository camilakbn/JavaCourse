package com.listaExercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		//jogo da adivinha��o: tentar adivinhar um n�mero entre 0 e 100 ok
		//armazene um n�mero aleat�rio em uma vari�vel ok
		//o jogador tem 10 tentativas para adivinhar o n�mero gerado ok
		//ao final de cada tentativa, imprima a quantidade de tentativas restantes ok
		//e imprima se o n�mero inserido � maior ou menor do que o n�mero armazenado ok

		Scanner programa = new Scanner (System.in);

		int numero = 50;
		int respostaUsuario = 0;


		System.out.println("Ol�! Nesse desafio voc� ir� tentar adivinhar um n�mero que est� entre 0 e 100.");
		System.out.println("Voc� ter� 10 tentativas para adivinhar :)\n");

		for(int i = 10; i >=1 && i <= 10 ; i--) {
			System.out.printf("Por favor, digite um n�mero, voc� tem %d tentativas: \n", i);
			respostaUsuario = programa.nextInt();

			if(respostaUsuario > numero) {
				System.out.printf("O n�mero %d � maior que o n�mero que voc� est� tentando adivinhar.\n\n", respostaUsuario);
			}
			else if(respostaUsuario < numero) {
				System.out.printf("O n�mero %d � menor que o n�mero que voc� est� tentando adivinhar.\n\n", respostaUsuario);
			}
			else {
				System.out.printf("Parab�ns, voc� acertou, o n�mero � %d!! \n", numero);
				break;
			}
		}

		System.out.println("\nObrigada por participar do desafio!");

		programa.close();

	}

}
