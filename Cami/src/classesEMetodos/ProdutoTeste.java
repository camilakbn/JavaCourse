package classesEMetodos;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 4356.89); //isso aqui é igual faz com o Scanner, para importar os dados existente na outra classe
		//quando o construtor está explícito, precisa passar o valor do produto direto nele

		var p2 = new Produto();
		p2.nome = "Caneta preta"; 
		p2.preco = 12.56;

		Produto.desconto = 0.50;

		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		System.out.printf("A média do carrinho é de R$%.2f.", mediaCarrinho);

	}
}
