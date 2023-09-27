package arrays;

public class ForEach {

	public static void main(String[] args) {

		double[] notas = new double[4];

		notas[0] = 9.9;
		notas[1] = 8.7;
		notas[2] = 7.2;
		notas[3] = 9.4;

		for(int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}

		System.out.println(" ");

		for(double nota: notas) {
			System.out.print(nota + " ");
		}
	}
}
