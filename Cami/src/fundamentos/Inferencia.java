package fundamentos;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		//esse var significa que o java vai inferir o valor da vari�vel mesmo sem o tipo, ele vai saber qual � por conta do valor 
		//dado a ela;
		
		var c = "Texto"; //precisa declarar e inicializar na mesma linha quando se usa var, para n�o dar erro
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		//n�o pode usar a vari�vel c com o valor 4.5 por exemplo, pois o java ja definiu que ela � string (outro tipo)
		
		var d = 12;
		System.out.println(d);
		//depois que definiu que � inteiro n�o pode colocar valor real, mas o contr�rio pode

	}

}
