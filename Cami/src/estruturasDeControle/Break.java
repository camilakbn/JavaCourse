package estruturasDeControle;

public class Break {

	public static void main(String[] args) {

		//break e continue: palavras reservadas que vc tem como quebrar o fluxo natural das coisas

		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				break;
			}

			System.out.println(i);
		}

		System.out.println("Fim!");

	}

}
