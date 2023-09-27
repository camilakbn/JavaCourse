package estruturasDeControle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		//um else sempre estar� associado a um if, e um if pode ter uma express�o que retorna verdadeiro ou falso
		//se for verdadeiro ele executa o bloco associado ao if 
		//se for falso vai executar a senten�a de c�digo ou bloco associado ao else
		//tanto o if como o else podem ter uma �nica senten�a ou um bloco de c�digos
		
		String valor = JOptionPane.showInputDialog("Informe o n�mero: ");
		
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0)
			System.out.println("N�mero par");
		else
			System.out.println("N�mero �mpar");

	}

}
