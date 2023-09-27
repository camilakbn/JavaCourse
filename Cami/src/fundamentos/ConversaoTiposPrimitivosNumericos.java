package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		double a = 1;
		//houve uma convers�o impl�cita, pois double � para n�meros reais e 1 � n�mero inteiro. double � maior que int
		System.out.println(a);
		
		float b = (float) 1.12345678888888;
		//essa convers�o � expl�cita, pois est� explicitamente dizendo para converter de double para float
		//quando se tem uma convers�o expl�cita, vc est� ciente de que ir� perder informa��es
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c;
		System.out.println(d); //convers�o expl�cita (CAST)
		
		double e = 1.99999;
		int f = (int) e;
		System.out.println(f);
		

	}

}