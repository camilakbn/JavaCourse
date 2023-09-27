package estruturasDeControle;

import java.util.Scanner;

public class ifIF {

	public static void main(String[] args) {
		
		//o comando ctrl+shift+L+L (L duas vezes) abre uma janela mostrando todos os comandos
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();
		
		if(media <=10.0 && media >= 7.0) {
			System.out.println("Aprovado");
			System.out.println("Parabéns!");
		}
		
		// para que duas sentenças fiquem juntas do if tem que adicionar um bloco de código {}
		
		if(media <7.0 && media >= 4.5)
			System.out.println("Recuperação");
		
		//se for usar um criterio mais de uma vez pode criar uma variável booleana com esse critério, ex:
		//boolean criterioReprovacao = media <4.5 && media >=0;
		//if(criterioReprovacao)
		//	System.out.println("Reprovado");
		
		if(media <4.5 && media >=0)
			System.out.println("Reprovado");
		
		entrada.close();

	}

}
