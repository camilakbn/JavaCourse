package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoNumerosString {

	public static void main(String[] args) {

		//convers�o n�meros para String:
		
		Integer num1 = 10000;
		System.out.println(num1.toString());
		System.out.println(num1.toString().length());
		
		int num2 = 10000;
		System.out.println(Integer.toString(num2));
		
		System.out.println("" + num2);
		
		//convers�o String para n�meros:
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro n�mero");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo n�mero");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("A soma � " + soma);
		System.out.println("A m�dia � " + soma / 2);
		

	}

}
