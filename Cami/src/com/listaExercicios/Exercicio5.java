package com.listaExercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		//refatorar o exercício 4, utilizando a estrutura switch
		//criar um programa que receba um número e diga se ele é um número primo

		Scanner programa = new Scanner (System.in);

		String resposta = "",
			   valorResposta = "primo";
		int primo = 0;
		int i = 2;
		

		System.out.println("Por favor, digite um número: ");
		primo = programa.nextInt();

		for (; i < primo; i++) {

			if (primo % i == 0) {
				valorResposta = "nPrimo";
				break;
			} 
		}

		
		switch(valorResposta) {
		case "primo":
			resposta = "O número "+primo+" é primo";
			break;
		default:
			resposta = "O número " + primo + " não é primo";
			break;
		}
		
		System.out.println(resposta);







	programa.close();


}

}
