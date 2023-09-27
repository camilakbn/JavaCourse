package fundamentos;

public class OperadoresDeAtribuicao {

	public static void main(String[] args) {
		
		//operadores de atribuicao são binários (usam dois operandos)
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; //c = c + b; =podem ser as duas opções
		c-= a; //c = c - a;
		c *= b; //c = c * b;
		c /= a; //c = c / a;
		
		System.out.println(c);		

	}

}
