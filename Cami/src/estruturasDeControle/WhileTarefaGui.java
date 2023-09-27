package estruturasDeControle;

import java.util.Scanner;

public class WhileTarefaGui {

	public static void main(String[] args) {
		
				// com while, pergunte ao usuario se ele quer iniciar o programa. 
				// caso digite 'sim', executa o programa já existente
				// caso digite 'nao', deve exibir 'fim do programa'
				// Caso digite um valor diferente de 'sim' ou 'nao', devera repetir a pergunta
		// pergunte a 10 usuarios seu nome
		// caso algum usuario digite: 0 o loop deverá ser interrompido
		// faça usando a estrutura while
		
		Scanner usuario = new Scanner (System.in);
		
		String resposta = "";
		int contador = 1;
		
		while(!resposta.equalsIgnoreCase("Sim") && !resposta.equalsIgnoreCase("Não")) {
			System.out.println("Você quer iniciar o programa? Responda com sim ou não ");
			resposta = usuario.nextLine();
		}
		
		if(resposta.equalsIgnoreCase("Sim")) {
			System.out.println("Iniciando o programa...");
		
			while(!resposta.equals("0") && contador<11) {
				System.out.println("Digite o seu nome: ");
				resposta = usuario.nextLine();
				contador++;
			}
		}
		
		System.out.println("Fim do programa");
		
		usuario.close();

	}

}
