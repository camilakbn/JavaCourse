package estruturasDeControle;

public class For1 {

	public static void main(String[] args) {
		
		//para estruturas de controle determinadas de repeti��es, � melhor usar o for
		//o for tem tr�s partes: a primeira � a declara��o da vari�vel
		//a segunda � a express�o que vai retornar true or false, que vai dizer se ele vai continuar repetindo ou n�o
		//a terceira parte � a manipula��o da vari�vel de controle para que em determinado momento o la�o pare de executar
		
		for(int contador = 0; contador <= 10; contador++) {
			System.out.printf("i = %d\n", contador);
		}
		
		/*la�o infinito:
		 *for(;;){
		 *System,out.println("Fim");
		 *}
		 */

	}

}
