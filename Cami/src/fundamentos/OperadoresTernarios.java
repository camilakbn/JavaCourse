package fundamentos;

public class OperadoresTernarios {

	public static void main(String[] args) {
		
		double media = 7.6;
		String resultado = media >= 7.0 ? "aprovado" : "em recupera��o";
		//a interroga��o significa "se a express�o for verdadeira", ela separa os valores que v�o ser atribu�dos
		//e o dois pontos � "caso contr�rio"
		//isso � chamado de atribui��o condicional, pois tem uma express�o que pode ser verdadeira ou falsa
		//essa atribui��o � tern�ria, pois tem dois s�mbolos, a "?" e o ":"
		System.out.println("O aluno est� " + resultado);		

	}

}
