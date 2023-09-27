package estruturasDeControle;

import java.util.Scanner;

public class ifIF {

	public static void main(String[] args) {
		
		//o comando ctrl+shift+L+L (L duas vezes) abre uma janela mostrando todos os comandos
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe a m�dia: ");
		double media = entrada.nextDouble();
		
		if(media <=10.0 && media >= 7.0) {
			System.out.println("Aprovado");
			System.out.println("Parab�ns!");
		}
		
		// para que duas senten�as fiquem juntas do if tem que adicionar um bloco de c�digo {}
		
		if(media <7.0 && media >= 4.5)
			System.out.println("Recupera��o");
		
		//se for usar um criterio mais de uma vez pode criar uma vari�vel booleana com esse crit�rio, ex:
		//boolean criterioReprovacao = media <4.5 && media >=0;
		//if(criterioReprovacao)
		//	System.out.println("Reprovado");
		
		if(media <4.5 && media >=0)
			System.out.println("Reprovado");
		
		entrada.close();

	}

}
