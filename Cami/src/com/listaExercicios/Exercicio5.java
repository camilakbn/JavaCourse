package com.listaExercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		//refatorar o exerc�cio 4, utilizando a estrutura switch
		//criar um programa que receba um n�mero e diga se ele � um n�mero primo

		Scanner programa = new Scanner (System.in);

		String resposta = "",
			   valorResposta = "primo";
		int primo = 0;
		int i = 2;
		

		System.out.println("Por favor, digite um n�mero: ");
		primo = programa.nextInt();

		for (; i < primo; i++) {

			if (primo % i == 0) {
				valorResposta = "nPrimo";
				break;
			} 
		}

		
		switch(valorResposta) {
		case "primo":
			resposta = "O n�mero "+primo+" � primo";
			break;
		default:
			resposta = "O n�mero " + primo + " n�o � primo";
			break;
		}
		
		System.out.println(resposta);







	programa.close();


}

}
