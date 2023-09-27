package estruturasDeControle;

import java.util.Scanner;

public class WhileDesafio {

	public static void main(String[] args) {
		
		//calcular a média das notas de uma turma 
		//não se sabe quantos alunos tem na turma
		//o usuário vai digitar uma nota válida (de 10 a 0)
		//quando o usuário digitar uma nota válida, vai armazenar o valor da nota numa variável chamada total
		//sempre que uma nova nota for digitada, vai ser armazenada na variável total de tal forma que o total armazene a soma das notas
		//usar outra variável para definir quantas notas válidas foram digitadas
		//tem que ter: o total, a quantidade de notas digitadas e no final vai mostrar a média
		//para sair do loop vai ser quando o usuário digitar -1
		//se digitar nota inválida vai pedir para o usuário digitar de novo
		
		/*
		 * 1 - conidção de saída do loop > nota =-1 OK
		 * 2 - validar se a nota está entre 0 e 10 OK
		 * 3 - adicionar nota ao total OK
		 * 4 - incrementar valor na qtd de notas digitadas OK
		 * 5 - após sair do loop, mostrar a média = soma/qtd > resultado final OK 
		 * 
		 * 
		 * */
		
		Scanner desafio = new Scanner(System.in);
		
		double nota = 0;
		double total = 0;
		double media = 0;
		int qtdNotas = 0;
		
		while(nota != -1) {
			System.out.println("Digite a sua nota: ");
			nota = desafio.nextDouble();
			if(nota>=0 && nota<=10) {
				total += nota;
				qtdNotas++;
				System.out.println("Nota computada com sucesso!");
			}
			else {
				System.out.println("Nota digitada Inválida! \nApenas valores de 0 a 10. \nSe quiser sair do programa, digite: -1\n\n");
			}
		}
	
		media = total/qtdNotas;
		System.out.printf("A média das notas digitadas é de %.1f \n", media);
	
		desafio.close();

	}

}