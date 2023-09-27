package estruturasDeControle;

public class ForDesafio {

	public static void main(String[] args) {

		String valor = "#";
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		System.out.println("Sem Valor Númerico:");

		//desafio: não poderá usar de forma nenhuma valor numérico para controlar o laço
		//fazer igual a acima, só que sem valor numérico

		//String primeira = "#";

		for(String primeira = "#"; !primeira.contentEquals("######"); primeira = primeira.concat("#")) {
			System.out.println(primeira);
		}

	}

}
