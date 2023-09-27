package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		double a = 1;
		//houve uma conversão implícita, pois double é para números reais e 1 é número inteiro. double é maior que int
		System.out.println(a);
		
		float b = (float) 1.12345678888888;
		//essa conversão é explícita, pois está explicitamente dizendo para converter de double para float
		//quando se tem uma conversão explícita, vc está ciente de que irá perder informações
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c;
		System.out.println(d); //conversão explícita (CAST)
		
		double e = 1.99999;
		int f = (int) e;
		System.out.println(f);
		

	}

}