package estruturasDeControle;

import java.util.Scanner;

public class WhileDesafio {

	public static void main(String[] args) {
		
		//calcular a m�dia das notas de uma turma 
		//n�o se sabe quantos alunos tem na turma
		//o usu�rio vai digitar uma nota v�lida (de 10 a 0)
		//quando o usu�rio digitar uma nota v�lida, vai armazenar o valor da nota numa vari�vel chamada total
		//sempre que uma nova nota for digitada, vai ser armazenada na vari�vel total de tal forma que o total armazene a soma das notas
		//usar outra vari�vel para definir quantas notas v�lidas foram digitadas
		//tem que ter: o total, a quantidade de notas digitadas e no final vai mostrar a m�dia
		//para sair do loop vai ser quando o usu�rio digitar -1
		//se digitar nota inv�lida vai pedir para o usu�rio digitar de novo
		
		/*
		 * 1 - conid��o de sa�da do loop > nota =-1 OK
		 * 2 - validar se a nota est� entre 0 e 10 OK
		 * 3 - adicionar nota ao total OK
		 * 4 - incrementar valor na qtd de notas digitadas OK
		 * 5 - ap�s sair do loop, mostrar a m�dia = soma/qtd > resultado final OK 
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
				System.out.println("Nota digitada Inv�lida! \nApenas valores de 0 a 10. \nSe quiser sair do programa, digite: -1\n\n");
			}
		}
	
		media = total/qtdNotas;
		System.out.printf("A m�dia das notas digitadas � de %.1f \n", media);
	
		desafio.close();

	}

}