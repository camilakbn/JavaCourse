package estruturasDeControle;

public class For1 {

	public static void main(String[] args) {
		
		//para estruturas de controle determinadas de repetições, é melhor usar o for
		//o for tem três partes: a primeira é a declaração da variável
		//a segunda é a expressão que vai retornar true or false, que vai dizer se ele vai continuar repetindo ou não
		//a terceira parte é a manipulação da variável de controle para que em determinado momento o laço pare de executar
		
		for(int contador = 0; contador <= 10; contador++) {
			System.out.printf("i = %d\n", contador);
		}
		
		/*laço infinito:
		 *for(;;){
		 *System,out.println("Fim");
		 *}
		 */

	}

}
