package classesEMetodos;

public class ClasseVsObjeto {

	public static void main(String[] args) {
		
		/* o nome de uma classe sempre come�a com letra mai�scula (boas pr�ticas)
		 * anatomia de uma classe: public class Nome {corpo da classe, pode ser um main}
		 * o que pode ser colocado dentro do corpo de uma classe: atributos (dados) e comportamentos (m�todos)
		 * atributos (dados): int, boolean, date, string, etc
		 * comportamentos (m�todos): main, sequ�ncia de passos, sente�as de c�digos, estruturas de controle
		 * os atributos e comportamentos s�o os membros da classe
		 * a classe � um agrupador de atributos e comportamentos
		 * 
		 * FATOS IMPORTANTES SOBRE CLASSE:
		 * - uma classe define um tipo e um tipo � uma estrutura de dados (ex.: tipo inteiro, double, string),
		 * esse tipo � personalizado para a aplica��o da classe
		 * - uma classe representa uma abstra��o (simplifica��o), ex.: um produto (leite) vendido em um mercado de bairro vai
		 * precisar de menos informa��es adicionadas do que esse mesmo produto (leite) vendido na amazon
		 * ou seja, a abstra��o de um produto pra determinado software pode ser uma abstra��o totalmente
		 * diferente para outro software, mesmo que seja o mesmo produto
		 * classe = estrutura de dados 
		 * a partir de uma classe s�o definidos objetos e esses objetos v�o formar uma estrutura de dados
		 * objeto == inst�ncia
		 * 
		 * CLASSE VS OBJETO
		 * classe (molde), ex.: molde de brinquedos de levar pra praia que vc consegue fazer por exemplo uma estrela com a areia
		 * objeto (inst�ncia): o resultado da estrela com areia
		 * EXEMPLO:
		 * criou um produto, que tem -nome, - pre�o, -desconto (isso � a classe)
		 * o produto � um -notebook, -R$4200,00, -15% desconto (isso � o objeto)
		 * uma classe pode ter quantas inst�ncias (objetos) voc� quiser
		 * 
		 * CONSTRUTOR: m�todo especial que cria um objeto a partir de uma classe
		 * 
		 * MEMBROS DE UMA CLASSE
		 * 
		 * dentro de uma classe pode ter: 
		 * - atributos (vari�veis e constantes), 
		 * - construtores (m�todos), 
		 * - m�todos, e 
		 * - outras classes.
		 * 
		 * comportamentos s�o os construtores, m�todos e outras classes.
		 * 
		 * existem vari�veis/constantes/m�todos de classe ou de objeto
		 * o que vai variar um do outro (da classe ou do objeto) � a palavra STATIC
		 * 
		 * para acessar os membros de algum objeto se usa a nota��o ponto ".",
		 * ex: system.out.println (o ponto se usa para acessar os membros, o print � membro do out, e o out � membro do system)
		 * 
		 * M�TODOS (COMPORTAMENTOS):
		 * o m�todo - pode receber par�metros de entrada e n�o gerar nada ao final
		 * - pode n�o receber nada e gerar algo ao final
		 * - pode receber par�metros e retornar algo
		 * - pode n�o receber nada e n�o gerar nada
		 * 
		 * ANATOMIA de um m�todo:
		 * int (tipo de retorno do m�todo) nomeMetodo () (o () � onde ficam os par�metros, esse m�todo n�o recebe par�metro) 
		 * {corpo do m�todo}
		 * para que o m�todo n�o retorne nada, coloca void no come�o
		 * o nome do m�todo + a lista de par�metros define a assinatura/identidade do m�todo, pq dentro de uma classe
		 * vc s� pode ter um �nico m�todo que tenha a mesma assinatura/identidade e par�metros, 
		 * ou seja n�o pode ter dois m�todos com mesmo nome e mesmos par�metros
		 * 
		 * ex. de um m�todo somar com dois par�metros:
		 * int somar (int a, int b){
		 * return a + b;} OU 
		 * {int resultado = a + b;
		 * return resultado;}
		 * 
		 * System.out.println(); - system = classe; out = atributo (dado); println = comportamento (m�todo);
		 * esse algoritmo recebe tanto dados de entrada quanto de sa�da
		 * nos m�todos obrigatoriamente tem que colocar o par�nteses no final "()"
		 */

	}

}
