package estruturasDeControle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		//ESTRUTURA DO DO-WHILE
		//do{} while(express�o);
		//� a �nica estrutura de controle que termina com ponto e v�rgula;
		//as outras estruturas de controle tem ; associado � senten�a de c�digo
		//a estrutura do-while sempre � executada pelo menos uma vez, pois a valida��o � no final
		//o do-while executa o corpo pra depois validar
		//ctrl+shift+o abre os imports
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "por favor";
		
		do {
			System.out.println("Voc� precisa falar as palavras m�gicas...");
			System.out.println("Quer sair? ");
			texto = entrada.nextLine();
		}
		
		while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigada!");
		
		entrada.close();
	}

}
