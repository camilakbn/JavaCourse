package classesEMetodos;

public class PrimeiroTraumaDesafio {

	int a = 3; //sem mexer nessa linha
	static int b = 4;

	public static void main(String[] args) {

		//apenas mexendo dentro do m�todo main, corrigir o problema, o que � necess�rio para que o a rode e o c�digo volte a funcionar

		PrimeiroTraumaDesafio valor = new PrimeiroTraumaDesafio();
		
		System.out.println(valor.a);
		System.out.println(b); //transformou em static para poder acessar o membro de classe na inst�ncia
	}
}
