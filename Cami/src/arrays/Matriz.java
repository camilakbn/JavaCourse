package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		/*fazer uma matriz (um array dentro de outro array):
		 * pegar notas de mais de um aluno 
		 * primeiro perguntar "Quantos alunos tem na turma?" e armazenar a quantidade de alunos
		 * depois perguntar "Quantas notas tem cada aluno?" e armazenar
		 * no final, calcular a média da turma inteira*/

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos alunos tem na turma?");
		int qtAlunos = entrada.nextInt();

		System.out.println("Têm "+qtAlunos+" alunos na turma!\n");

		System.out.println("Quantas notas tem cada aluno?");
		int qtNotas = entrada.nextInt();

		System.out.println("Cada aluno tem "+qtNotas+" notas!\n");

		double[][] turma = new double [qtAlunos][qtNotas];

		double total = 0;
		for(int a = 0; a < turma.length; a++) { //a de aluno, o for vai percorrer a quantidade de alunos
			for(int n = 0; n < turma[a].length; n++) { //n de notas, o for vai percorrer as notas do aluno

				System.out.printf("Informe a nota %d do aluno %d", n + 1, a + 1); //esse +1 é pq o array começa em 0
				turma[a][n] = entrada.nextDouble();
				total += turma[a][n];
			}
		}

		double media = total / (qtAlunos * qtNotas);
		System.out.println("A média da turma é "+media+"");

		for(double[] notasDoAluno: turma) {		
			System.out.println(Arrays.toString(notasDoAluno));
		}

		entrada.close();
	}

}
