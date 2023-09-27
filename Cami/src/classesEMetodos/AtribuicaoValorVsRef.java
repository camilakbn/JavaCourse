package classesEMetodos;

public class AtribuicaoValorVsRef {

	public static void main(String[] args) {

		/*Atribuição por Valor vs Atribuição por Referência
		 * atribuição por valor: primitivos
		 * ex.: 
		 * int a = 2;
		 * int b = a; (a atribuição é feita a partir do ponto-vírgula) (uma cópia do valor foi atribuída de a pra b)
		 * a++; (esse valor na memória vai ficar 3)
		 * b--; (esse valor na memória vai ficar 1, pois a e b são variáveis independentes)
		 * 
		 * atribuição por referência: objetos
		 * ex.:
		 * Data d1 = new Data ();
		 * Data d2 = d1; (as duas datas vão pegar o valor do mesmo lugar/objeto)
		 * da.dia = 3;
		 * di.mes = 7; (ao fazer isso, as duas datas vão estar iguais pois a referência delas é a mesma)
		 * 
		 * SE FIZER ISSO DEPOIS:
		 * d2 = new Data(); (d2 vai apontar para um novo objeto)
		 * d2.dia = 4;
		 * */

		double a = 2;
		double b = a; //atribuição por valor, pq está trabalhando com tipo primitivo

		a++;
		b--;

		System.out.println(a + " " + b); //valores independentes

		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; //atribuição por referência, pq está trabalhando com objeto

		d1.dia = 31;
		d2.mes = 12;

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());//as duas variáveis apontam para um mesmo objeto em memória

		voltarDataParaValorPadrao(d1);

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());

		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c); //o valor de c não mudou, pq o valor primitivo que foi gerado dentro do static não gera impacto fora
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