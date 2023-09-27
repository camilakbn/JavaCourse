package com.listaExercicios;

import java.util.Scanner;

public class ExercicioSwitch {

	public static void main(String[] args) {

		/*Desenvolver um algoritmo para calcular o valor de uma cartela de passes de ônibus para um passageiro. 
		 * Uma cartela pode ter 50 ou 100 passes. Determinados tipos de usuários possuem desconto na compra de passes, 
		 * de acordo com a tabela abaixo: 
		 * idosos   50% 
		 * estudantes 50% 
		 * trabalhadores faixa I 50% 
		 * trabalhadores faixa II  25% 
		 * trabalhadores faixa I e estudante  75%
		 */

		Scanner programa = new Scanner (System.in);

		String resposta = "";
		int passes = 0;
		String conceito = "";
		String outroConceito = "";

		System.out.println("Olá!");
		System.out.println("Você pode comprar 50 ou 100 passes, quantos passes você irá comprar?");
		passes = programa.nextInt();
		System.out.println("Agora me diga em qual categoria você se enquadra?\n"
				+ "- Estudante\n"
				+ "- Idoso\n"
				+ "- Trabalhador faixa I\n"
				+ "- Trabalhador faixa II\n"
				+ "- Trabalhador faixa I e Estudante");
		resposta = programa.next();

		switch(passes) {
		case 50:
			conceito = "Você escolheu comprar 50 passes.";
			switch(resposta) {
			case "Estudante":
				outroConceito = "Você tem 50% de desconto na compra dos passes.";
				break;
			case "Idoso":
				outroConceito = "Você tem 50% de desconto na compra dos passes.";
				break;
			case "Trabalhador faixa I":
				outroConceito = "Você tem 50% de desconto na compra dos passes.";
				break;
			case "Trabalhador faixa II":
				outroConceito = "Você tem 25% de desconto na compra dos passes.";
				break;
			case "Trabalhador faixa I e Estudante":
				outroConceito = "Você tem 75% de desconto na compra dos passes.";
				break;
			default:
				outroConceito = "Você não possui descontos na compra dos passes.";
			}
			break;
		case 100:
			conceito = "Você escolheu comprar 100 passes";
			switch(resposta) {
			case "Estudante":
				outroConceito = "Você tem 50% de desconto na compra dos passes.";
				break;
			case "Idoso":
				outroConceito = "Você tem 50% de desconto na compra dos passes.";
				break;
			case "Trabalhador faixa I":
				outroConceito = "Você tem 50% de desconto na compra dos passes.";
				break;
			case "Trabalhador faixa II":
				outroConceito = "Você tem 25% de desconto na compra dos passes.";
				break;
			case "Trabalhador faixa I e Estudante":
				outroConceito = "Você tem 75% de desconto na compra dos passes.";
				break;
			default:
				outroConceito = "Você não possui descontos na compra dos passes.";
			}
			break;
		default:
			conceito = "A opção de "+passes+" passes não é válida";
			break;
		}

		System.out.println(conceito);
		System.out.println(outroConceito);

		programa.close();
	}
}
