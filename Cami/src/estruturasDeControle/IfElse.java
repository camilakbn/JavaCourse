package estruturasDeControle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		//um else sempre estará associado a um if, e um if pode ter uma expressão que retorna verdadeiro ou falso
		//se for verdadeiro ele executa o bloco associado ao if 
		//se for falso vai executar a sentença de código ou bloco associado ao else
		//tanto o if como o else podem ter uma única sentença ou um bloco de códigos
		
		String valor = JOptionPane.showInputDialog("Informe o número: ");
		
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0)
			System.out.println("Número par");
		else
			System.out.println("Número ímpar");

	}

}
