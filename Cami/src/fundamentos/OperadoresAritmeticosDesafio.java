package fundamentos;

public class OperadoresAritmeticosDesafio {

	public static void main(String[] args) {
		
		int a = 2 + 3 * 4;
		int b = (int) Math.pow(a, 3); 
		//transformou em int pois o math.pow o valor é em double, ou seja o int do início tem que ser double
		double c = Math.pow(a,  3);
				
		System.out.println(b);
		System.out.println(c);
		
		//DESAFIO
		//Resolver as partes da equação seguinte, salvando os valores em variáveis
		// ([6*(3+2)]2(elevado ao quadrado)/3*2) - ((1-5)*(2-7)/2)2)3 /10 3(dez elevado ao cubo)
		
		double parte1cima1 = 6 * (3+2);
		double parte1cima2 = Math.pow(parte1cima1, 2);
		double parte1baixo = 3 * 2;
		double parte1 = parte1cima2 / parte1baixo;
		
		System.out.println(parte1);
		
		double parte2cima = (1-5) * (2 - 7);
		double parte2baixo = 2;
		double parte2 = parte2cima / parte2baixo;
		double parte2completa = Math.pow(parte2, 2);
		
		System.out.println(parte2completa);
		
		double parteCima1 = parte1 - parte2completa;
		double parteCima2 = Math.pow(parteCima1, 3);
		double parteBaixo = Math.pow(10, 3);
		
		System.out.println(parteCima2);
		System.out.println(parteBaixo);
		
		double equacaoCompleta = parteCima2 / parteBaixo;
		
		System.out.println(equacaoCompleta);
		
	}

}
