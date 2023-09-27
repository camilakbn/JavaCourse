package classesEMetodos;

public class ValorNulo {

	public static void main(String[] args) {

		String s1 = "";
		System.out.println(s1.concat("!!"));

		//String s2; //não pode usar essa string, pois a variável não foi inicializada

		String s2 = null; //nesse caso, o código vai compilar, vai dar um erro de tempo de execução
		System.out.println(s2.concat("??")); //vai dar erro de NullPointerException, que é quando você tem uma variável nula e
		//essa você tenta acessar algum atributo dessa variável nula, e não se pode acessar nem atributo nem objeto de algo que
		//está nulo, de algo que não aponta para nada real na memória
		//esse erro NullPointerException é um erro de runtime (erro de tempo de execução)
	}
}
