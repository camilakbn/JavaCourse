package classesEMetodos;

public class AtribuicaoValorVsRef {

	public static void main(String[] args) {

		/*Atribui��o por Valor vs Atribui��o por Refer�ncia
		 * atribui��o por valor: primitivos
		 * ex.: 
		 * int a = 2;
		 * int b = a; (a atribui��o � feita a partir do ponto-v�rgula) (uma c�pia do valor foi atribu�da de a pra b)
		 * a++; (esse valor na mem�ria vai ficar 3)
		 * b--; (esse valor na mem�ria vai ficar 1, pois a e b s�o vari�veis independentes)
		 * 
		 * atribui��o por refer�ncia: objetos
		 * ex.:
		 * Data d1 = new Data ();
		 * Data d2 = d1; (as duas datas v�o pegar o valor do mesmo lugar/objeto)
		 * da.dia = 3;
		 * di.mes = 7; (ao fazer isso, as duas datas v�o estar iguais pois a refer�ncia delas � a mesma)
		 * 
		 * SE FIZER ISSO DEPOIS:
		 * d2 = new Data(); (d2 vai apontar para um novo objeto)
		 * d2.dia = 4;
		 * */

		double a = 2;
		double b = a; //atribui��o por valor, pq est� trabalhando com tipo primitivo

		a++;
		b--;

		System.out.println(a + " " + b); //valores independentes

		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; //atribui��o por refer�ncia, pq est� trabalhando com objeto

		d1.dia = 31;
		d2.mes = 12;

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());//as duas vari�veis apontam para um mesmo objeto em mem�ria

		voltarDataParaValorPadrao(d1);

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c); //o valor de c n�o mudou, pq o valor primitivo que foi gerado dentro do static n�o gera impacto fora
	}

	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}

	static void alterarPrimitivo(int c) {
		c++;
	}
}