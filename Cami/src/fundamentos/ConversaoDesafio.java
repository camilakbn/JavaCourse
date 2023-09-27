package fundamentos;

import java.util.Scanner;

public class ConversaoDesafio {

	public static void main(String[] args) {

		//usar o Scanner, criar 3 Strings usando o nextLine e as 3 Strings vão receber os 3 últimos salários de um funcionário
		//calcular a média dos últimos 3 salários da pessoa
		//o funcionário tem que ter a flexibilidade de separar as casas decimais com vírgula e ponto
		//converter String em valor numérico, somar os 3 e mostrar a média


		//1: Nomear as variáveis para facilitar sua codificação
		//2: Começar pelo começo > primeiro o básico e depois faz o avançado

		Scanner leitorDeSalarios = new Scanner(System.in);

		String salario1;
		String salario2;
		String salario3;

		System.out.println("Informe o primeiro salário");
		salario1 = leitorDeSalarios.nextLine().replace(",",".");
		System.out.println("Informe o segundo salário");
		salario2 = leitorDeSalarios.nextLine().replace(",",".");
		System.out.println("Informe o terceiro salário");
		salario3 = leitorDeSalarios.nextLine().replace(",",".");
		
		/*salario1 = salario1.replaceAll(",", ".");
		salario2 = salario2.replaceAll(",", ".");
		salario3 = salario3.replaceAll(",", ".");*/

		double primeiroSalario = Double.parseDouble(salario1);
		double segundoSalario = Double.parseDouble(salario2);
		double terceiroSalario = Double.parseDouble(salario3);

		double somaSalarios = primeiroSalario + segundoSalario + terceiroSalario;
		
		System.out.println("A média dos salários é de " + somaSalarios / 3);
		
		leitorDeSalarios.close();
		
	}

}
