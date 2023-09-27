package fundamentos;

public class OperadoresUnarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; //a = a + 1; essa é a forma pós fixada
		a--; //a = a - 1;
		
		++b; //essa é a forma pré fixada
		--b;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini desafio");
		System.out.println(++a == b--); //na forma pós fixada o valor é incrementado/decrementado na próxima linha de código
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
		
	}

}
