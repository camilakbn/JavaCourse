package classesEMetodos;

public class ClasseVsObjeto {

	public static void main(String[] args) {
		
		/* o nome de uma classe sempre começa com letra maiúscula (boas práticas)
		 * anatomia de uma classe: public class Nome {corpo da classe, pode ser um main}
		 * o que pode ser colocado dentro do corpo de uma classe: atributos (dados) e comportamentos (métodos)
		 * atributos (dados): int, boolean, date, string, etc
		 * comportamentos (métodos): main, sequência de passos, senteças de códigos, estruturas de controle
		 * os atributos e comportamentos são os membros da classe
		 * a classe é um agrupador de atributos e comportamentos
		 * 
		 * FATOS IMPORTANTES SOBRE CLASSE:
		 * - uma classe define um tipo e um tipo é uma estrutura de dados (ex.: tipo inteiro, double, string),
		 * esse tipo é personalizado para a aplicação da classe
		 * - uma classe representa uma abstração (simplificação), ex.: um produto (leite) vendido em um mercado de bairro vai
		 * precisar de menos informações adicionadas do que esse mesmo produto (leite) vendido na amazon
		 * ou seja, a abstração de um produto pra determinado software pode ser uma abstração totalmente
		 * diferente para outro software, mesmo que seja o mesmo produto
		 * classe = estrutura de dados 
		 * a partir de uma classe são definidos objetos e esses objetos vão formar uma estrutura de dados
		 * objeto == instância
		 * 
		 * CLASSE VS OBJETO
		 * classe (molde), ex.: molde de brinquedos de levar pra praia que vc consegue fazer por exemplo uma estrela com a areia
		 * objeto (instância): o resultado da estrela com areia
		 * EXEMPLO:
		 * criou um produto, que tem -nome, - preço, -desconto (isso é a classe)
		 * o produto é um -notebook, -R$4200,00, -15% desconto (isso é o objeto)
		 * uma classe pode ter quantas instâncias (objetos) você quiser
		 * 
		 * CONSTRUTOR: método especial que cria um objeto a partir de uma classe
		 * 
		 * MEMBROS DE UMA CLASSE
		 * 
		 * dentro de uma classe pode ter: 
		 * - atributos (variáveis e constantes), 
		 * - construtores (métodos), 
		 * - métodos, e 
		 * - outras classes.
		 * 
		 * comportamentos são os construtores, métodos e outras classes.
		 * 
		 * existem variáveis/constantes/métodos de classe ou de objeto
		 * o que vai variar um do outro (da classe ou do objeto) é a palavra STATIC
		 * 
		 * para acessar os membros de algum objeto se usa a notação ponto ".",
		 * ex: system.out.println (o ponto se usa para acessar os membros, o print é membro do out, e o out é membro do system)
		 * 
		 * MÉTODOS (COMPORTAMENTOS):
		 * o método - pode receber parâmetros de entrada e não gerar nada ao final
		 * - pode não receber nada e gerar algo ao final
		 * - pode receber parâmetros e retornar algo
		 * - pode não receber nada e não gerar nada
		 * 
		 * ANATOMIA de um método:
		 * int (tipo de retorno do método) nomeMetodo () (o () é onde ficam os parâmetros, esse método não recebe parâmetro) 
		 * {corpo do método}
		 * para que o método não retorne nada, coloca void no começo
		 * o nome do método + a lista de parâmetros define a assinatura/identidade do método, pq dentro de uma classe
		 * vc só pode ter um único método que tenha a mesma assinatura/identidade e parâmetros, 
		 * ou seja não pode ter dois métodos com mesmo nome e mesmos parâmetros
		 * 
		 * ex. de um método somar com dois parâmetros:
		 * int somar (int a, int b){
		 * return a + b;} OU 
		 * {int resultado = a + b;
		 * return resultado;}
		 * 
		 * System.out.println(); - system = classe; out = atributo (dado); println = comportamento (método);
		 * esse algoritmo recebe tanto dados de entrada quanto de saída
		 * nos métodos obrigatoriamente tem que colocar o parênteses no final "()"
		 */

	}

}
