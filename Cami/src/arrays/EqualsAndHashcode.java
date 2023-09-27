package arrays;

public class EqualsAndHashcode {

	public static void main(String[] args) {

		/*sempre que você faz uma comparação == você está comparando endereço de memória
		 * se são dois objetos distintos, mesmo que tenham os mesmos dados, a comparação vai ser falsa
		 * ex.: se criar duas variáveis com mesmo nome e comparar com == vai dar falso:
		 * Produto p1 = new Produto;
		 * p1.nome = "Caneta";
		 * 
		 * Produto p2 = new Produto;
		 * p2.nome = "Caneta";
		 * 
		 * p1 == p2 (vai dar FALSE) pois são dois endereços de memória diferentes
		 * o == é geralmente usado para tipos primitivos, ex.: 3 == 3; (TRUE)
		 * 
		 * para comparar objetos se usa o termo EQUALS
		 * ex.:
		 * p1.equals(p2); ESSA TAMBÉM DÁ FALSE, pois esse modo é igual ao p1 == p2
		 * 
		 * o EQUALS geralmente vem junto do HASHCODE
		 * o equals é uma função que vai retornar TRUE or FALSE (boolean)
		 * o hashcode é uma função que vai retornar um inteiro
		 * o hashcode diminui as opções de coisas iguais para o equals encontrar mais rápido */

		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@ezemail.com.br";

		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@ezemail.com.br";

		System.out.println(u1 == u2); 
		System.out.println(u1.equals(u2)); //dá verdadeiro porque o equals foi implantado no outro código
		System.out.println(u2.equals(u1)); //dá verdadeiro porque o equals foi implantado no outro código

	}
}
