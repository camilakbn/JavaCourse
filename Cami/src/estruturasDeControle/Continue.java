package estruturasDeControle;

public class Continue {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			if (i % 2 == 1) {
				continue;
			}
			//sempre que o continue � encontrado, ele vai interromper apenas aquela repeti��o

			System.out.println(i);
		}

	}

}
