package fundamentos;

public class OperadoresLogicosDesafio {

	public static void main(String[] args) {
		
		//DESAFIO: 
		//Imagine que vc vai ter dois trabalhos na pr�xima semana que ir�o ser confirmados ou n�o
		//Trabalho na ter�a (V ou F)
		//Trabalho na quinta (V ou F)
		//Vc prometeu para sua fam�lia que se os dois trabalhos derem certo vc vai comprar uma tv de 50 polegadas no fds (shopping)
		//Se apenas um dos trabalhos derem certo vc vai comprar uma tv de 32 polegadas
		//E se um dos dois derem certo, a fam�lia indo pro shopping vcs v�o tomar sorvete juntos para comemorar a compra da tv
		//Se nenhum dos dois derem certo a fam�lia vai ficar em casa sem sorvete (com fome ou mais saud�vel)
		
		boolean trabalhoTerca = true;
		boolean trabalhoQuinta = true;
		boolean tv50 = trabalhoTerca && trabalhoQuinta;
		boolean tv32 = trabalhoTerca || trabalhoQuinta;
		boolean tomarSorvete = tv50 || tv32;
		boolean comerSaudavel = !tomarSorvete;
		
		System.out.println("Comprou a TV 50\"? " + tv50);
		System.out.println("Comprou a TV 32\"? " + tv32);
		System.out.println("Comprou sorvete? " + tomarSorvete);
		System.out.println("Mais saud�vel? " + comerSaudavel);
		
		
				
		
		
		
		

	}

}
