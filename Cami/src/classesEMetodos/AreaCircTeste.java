package classesEMetodos;

public class AreaCircTeste {

	public static void main(String[] args) {

		AreaCirc a1 = new AreaCirc(10);
		//a1.pi = 10; jeito errado de modificar o pi, pois ele est� static, logO est� associado � classe
		//mesmo se colocar a1 vai modificar o pi em todas as inst�ncias

		//AreaCirc.pi = 3.1415; //esse � o jeito certo de mudar o valor de pi, diretamente atrav�s da classe, pois est� estatic

		System.out.println(a1.area()); //essa �rea pertence � inst�ncia
		System.out.println(AreaCirc.PI); 
		System.out.println(AreaCirc.area(100)); //essa �rea pertente � classe
		System.out.println(Math.PI);//atritutos em it�lico (pi, out) significa que s�o atributos de classe
	}

}
