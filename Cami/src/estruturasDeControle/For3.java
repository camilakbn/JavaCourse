package estruturasDeControle;

public class For3 {

	public static void main(String[] args) {

		//quando a vari�vel � definida dentro do la�o, ela n�o pode ser acessada fora do for

		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.printf("[%d %d]", i, j);
			}

		}

	}

}
