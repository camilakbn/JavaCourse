package fundamentos;

public class OperadoresDeAtribuicao {

	public static void main(String[] args) {
		
		//operadores de atribuicao s�o bin�rios (usam dois operandos)
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; //c = c + b; =podem ser as duas op��es
		c-= a; //c = c - a;
		c *= b; //c = c * b;
		c /= a; //c = c / a;
		
		System.out.println(c);		

	}

}
