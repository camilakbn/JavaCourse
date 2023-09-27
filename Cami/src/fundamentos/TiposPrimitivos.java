package fundamentos;

public class TiposPrimitivos {
	
	//TIPOS PRIMITIVOS
			//EM JAVA EXITEM 8 TIPOS PRIMITIVOS
			//existem 6 valores num�ricos:
			//dos num�ricos, existem 4 tipos que representam n�meros inteiros:
			//byte(1), short(2), int(4), long(8) (a diferen�a � o tamanho)
			//existem 2 tipos que representam n�meros quebrados/reais/com v�rgula/com pontos flutuantes:
			//float(4) e double(8)
			//existem dois tipos para n�o num�ricos:
			//char (um caracter delimitado por aspas simples 'a', '?', '1'), boolean (verdadeiro ou falso)

	public static void main(String[] args) {
		//Informa��es do funcion�rio
		
		//Tipos num�ricos inteiros
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		//Tipos num�ricos reais
		
		float salario = 11_445.44f;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; //ou true
		
		//Tipo caractere
		char status = 'A'; //o A pode representar ativo
		
		//se criar uma vari�vel e n�o usar, vai aparecer uma advert�ncia nela
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//N�mero de v�os
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("F�rias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		//n�o h� comportamentos associados a um tipo primitivo, que nem tem no String por exemplo
		//existem os Wrappers, que s�o a vers�o objeto dos tipos primitivos
		
		
		

	}

}
