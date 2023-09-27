package com.listaExercicios;

import java.util.Scanner;

public class ExercicioCincoPatinhos {

	public static void main(String[] args) {

		/* Xuxa, a rainha dos baixinhos, criou uma música que tem o segunte formato:

		n patinhos foram passear
		Além das montanhas
		Para brincar
		A mamãe gritou: Quá, quá, quá, quáMas só n-1 patinhos voltaram de lá.


		Que se repete até nenhum patinho voltar de lá.
		Ao final, todos os patinhos voltam:

		A mamãe patinha foi procurar
		Além das montanhas
		Na beira do mar
		A mamãe gritou: Quá, quá, quá, quá
		E os n patinhos voltaram de lá.

		Crie um programa em Java que recebe um inteiro positivo do usuário e exibe a música inteira na tela, 
		onde o inteiro recebido representa o número inicial n de patinhos que foram passear. 

		fazer para que na pergunta só sejam válidos números acima de 0
		 */

		Scanner musica = new Scanner (System.in);

		int quantidade = 0,
				quantidadeInicial = 0;

		do {
			System.out.println("Segundo a música, quantos patinhos foram passear?");
			quantidade = musica.nextInt(); 
			quantidadeInicial = quantidade;
		}

		while(quantidade <= 0); 
		
		for(; quantidade >=1; quantidade--) {

			int quantidade2 = quantidade-1;
			System.out.printf("\n\n%d patinhos foram passear \nAlém das montanhas para brincar"
					+ "\nA mamãe gritou: Quá, quá, quá, quá \nMas só %d patinhos voltaram de lá.\n\n", quantidade, quantidade2);	
		}

		System.out.printf("\n\nA mamãe patinha foi procurar \nAlém das montanhas na beira do mar"
				+ "\nA mamãe gritou: Quá, quá, quá, quá \nE os %d patinhos voltaram de lá.", quantidadeInicial);

		musica.close();
	}

}
