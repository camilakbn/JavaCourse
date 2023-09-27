package classesEMetodos;

public class PrimeiroTraumaDesafio {

	int a = 3; //sem mexer nessa linha
	static int b = 4;

	public static void main(String[] args) {

		//apenas mexendo dentro do método main, corrigir o problema, o que é necessário para que o a rode e o código volte a funcionar

		PrimeiroTraumaDesafio valor = new PrimeiroTraumaDesafio();
		
		System.out.println(valor.a);
		System.out.println(b); //transformou em static para poder acessar o membro de classe na instância
	}
}
