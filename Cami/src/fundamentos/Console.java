package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n");
		//quando rodar esse texto vai ficar na mesma linha, pq o "ln" do println significa pule uma linha
		
		System.out.println("Bom");
		System.out.println("dia!");

		System.out.printf("Megasena: %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6);
		//o "f" do printf � de formatar, ele tamb�m n�o tem quebra de linha
		
		System.out.printf("Sal�rio: %.1f \n\n", 1234.5678);
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite a sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.", 
				nome, sobrenome, idade);
		//quando vc rodar e for no console, vai ver que o bot�o est� vermelho, pois est� esperando a resposta do nome ser dada
		//para poder concluir, e sempre tem q colocar o Scanner pra fechar 
		
		entrada.close();
			
	}

}
