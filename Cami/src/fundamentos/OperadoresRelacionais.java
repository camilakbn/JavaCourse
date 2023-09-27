package fundamentos;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		//operadores relacionais são binários (usam dois operandos)
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		
		//no java o operador de comparação é o "==" (igual-igual)
		
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(3 <= 1);
		System.out.println(3 != 8);
		
		double nota = 6.8;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto?" + temDesconto);
		
	}

}
