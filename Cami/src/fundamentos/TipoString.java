package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(5));
		//charAt é pra mostrar qual caractere está no espaço tal (tipo o 5 caractere é a letra "e"
		
		String s = "Boa tarde";
		//o valor/conteúdo da String não pode ser modificado, mas pode ser substituido
		System.out.println(s.concat("!!"));
		System.out.println(s + "!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));

		var nome = "Pedro";
		//esse var agora é uma String, se você colocar o "." depois do "nome" vão aparecer opções strings atreladas a ele
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 123.45678;
		
		System.out.println("Nome: " + nome + 
				"\nSobrenome: " + sobrenome + 
					"\nIdade: " + idade + 
						"\nSalario: " + salario + "\n\n");
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.\n", nome, sobrenome, idade, salario);
		//as porcentagens: %s=string, %d=inteiro, %f=float ou double
		
		String frase = String.format("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
		

		//String é uma classe
		
	}

}
