package estruturasDeControle;

public class WhileDeterminado {

	public static void main(String[] args) {
		
		//While = estrutura de controle de repetição de bloco ou do código inteiro
		//enquanto uma determinada expressão for verdadeira, o código vai ficar executando o bloco ou sentença
		//múltiplas vezes, até que uma determinada condição vire falsa
		
		int contador = 0;
		
		while(contador <= 10) {
			System.out.printf("i = %d\n", contador);
			contador++;
		}

	}

}
