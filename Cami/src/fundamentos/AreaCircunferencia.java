package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		
		int raio = 3;
		final double pi = 3.14159; // o final � usado pra a vari�vel ser constante, n�o poder mudar
		
		double area = pi * raio * raio;
		
		System.out.println(area); //ctrl + espa�o abre os atalhos, se escreve Syso e da ctrl + espa�o abre o system.out.println
		
		raio = 10;
		area = pi * raio * raio;
		
		System.out.println("�rea = " + area + " m2.");
		
	}
	
}
