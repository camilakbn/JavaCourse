package fundamentos;

import java.util.Scanner;

public class DesafioTriangulo {

	public static void main(String[] args) {
		
		//criar um programa que leia o valor da base e da altura de um tri�ngulo e calcule a �rea a=b.h/2
		
		Scanner triangulo = new Scanner (System.in);
		
		System.out.println("Informe o valor da base do tri�ngulo: ");
		String base = triangulo.nextLine().replace(",", ".");
		double base1 = Double.parseDouble(base);
		
		System.out.println("Informe o valor da altura do tri�ngulo: ");
		String altura = triangulo.nextLine().replace(",", ".");
		double altura1 = Double.parseDouble(altura);
		
		double area = base1 * altura1 / 2;
		
		System.out.printf("O valor da �rea do tri�ngulo ret�ngulo � de %.1f", area);
		
		triangulo.close();

	}

}
