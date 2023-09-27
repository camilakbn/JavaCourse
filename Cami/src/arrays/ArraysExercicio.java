package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercicio {

	public static void main(String[] args) {

		/*calcular a média das notas de um aluno, só que agora o usuário vai passar as informações pra você OK
		 * primeira pergunta que o programa vai fazer ao usuário: "quantas notas você quer informar?" OK
		 * quando o usuário informar, criar um array com a quantidade de posições de notas que ele informou OK (EU FIZ ATÉ AQUI)
		 * criar dois laços for
		 * no primeiro você vai pegar as notas e adicionar num array OK
		 * ex.: colocar: digite a nota 1... a nota 2... e armazenar os dados que ele informou no array OK
		 * depois que ele colocou as notas, você vai percorrer o array usando for each e somar todas as notas numa variável "soma"
		 * e depois apresentar a média do aluno*/

		Scanner arrays = new Scanner (System.in);

		System.out.println("Quantas notas você quer informar?");
		int notas = arrays.nextInt();

		System.out.println("Você quer informar "+notas+" notas\n");

		double[] notasInformadas = new double[notas];

		for(int i = 0; i < notasInformadas.length; i++) {
			System.out.println("Informe a nota " + (i + 1) + ": ");
			notasInformadas[i] = arrays.nextDouble();
		}

		System.out.println("\nAs notas informadas foram: " + Arrays.toString(notasInformadas));

		double total = 0;
		for(double nota: notasInformadas) {
			total += nota;
		}

		double media = total / notasInformadas.length;

		System.out.println("\nA média das notas é " + media);

		arrays.close();
	}
}