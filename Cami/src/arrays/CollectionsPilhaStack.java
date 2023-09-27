package arrays;

import java.util.ArrayDeque;
import java.util.Deque;

public class CollectionsPilhaStack {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>(); //na pilha, o �ltimo a entrar � o primeiro a sair (LIFO = last in, first out)
		
		livros.add("O Pequeno Pr�ncipe");
		livros.push("Dom Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		for(String livro: livros) {
			System.out.println("\n" + livro + "\n");
		}
		
		System.out.println(livros.poll());
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		//System.out.println(livros.pop()); //pop, assim como o element, lan�a uma exce��o quando acabam os elementos

	}
}
