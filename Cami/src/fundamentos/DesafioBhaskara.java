package fundamentos;

import java.util.Scanner;

public class DesafioBhaskara {

	public static void main(String[] args) {
		
		//criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara.
		//use como exemplo a = 1, b = 12, c = -13. Encontre o delta
		
		Scanner bhaskara = new Scanner (System.in);
		
		System.out.println("Digite o valor de 'a': ");
		double a = bhaskara.nextDouble();
		
		System.out.println("Digite o valor de 'b': ");
		double b = bhaskara.nextDouble();
		double b2 = Math.pow(b, 2);
		
		System.out.println("Digite o valor de 'c': ");
		double c = bhaskara.nextDouble();
		
		double delta = b2 - 4 * a * (c);
		
		System.out.printf("O valor do delta é %.0f \n", delta);
		
		double raizDelta = Math.sqrt(delta);
		
		double x1 = (- b + raizDelta) / (2 * a);
		
		System.out.printf("O valor do x1 é %.0f \n", x1);
		
		double x2 = (- b - raizDelta) / (2 * a);
		
		System.out.printf("O valor do x2 é %.0f \n", x2);
		
		bhaskara.close();
		
	}

}
