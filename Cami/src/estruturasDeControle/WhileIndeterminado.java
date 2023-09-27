package estruturasDeControle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		//desafio: pedir para o usuário digitar algo como por ex: vc diz, e somente quando o usuário digitar "sair"
		//é que o laço vai parar de repetir e finalizar o programa
		
	Scanner repeticao = new Scanner (System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("Sair")) {
			System.out.printf("Digite algo: ");
			valor = repeticao.nextLine();
		}
		
	repeticao.close();

	}

}
