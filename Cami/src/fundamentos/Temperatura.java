package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (�F - 32) x 5.0/9.0 = �C 
		// se voc� faz uma divis�o com n�meros inteiros, o resultado sempre ser� inteiro (usar int)
		// se voc� faz uma divis�o com n�meros reais, o resultado vai ter casas decimais (usar float ou double)
		
		double farenheint = 180;
		final double ajuste = 32;
		final double divisao = 5.0/9.0; 
		
		//para alterar todos os nomes, clica no bot�o direito no nome, vai em refactor, rename, muda o nome e d� enter
		
		double celsius = (farenheint - ajuste) * divisao;
		
		System.out.println("Temperatura = " + celsius + " �C.");	
		
		farenheint = 150;
		celsius = (farenheint - ajuste) * divisao;
		
		System.out.println("O valor em celsius � de " + celsius + " �C.");
		
	}
}
