package fundamentos;

public class TiposPrimitivos {
	
	//TIPOS PRIMITIVOS
			//EM JAVA EXITEM 8 TIPOS PRIMITIVOS
			//existem 6 valores numéricos:
			//dos numéricos, existem 4 tipos que representam números inteiros:
			//byte(1), short(2), int(4), long(8) (a diferença é o tamanho)
			//existem 2 tipos que representam números quebrados/reais/com vírgula/com pontos flutuantes:
			//float(4) e double(8)
			//existem dois tipos para não numéricos:
			//char (um caracter delimitado por aspas simples 'a', '?', '1'), boolean (verdadeiro ou falso)

	public static void main(String[] args) {
		//Informações do funcionário
		
		//Tipos numéricos inteiros
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		//Tipos numéricos reais
		
		float salario = 11_445.44f;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; //ou true
		
		//Tipo caractere
		char status = 'A'; //o A pode representar ativo
		
		//se criar uma variável e não usar, vai aparecer uma advertência nela
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de vôos
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		//não há comportamentos associados a um tipo primitivo, que nem tem no String por exemplo
		//existem os Wrappers, que são a versão objeto dos tipos primitivos
		
		
		

	}

}
