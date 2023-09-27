package classesEMetodos;

public class AreaCircTeste {

	public static void main(String[] args) {

		AreaCirc a1 = new AreaCirc(10);
		//a1.pi = 10; jeito errado de modificar o pi, pois ele está static, logO está associado à classe
		//mesmo se colocar a1 vai modificar o pi em todas as instâncias

		//AreaCirc.pi = 3.1415; //esse é o jeito certo de mudar o valor de pi, diretamente através da classe, pois está estatic

		System.out.println(a1.area()); //essa área pertence à instância
		System.out.println(AreaCirc.PI); 
		System.out.println(AreaCirc.area(100)); //essa área pertente à classe
		System.out.println(Math.PI);//atritutos em itálico (pi, out) significa que são atributos de classe
	}

}
