package estruturasDeControle;

public class WhileDeterminado {

	public static void main(String[] args) {
		
		//While = estrutura de controle de repeti��o de bloco ou do c�digo inteiro
		//enquanto uma determinada express�o for verdadeira, o c�digo vai ficar executando o bloco ou senten�a
		//m�ltiplas vezes, at� que uma determinada condi��o vire falsa
		
		int contador = 0;
		
		while(contador <= 10) {
			System.out.printf("i = %d\n", contador);
			contador++;
		}

	}

}
