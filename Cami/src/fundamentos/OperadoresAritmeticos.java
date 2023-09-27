package fundamentos;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		//Operadores:
		//Un�rios = que s� possuem um operando e um operador ex (a++)
		//Bin�rios = que possuem um operador e dois operandos ex ( 3 + 2)
		//Tern�rios = que possuiem dois operadores e tr�s operandos ex ( v ? v : v )
		//V�o ter situa��es que o operador vai estar antes do operando (prefix, ex ++a), depois do operando (postfix, ex a++) ou 
		//entre os operandos (infix, ex 3 + 2)
		
		//Operadores aritm�ticos:
		
		System.out.println(2 + 3);
		
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
				
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b);
		System.out.println(a / (float) b);
		
		System.out.println(8 % 3);
		System.out.println(a % b);
		
		System.out.println(x + y - a * b);
		
	}

}
