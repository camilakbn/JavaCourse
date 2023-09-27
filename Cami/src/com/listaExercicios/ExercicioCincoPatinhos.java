package com.listaExercicios;

import java.util.Scanner;

public class ExercicioCincoPatinhos {

	public static void main(String[] args) {

		/* Xuxa, a rainha dos baixinhos, criou uma m�sica que tem o segunte formato:

		n patinhos foram passear
		Al�m das montanhas
		Para brincar
		A mam�e gritou: Qu�, qu�, qu�, qu�Mas s� n-1 patinhos voltaram de l�.


		Que se repete at� nenhum patinho voltar de l�.
		Ao final, todos os patinhos voltam:

		A mam�e patinha foi procurar
		Al�m das montanhas
		Na beira do mar
		A mam�e gritou: Qu�, qu�, qu�, qu�
		E os n patinhos voltaram de l�.

		Crie um programa em Java que recebe um inteiro positivo do usu�rio e exibe a m�sica inteira na tela, 
		onde o inteiro recebido representa o n�mero inicial n de patinhos que foram passear. 

		fazer para que na pergunta s� sejam v�lidos n�meros acima de 0
		 */

		Scanner musica = new Scanner (System.in);

		int quantidade = 0,
				quantidadeInicial = 0;

		do {
			System.out.println("Segundo a m�sica, quantos patinhos foram passear?");
			quantidade = musica.nextInt(); 
			quantidadeInicial = quantidade;
		}

		while(quantidade <= 0); 
		
		for(; quantidade >=1; quantidade--) {

			int quantidade2 = quantidade-1;
			System.out.printf("\n\n%d patinhos foram passear \nAl�m das montanhas para brincar"
					+ "\nA mam�e gritou: Qu�, qu�, qu�, qu� \nMas s� %d patinhos voltaram de l�.\n\n", quantidade, quantidade2);	
		}

		System.out.printf("\n\nA mam�e patinha foi procurar \nAl�m das montanhas na beira do mar"
				+ "\nA mam�e gritou: Qu�, qu�, qu�, qu� \nE os %d patinhos voltaram de l�.", quantidadeInicial);

		musica.close();
	}

}
