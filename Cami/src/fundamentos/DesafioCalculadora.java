package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		//pegar no terminal do usu�rio:
		//ler num1, ler num2
		//perguntar pra o usu�rio qual a opera��o q ele quer fazer ( + - * / % )
		//depois vai usar a opera��o com o num1 e num2
		
		Scanner desafio = new Scanner (System.in);
		
		System.out.print("Informe o n�mero: ");
		double num1 = desafio.nextDouble();
		
		System.out.print("Informe o n�mero: ");
		double num2 = desafio.nextDouble();
		
		System.out.print("Informe a opera��o: ");
		String operacao = desafio.next();
		
		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		
		/*double resultado = operacao.equals("+")? num1 + num2 : 
			operacao.equals("-")? num1 - num2 :
				operacao.equals("*")? num1 * num2: 
					operacao.equals("/")? num1/num2 : 
						operacao.equals(%)? num1 % num2 :
							0; 
		 */
		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
		
		desafio.close();					

	}

}
