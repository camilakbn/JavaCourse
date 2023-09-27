package fundamentos;

import java.util.Scanner;

public class ConversaoDesafio {

	public static void main(String[] args) {

		//usar o Scanner, criar 3 Strings usando o nextLine e as 3 Strings v�o receber os 3 �ltimos sal�rios de um funcion�rio
		//calcular a m�dia dos �ltimos 3 sal�rios da pessoa
		//o funcion�rio tem que ter a flexibilidade de separar as casas decimais com v�rgula e ponto
		//converter String em valor num�rico, somar os 3 e mostrar a m�dia


		//1: Nomear as vari�veis para facilitar sua codifica��o
		//2: Come�ar pelo come�o > primeiro o b�sico e depois faz o avan�ado

		Scanner leitorDeSalarios = new Scanner(System.in);

		String salario1;
		String salario2;
		String salario3;

		System.out.println("Informe o primeiro sal�rio");
		salario1 = leitorDeSalarios.nextLine().replace(",",".");
		System.out.println("Informe o segundo sal�rio");
		salario2 = leitorDeSalarios.nextLine().replace(",",".");
		System.out.println("Informe o terceiro sal�rio");
		salario3 = leitorDeSalarios.nextLine().replace(",",".");
		
		/*salario1 = salario1.replaceAll(",", ".");
		salario2 = salario2.replaceAll(",", ".");
		salario3 = salario3.replaceAll(",", ".");*/

		double primeiroSalario = Double.parseDouble(salario1);
		double segundoSalario = Double.parseDouble(salario2);
		double terceiroSalario = Double.parseDouble(salario3);

		double somaSalarios = primeiroSalario + segundoSalario + terceiroSalario;
		
		System.out.println("A m�dia dos sal�rios � de " + somaSalarios / 3);
		
		leitorDeSalarios.close();
		
	}

}
