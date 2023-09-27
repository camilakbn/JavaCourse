package arrays;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionsFilaQueue {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>(); //linkedlist é uma fila

		fila.add("Ana");
		fila.offer("Bia"); 
		fila.add("Carlos"); 
		fila.offer("Daniel"); 
		fila.add("Rafaela"); 
		fila.offer("Gui"); 
		/* tanto o add quanto o offer são métodos de adicionar elementos na fila, a diferença é que quando vc tem filas que tem uma 
		 * restrição de tamanho, na FILA é possível que vc diga que a fila tem um tamanho no máximo de 100 e a partir dali
		 * ele não vai permitir que nenhum elemento seja adicionado enquanto outro não seja tirado da fila, no OFFER
		 * ele vai retornar true or false, caso ele não consiga retornar numa fila que tem restrição ele vai retornar FALSO,
		 * no FILA vai gerar um erro e no OFFER vai retornar falso (a diferença é o comportamento quando a lista está CHEIA*/

		System.out.println(fila.peek()); //lê o primeiro elemento da fila
		System.out.println(fila.peek()); //vai continuar lento o primeiro, pq ele não remove o elemento da fila depois de lido
		System.out.println(fila.element()); //também vai retornar o primeiro elemento
		System.out.println(fila.element());//também não vai remover o primeiro elemento da fila
		/*a diferença entre os dois é quando a fila está VAZIA, pois o PEEK vai retornar nulo e o ELEMENT vai gerar um erro*/

		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		/*esses métodos retornam o primeiro elemento da fila e depois remove ele
		 * a diferença é que no POLL se chamar o elemento quando a fila estiver vazia, vai retornar null
		 * já no REMOVE, vai lançar uma exceção, a diferença de comportamento ocorre quando a fila está VAZIA*/
	}
}
