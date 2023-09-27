package fundamentos;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		//TABELA VERDADE:
		//Tabela do e (and/&&): v e v = v mas v e f = f ou f e v = f ou f e f = f
		//Tabela do ou (or/||): se tiver algum verdadeiro = v
		//Tabela do ou exclusivo (xor): só vai dar v se for no item exclusivo (ou exclusivo)
		//Tabela da negação (not/!): not false = true, not true = false
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 && !condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!condicao1);
		System.out.println(!!condicao1);
		System.out.println(!condicao2);
		
		System.out.println("Tabela verdade E (and/&&):");
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true);
		//System.out.println(false && false);
		
		System.out.println("Tabela verdade Ou (or/||):");
		//System.out.println(true || true);
		//System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("Tabela verdade Ou exclusivo (xor/^):");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("Tabela verdade Negação (not/!):"); //a tabela negação é um operador unário
		System.out.println(!true);
		System.out.println(!false);
		
	}

}
