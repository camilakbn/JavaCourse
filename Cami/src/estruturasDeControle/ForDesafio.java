package estruturasDeControle;

public class ForDesafio {

	public static void main(String[] args) {

		String valor = "#";
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		System.out.println("Sem Valor N�merico:");

		//desafio: n�o poder� usar de forma nenhuma valor num�rico para controlar o la�o
		//fazer igual a acima, s� que sem valor num�rico

		//String primeira = "#";

		for(String primeira = "#"; !primeira.contentEquals("######"); primeira = primeira.concat("#")) {
			System.out.println(primeira);
		}

	}

}
