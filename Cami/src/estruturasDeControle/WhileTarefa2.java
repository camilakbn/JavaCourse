package estruturasDeControle;

import java.util.Scanner;

public class WhileTarefa2 {

	public static void main(String[] args) {
		
		// com while, pergunte ao usuario se ele quer iniciar o programa. 
		// caso digite 'sim', executa o programa j� existente
		// caso digite 'nao', deve exibir 'fim do programa'
		// Caso digite um valor diferente de 'sim' ou 'nao', devera repetir a pergunta
		
		Scanner tarefa = new Scanner(System.in);
		
		String resposta = "";
		
		while(!resposta.equalsIgnoreCase("Sim") && !resposta.equalsIgnoreCase("N�o")) {
			System.out.println("Voc� quer iniciar o programa? Responda com sim ou n�o ");
			resposta = tarefa.nextLine();
		}
		
		if(resposta.equalsIgnoreCase("Sim"))
			System.out.println("Iniciando o programa...");
		else if(resposta.equalsIgnoreCase("N�o"))
			System.out.println("Fim do programa");
		
		tarefa.close();
		
		}

	}
