package fundamentos;

public class OperadoresUnarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; //a = a + 1; essa � a forma p�s fixada
		a--; //a = a - 1;
		
		++b; //essa � a forma pr� fixada
		--b;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini desafio");
		System.out.println(++a == b--); //na forma p�s fixada o valor � incrementado/decrementado na pr�xima linha de c�digo
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
		
	}

}
