package classesEMetodos;

public class ValorNulo {

	public static void main(String[] args) {

		String s1 = "";
		System.out.println(s1.concat("!!"));

		//String s2; //n�o pode usar essa string, pois a vari�vel n�o foi inicializada

		String s2 = null; //nesse caso, o c�digo vai compilar, vai dar um erro de tempo de execu��o
		System.out.println(s2.concat("??")); //vai dar erro de NullPointerException, que � quando voc� tem uma vari�vel nula e
		//essa voc� tenta acessar algum atributo dessa vari�vel nula, e n�o se pode acessar nem atributo nem objeto de algo que
		//est� nulo, de algo que n�o aponta para nada real na mem�ria
		//esse erro NullPointerException � um erro de runtime (erro de tempo de execu��o)
	}
}
