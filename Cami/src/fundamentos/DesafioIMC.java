package fundamentos;

import java.util.Scanner;

public class DesafioIMC {

	public static void main(String[] args) {
		
		//criar um programa que leia o peso e a altura do usuário e imprima no console o IMC (peso/altura2)
		//ler como string, validar se tem ponto, depois converter para double e realizar o calculo
		
		Scanner calculoImc = new Scanner (System.in);
		
		System.out.println("Informe o seu peso: ");
		String peso = calculoImc.nextLine().replace(",", ".");
		double peso1 = Double.parseDouble(peso);
		
		System.out.println("Informe a sua altura: ");
		String altura = calculoImc.nextLine().replace(",", ".");
		double altura1 = Double.parseDouble(altura);
				
		double altura2 = Math.pow(altura1, 2);
		
		double imc = peso1 / altura2;
		
		System.out.printf("O seu IMC é %.2f", imc);
		
		calculoImc.close();

	}

}
