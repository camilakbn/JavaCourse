package com.listaExercicios;

import java.util.Scanner;

public class ExercicioSwitch {

	public static void main(String[] args) {

		/*Desenvolver um algoritmo para calcular o valor de uma cartela de passes de �nibus para um passageiro. 
		 * Uma cartela pode ter 50 ou 100 passes. Determinados tipos de usu�rios possuem desconto na compra de passes, 
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

		System.out.println("Ol�!");
		System.out.println("Voc� pode comprar 50 ou 100 passes, quantos passes voc� ir� comprar?");
		passes = programa.nextInt();
		System.out.println("Agora me diga em qual categoria voc� se enquadra?\n"
				+ "- Estudante\n"
				+ "- Idoso\n"
				+ "- Trabalhador faixa I\n"
				+ "- Trabalhador faixa II\n"
				+ "- Trabalhador faixa I e Estudante");
		resposta = programa.next();

		switch(passes) {
		case 50:
			conceito = "Voc� escolheu comprar 50 passes.";
			switch(resposta) {
			case "Estudante":
				outroConceito = "Voc� tem 50% de desconto na compra dos passes.";
				break;
			case "Idoso":
				outroConceito = "Voc� tem 50% de desconto na compra dos passes.";
				break;
			case "Trabalhador faixa I":
				outroConceito = "Voc� tem 50% de desconto na compra dos passes.";
				break;
			case "Trabalhador faixa II":
				outroConceito = "Voc� tem 25% de desconto na compra dos passes.";
				break;
			case "Trabalhador faixa I e Estudante":
				outroConceito = "Voc� tem 75% de desconto na compra dos passes.";
				break;
			default:
				outroConceito = "Voc� n�o possui descontos na compra dos passes.";
			}
			break;
		case 100:
			conceito = "Voc� escolheu comprar 100 passes";
			switch(resposta) {
			case "Estudante":
				outroConceito = "Voc� tem 50% de desconto na compra dos passes.";
				break;
			case "Idoso":
				outroConceito = "Voc� tem 50% de desconto na compra dos passes.";
				break;
			case "Trabalhador faixa I":
				outroConceito = "Voc� tem 50% de desconto na compra dos passes.";
				break;
			case "Trabalhador faixa II":
				outroConceito = "Voc� tem 25% de desconto na compra dos passes.";
				break;
			case "Trabalhador faixa I e Estudante":
				outroConceito = "Voc� tem 75% de desconto na compra dos passes.";
				break;
			default:
				outroConceito = "Voc� n�o possui descontos na compra dos passes.";
			}
			break;
		default:
			conceito = "A op��o de "+passes+" passes n�o � v�lida";
			break;
		}

		System.out.println(conceito);
		System.out.println(outroConceito);

		programa.close();
	}
}
