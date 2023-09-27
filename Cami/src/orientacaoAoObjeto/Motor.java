package orientacaoAoObjeto;

public class Motor {


	/*REUSO VIA COMPOSIÇÃO
	 * Composição é quando você tem um objeto mais coplexo e esse objeto ao invés de você implementar tudo dentro dele você
	 * quebra em outros objetos menores */

	boolean ligado = false;
	double fatorInjecao = 1;

	int giros() {
		if(!ligado) {
			return 0;
		}
		else {
			return (int) Math.round(fatorInjecao * 3000);
		}
	}
}