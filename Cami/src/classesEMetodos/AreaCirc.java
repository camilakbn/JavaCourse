package classesEMetodos;

public class AreaCirc {

	//o STATIC � usado para dizer que o valor daquela vari�vel n�o mais pertence � inst�ncia e sim pertente � classe
	final static double PI = 3.1415;; //para virar constante tem q colocar "final", ex.: final static double pi OU static final double pi
	double raio;

	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}

	double area() {
		return PI * Math.pow(raio, 2); //o PI est� em mai�sculo pois � uma constanter
	}

	static double area(double raio) { //� um m�todo est�tico
		return PI * Math.pow(raio, 2);
	}

}
