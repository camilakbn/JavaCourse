package fundamentos;

public class OperadoresTernarios {

	public static void main(String[] args) {
		
		double media = 7.6;
		String resultado = media >= 7.0 ? "aprovado" : "em recuperação";
		//a interrogação significa "se a expressão for verdadeira", ela separa os valores que vão ser atribuídos
		//e o dois pontos é "caso contrário"
		//isso é chamado de atribuição condicional, pois tem uma expressão que pode ser verdadeira ou falsa
		//essa atribuição é ternária, pois tem dois símbolos, a "?" e o ":"
		System.out.println("O aluno está " + resultado);		

	}

}
