package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		
		int raio = 3;
		final double pi = 3.14159; // o final é usado pra a variável ser constante, não poder mudar
		
		double area = pi * raio * raio;
		
		System.out.println(area); //ctrl + espaço abre os atalhos, se escreve Syso e da ctrl + espaço abre o system.out.println
		
		raio = 10;
		area = pi * raio * raio;
		
		System.out.println("Área = " + area + " m2.");
		
	}
	
}
