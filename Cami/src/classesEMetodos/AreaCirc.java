package classesEMetodos;

public class AreaCirc {

	//o STATIC é usado para dizer que o valor daquela variável não mais pertence à instância e sim pertente à classe
	final static double PI = 3.1415;; //para virar constante tem q colocar "final", ex.: final static double pi OU static final double pi
	double raio;

	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}

	double area() {
		return PI * Math.pow(raio, 2); //o PI está em maiúsculo pois é uma constanter
	}

	static double area(double raio) { //é um método estático
		return PI * Math.pow(raio, 2);
	}

}
