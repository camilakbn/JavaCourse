package arrays;

public class EqualsAndHashcode {

	public static void main(String[] args) {

		/*sempre que voc� faz uma compara��o == voc� est� comparando endere�o de mem�ria
		 * se s�o dois objetos distintos, mesmo que tenham os mesmos dados, a compara��o vai ser falsa
		 * ex.: se criar duas vari�veis com mesmo nome e comparar com == vai dar falso:
		 * Produto p1 = new Produto;
		 * p1.nome = "Caneta";
		 * 
		 * Produto p2 = new Produto;
		 * p2.nome = "Caneta";
		 * 
		 * p1 == p2 (vai dar FALSE) pois s�o dois endere�os de mem�ria diferentes
		 * o == � geralmente usado para tipos primitivos, ex.: 3 == 3; (TRUE)
		 * 
		 * para comparar objetos se usa o termo EQUALS
		 * ex.:
		 * p1.equals(p2); ESSA TAMB�M D� FALSE, pois esse modo � igual ao p1 == p2
		 * 
		 * o EQUALS geralmente vem junto do HASHCODE
		 * o equals � uma fun��o que vai retornar TRUE or FALSE (boolean)
		 * o hashcode � uma fun��o que vai retornar um inteiro
		 * o hashcode diminui as op��es de coisas iguais para o equals encontrar mais r�pido */

		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@ezemail.com.br";

		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@ezemail.com.br";

		System.out.println(u1 == u2); 
		System.out.println(u1.equals(u2)); //d� verdadeiro porque o equals foi implantado no outro c�digo
		System.out.println(u2.equals(u1)); //d� verdadeiro porque o equals foi implantado no outro c�digo

	}
}
