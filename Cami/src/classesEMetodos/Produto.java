package classesEMetodos;

public class Produto {

	/*DESAFIO: suponha que a classe Produto faz parte de um sistema que você está desenvolvendo para uma loja
	 * nome da loja: 25% de desconto, o dono da loja diz que a loja tem uma política: 
	 * quando um desconto é aplicado ele é aplicado para todos os produtos sem excessão (desconto padrão de 25%)
	 * no natal o desconto varia para 30%, mas para TODOS OS PRODUTOS
	 * pode colocar uma variável do desconto de classe (static)
	 * */

	String nome;
	double preco;
	static double desconto = 0.25;

	Produto(String nomeInicial, double precoInicial){ //definiu de forma explícita o construtor padrão
		nome = nomeInicial;
		preco = precoInicial;
	}

	Produto() { //se colocar void no início(retorno) ele se transforma em um método, deixa de ser um construtor
	}

	double precoComDesconto () { //não recebe parâmetros pq dentro da classe produto já tem os dados dos parâmetros q precisa 
		return preco * (1 - desconto); //se não tivesse os dados teria que criar os parâmetros
	}

	double precoComDesconto (double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
