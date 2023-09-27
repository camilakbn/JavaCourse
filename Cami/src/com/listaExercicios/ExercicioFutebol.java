package com.listaExercicios;

import java.util.Scanner;

public class ExercicioFutebol {

	public static void main(String[] args) {

		/*Desenvolver um algoritmo para, dados dois times de futebol (cada time identificado por um número inteiro), 
		 * seus pontos ganhos e seu saldo de gols no campeonato, decidir qual dos dois está em melhor colocação 
		 * (armazenando o resultado na variável ganhador). O resultado deve ser impresso. 
		 * A regra diz que está na frente no campeonato o time que tiver mais pontos ganhos, 
		 * com desempate pelo saldo de gols. */

		Scanner programa = new Scanner (System.in);

		int pontosTime1 = 0;
		int pontosTime2 = 0;
		int saldoGolsTime1 = 0;
		int saldoGolsTime2 = 0;

		System.out.println("Olá!");
		System.out.println("Insira aqui a quantidade de pontos do Time 1: ");
		pontosTime1 = programa.nextInt();
		System.out.println("Insira aqui o saldo de gols do Time 1: ");
		saldoGolsTime1 = programa.nextInt();
		System.out.println("Insira aqui a quantidade de pontos do Time 2: ");
		pontosTime2 = programa.nextInt();
		System.out.println("Insira aqui o saldo de gols do Time 2: ");
		saldoGolsTime2 = programa.nextInt();

		if(pontosTime1 > pontosTime2) {
			System.out.println("A quantidade de pontos do Time 1 foi de "+pontosTime1+", "
					+ "enquanto a quantidade de pontos do Time 2 foi de "+pontosTime2+", "
					+ "logo, o vencedor é o Time 1.");
		}
		else if ((pontosTime1 == pontosTime2) && (saldoGolsTime1 > saldoGolsTime2)){
			System.out.println("A quantidade de pontos dos times foi de "+pontosTime1+", "
					+ "então, pelo critério de desempate de saldo de gols, o Time 1 "
					+ "fez "+saldoGolsTime1+" gols, enquanto o Time 2 fez "+saldoGolsTime2+" gols, "
					+ "logo, o vencedor é o Time 1.");
		}
		else if ((pontosTime1 == pontosTime2) && (saldoGolsTime2 > saldoGolsTime1)){
			System.out.println("A quantidade de pontos dos times foi de "+pontosTime1+", "
					+ "então, pelo critério de desempate de saldo de gols, o Time 1 "
					+ "fez "+saldoGolsTime1+" gols, enquanto o Time 2 fez "+saldoGolsTime2+" gols, "
					+ "logo, o vencedor é o Time 2.");
		}
		else {
			System.out.println("A quantidade de pontos do Time 1 foi de "+pontosTime1+", "
					+ "enquanto a quantidade de pontos do Time 2 foi de "+pontosTime2+", "
					+ "logo, o vencedor é o Time 2.");
		}

		System.out.println("\nObrigada!");

		programa.close();

	}

}
