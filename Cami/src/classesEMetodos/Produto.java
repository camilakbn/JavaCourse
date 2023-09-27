package classesEMetodos;

public class Produto {

	/*DESAFIO: suponha que a classe Produto faz parte de um sistema que voc� est� desenvolvendo para uma loja
	 * nome da loja: 25% de desconto, o dono da loja diz que a loja tem uma pol�tica: 
	 * quando um desconto � aplicado ele � aplicado para todos os produtos sem excess�o (desconto padr�o de 25%)
	 * no natal o desconto varia para 30%, mas para TODOS OS PRODUTOS
	 * pode colocar uma vari�vel do desconto de classe (static)
	 * */

	String nome;
	double preco;
	static double desconto = 0.25;

	Produto(String nomeInicial, double precoInicial){ //definiu de forma expl�cita o construtor padr�o
		nome = nomeInicial;
		preco = precoInicial;
	}

	Produto() { //se colocar void no in�cio(retorno) ele se transforma em um m�todo, deixa de ser um construtor
	}

	double precoComDesconto () { //n�o recebe par�metros pq dentro da classe produto j� tem os dados dos par�metros q precisa 
		return preco * (1 - desconto); //se n�o tivesse os dados teria que criar os par�metros
	}

	double precoComDesconto (double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
