package arrays;

import java.util.HashSet;
import java.util.Set;

public class CollectionsSet {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		/*SET:
		 * pode ser heterog�neo (n�o � a forma ideal), pode ser homog�neo, n�o aceita objetos duplicados,
		 * pode ser ordenado ou n�o, n�o � indexado.
		 * hashset (vers�o mais comum do set) */

		HashSet conjunto = new HashSet();

		conjunto.add(1.2); //o double (tipo primitivo) vai ser convertido automaticamente em Double (classe do tipo double)
		conjunto.add(true); //boolean converte para Boolean
		conjunto.add("Teste");
		conjunto.add(1); // int converte para Interger
		conjunto.add('x'); //char converte para caractere

		//o que se tem aqui � um conjunto com v�rios dados bagun�ados

		System.out.println("O tamanho do conjunto � de " + conjunto.size());

		conjunto.add("Teste");

		System.out.println("O tamanho do conjunto � de " + conjunto.size());
		//o conjunto continua com 5 elementos pois ele n�o aceita objetos duplicados

		System.out.println(conjunto.remove("teste")); //isso � pra remover um objeto do conjunto
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));

		System.out.println("O tamanho do conjunto � de " + conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); //fez a uni�o dos conjuntos, colocou os dados de nums no conjunto
		
		conjunto.retainAll(nums); //interse��o entre os conjuntos, vai mostrar o valor em comum entre os conjuntos
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}
}
