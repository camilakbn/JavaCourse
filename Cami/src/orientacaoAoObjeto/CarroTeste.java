package orientacaoAoObjeto;

public class CarroTeste {

	public static void main(String[] args) { //essa relação motor x carro é unidirecional (um pra um)

		Carro c1 = new Carro();
		System.out.println(c1.estaLigado());

		c1.ligar();
		System.out.println(c1.estaLigado());

		System.out.println(c1.motor.giros());

		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();

		System.out.println(c1.motor.giros());

		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();

		System.out.println(c1.motor.giros());

		//falta encapsulamento
		//c1.motor.fatorInjecao = -30;
	}
}