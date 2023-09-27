package orientacaoAoObjeto;

public class Motor {


	/*REUSO VIA COMPOSI��O
	 * Composi��o � quando voc� tem um objeto mais coplexo e esse objeto ao inv�s de voc� implementar tudo dentro dele voc�
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