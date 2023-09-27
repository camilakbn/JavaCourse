package classesEMetodos;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data(); //isso é uma instância
		
		Data d2 = new Data(22, 06, 1995); //nova instância
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		

	}

}
