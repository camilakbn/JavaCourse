package arrays;

import java.util.Arrays;

public class ArrayExercicio {

	public static void main(String[] args) {

		double[] notasAlunoA = new double[4]; //o primeiro colchete pode ser colocado antes ou depois do nome da variável
		System.out.println(Arrays.toString(notasAlunoA)); //aqui os valores não foram definidos

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;

		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]); //mostra a primeira nota
		System.out.println(notasAlunoA[notasAlunoA.length - 1]); //mostra a última nota
		// System.out.println(notasAlunoA[4]); ERRO!

		//para fazer a média:
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) { 
			//esse lenght vai pegar o valor do array, mesmo que seja modificado após o for ter sido criado
			totalAlunoA += notasAlunoA[i];
		}

		System.out.println(totalAlunoA / notasAlunoA.length);

		//outra forma de inicializar o array:
		
		final double notaArmazenada = 5.9;
		double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10}; //jeito menos utilizado
		System.out.println(Arrays.toString(notasAlunoB));

		double totalAlunoB = 0;
		for(int i = 0; i < notasAlunoB.length; i++) { //variável i pode ser reutilizada pois está dentro do laço for
			totalAlunoB += notasAlunoB[i];
		}

		System.out.println(totalAlunoB / notasAlunoB.length);

	}
}
