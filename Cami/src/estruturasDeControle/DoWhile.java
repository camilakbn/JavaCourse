package estruturasDeControle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		//ESTRUTURA DO DO-WHILE
		//do{} while(expressão);
		//é a única estrutura de controle que termina com ponto e vírgula;
		//as outras estruturas de controle tem ; associado à sentença de código
		//a estrutura do-while sempre é executada pelo menos uma vez, pois a validação é no final
		//o do-while executa o corpo pra depois validar
		//ctrl+shift+o abre os imports
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "por favor";
		
		do {
			System.out.println("Você precisa falar as palavras mágicas...");
			System.out.println("Quer sair? ");
			texto = entrada.nextLine();
		}
		
		while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigada!");
		
		entrada.close();
	}

}
