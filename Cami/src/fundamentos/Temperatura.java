package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (°F - 32) x 5.0/9.0 = °C 
		// se você faz uma divisão com números inteiros, o resultado sempre será inteiro (usar int)
		// se você faz uma divisão com números reais, o resultado vai ter casas decimais (usar float ou double)
		
		double farenheint = 180;
		final double ajuste = 32;
		final double divisao = 5.0/9.0; 
		
		//para alterar todos os nomes, clica no botão direito no nome, vai em refactor, rename, muda o nome e dá enter
		
		double celsius = (farenheint - ajuste) * divisao;
		
		System.out.println("Temperatura = " + celsius + " °C.");	
		
		farenheint = 150;
		celsius = (farenheint - ajuste) * divisao;
		
		System.out.println("O valor em celsius é de " + celsius + " °C.");
		
	}
}
