package classesEMetodos;

public class Jantar {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Diana", 60);

		Comida c1 = new Comida("Lasanha", 0.300);

		Comida c2 = new Comida("Suco", 0.100);

		System.out.println(p1.apresentar());

		p1.comer(c1);
		System.out.println(p1.apresentar());

		p1.comer(c2);
		System.out.println(p1.apresentar());
	}
}
