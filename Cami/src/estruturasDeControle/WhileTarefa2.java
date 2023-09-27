package estruturasDeControle;

import java.util.Scanner;

public class WhileTarefa2 {

	public static void main(String[] args) {
		
		// com while, pergunte ao usuario se ele quer iniciar o programa. 
		// caso digite 'sim', executa o programa já existente
		// caso digite 'nao', deve exibir 'fim do programa'
		// Caso digite um valor diferente de 'sim' ou 'nao', devera repetir a pergunta
		
		Scanner tarefa = new Scanner(System.in);
		
		String resposta = "";
		
		while(!resposta.equalsIgnoreCase("Sim") && !resposta.equalsIgnoreCase("Não")) {
			System.out.println("Você quer iniciar o programa? Responda com sim ou não ");
			resposta = tarefa.nextLine();
		}
		
		if(resposta.equalsIgnoreCase("Sim"))
			System.out.println("Iniciando o programa...");
		else if(resposta.equalsIgnoreCase("Não"))
			System.out.println("Fim do programa");
		
		tarefa.close();
		
		}

	}
