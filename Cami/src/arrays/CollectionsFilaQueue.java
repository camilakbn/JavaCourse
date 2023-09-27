package arrays;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionsFilaQueue {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>(); //linkedlist � uma fila

		fila.add("Ana");
		fila.offer("Bia"); 
		fila.add("Carlos"); 
		fila.offer("Daniel"); 
		fila.add("Rafaela"); 
		fila.offer("Gui"); 
		/* tanto o add quanto o offer s�o m�todos de adicionar elementos na fila, a diferen�a � que quando vc tem filas que tem uma 
		 * restri��o de tamanho, na FILA � poss�vel que vc diga que a fila tem um tamanho no m�ximo de 100 e a partir dali
		 * ele n�o vai permitir que nenhum elemento seja adicionado enquanto outro n�o seja tirado da fila, no OFFER
		 * ele vai retornar true or false, caso ele n�o consiga retornar numa fila que tem restri��o ele vai retornar FALSO,
		 * no FILA vai gerar um erro e no OFFER vai retornar falso (a diferen�a � o comportamento quando a lista est� CHEIA*/

		System.out.println(fila.peek()); //l� o primeiro elemento da fila
		System.out.println(fila.peek()); //vai continuar lento o primeiro, pq ele n�o remove o elemento da fila depois de lido
		System.out.println(fila.element()); //tamb�m vai retornar o primeiro elemento
		System.out.println(fila.element());//tamb�m n�o vai remover o primeiro elemento da fila
		/*a diferen�a entre os dois � quando a fila est� VAZIA, pois o PEEK vai retornar nulo e o ELEMENT vai gerar um erro*/

		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		/*esses m�todos retornam o primeiro elemento da fila e depois remove ele
		 * a diferen�a � que no POLL se chamar o elemento quando a fila estiver vazia, vai retornar null
		 * j� no REMOVE, vai lan�ar uma exce��o, a diferen�a de comportamento ocorre quando a fila est� VAZIA*/
	}
}
