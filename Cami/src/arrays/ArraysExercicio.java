package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercicio {

	public static void main(String[] args) {

		/*calcular a m�dia das notas de um aluno, s� que agora o usu�rio vai passar as informa��es pra voc� OK
		 * primeira pergunta que o programa vai fazer ao usu�rio: "quantas notas voc� quer informar?" OK
		 * quando o usu�rio informar, criar um array com a quantidade de posi��es de notas que ele informou OK (EU FIZ AT� AQUI)
		 * criar dois la�os for
		 * no primeiro voc� vai pegar as notas e adicionar num array OK
		 * ex.: colocar: digite a nota 1... a nota 2... e armazenar os dados que ele informou no array OK
		 * depois que ele colocou as notas, voc� vai percorrer o array usando for each e somar todas as notas numa vari�vel "soma"
		 * e depois apresentar a m�dia do aluno*/

		Scanner arrays = new Scanner (System.in);

		System.out.println("Quantas notas voc� quer informar?");
		int notas = arrays.nextInt();

		System.out.println("Voc� quer informar "+notas+" notas\n");

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

		System.out.println("\nA m�dia das notas � " + media);

		arrays.close();
	}
}