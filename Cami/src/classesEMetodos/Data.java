package classesEMetodos;

public class Data {

	//desafio: criar a classe Data e uma DataTeste,
	//dentro da classe Data criar três produtos: dia, mês e ano
	//criar uma classe DataTeste, que dentro dessa data teste terá um método main
	//instanciar duas datas

	//desafio: criar um método dentro de data com o nome obterDataFormatada(...){}
	//esse método vai retornar um tipo, tipo de retorno, parâmetros, e a implementação do método
	//substituir ou refatorar o data pra imprimir os valores retornados a partir dessa função

	//desafio: criar dois construtores: o padrão e o que vai receber dia, mês e ano
	//quando for chamado o construtor padrão, que por padrão a data seja dia 1, mês 1, ano 1970

	//THIS:
	//sempre que vc quer usar uma variável que pertence à instância, vc pode usar o this + nome da variável
	//usa-se o this para referenciar o objeto que está sendo criado naquele momento
	//em método static não tem como acessar o this
	//pode-se usar o this como objeto ou como método, e o que vai definir isso é a ordem e quantidade dos parâmetros

	int dia;
	int mes;
	int ano;

	Data(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1, 1, 1970); //sempre que você usa o this como método, você está chamando um construtor

		//quando vc cria variáveis de instância ou de classe, se você não definir nenhum valor, o valor padrão será:
		//byte, short, int, long (o valor padrão é:) = 0
		//float, double (valor padrão:) 0
		//boolean (valor padrão:) = false
		//char (valor padrão:) = '\u0000'
		//string e outros objetos (valor padrão:) = null

		//apenas variáveis definidas fora dos métodos e construtores serão inicializadas com o valor padrão
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
