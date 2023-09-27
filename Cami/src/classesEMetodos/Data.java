package classesEMetodos;

public class Data {

	//desafio: criar a classe Data e uma DataTeste,
	//dentro da classe Data criar tr�s produtos: dia, m�s e ano
	//criar uma classe DataTeste, que dentro dessa data teste ter� um m�todo main
	//instanciar duas datas

	//desafio: criar um m�todo dentro de data com o nome obterDataFormatada(...){}
	//esse m�todo vai retornar um tipo, tipo de retorno, par�metros, e a implementa��o do m�todo
	//substituir ou refatorar o data pra imprimir os valores retornados a partir dessa fun��o

	//desafio: criar dois construtores: o padr�o e o que vai receber dia, m�s e ano
	//quando for chamado o construtor padr�o, que por padr�o a data seja dia 1, m�s 1, ano 1970

	//THIS:
	//sempre que vc quer usar uma vari�vel que pertence � inst�ncia, vc pode usar o this + nome da vari�vel
	//usa-se o this para referenciar o objeto que est� sendo criado naquele momento
	//em m�todo static n�o tem como acessar o this
	//pode-se usar o this como objeto ou como m�todo, e o que vai definir isso � a ordem e quantidade dos par�metros

	int dia;
	int mes;
	int ano;

	Data(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1, 1, 1970); //sempre que voc� usa o this como m�todo, voc� est� chamando um construtor

		//quando vc cria vari�veis de inst�ncia ou de classe, se voc� n�o definir nenhum valor, o valor padr�o ser�:
		//byte, short, int, long (o valor padr�o �:) = 0
		//float, double (valor padr�o:) 0
		//boolean (valor padr�o:) = false
		//char (valor padr�o:) = '\u0000'
		//string e outros objetos (valor padr�o:) = null

		//apenas vari�veis definidas fora dos m�todos e construtores ser�o inicializadas com o valor padr�o
	}

	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String obterDataFormatada() {
		return String.format("%d/%d/%d", this.dia, mes, ano);
	}

	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
}
