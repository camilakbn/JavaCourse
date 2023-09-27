package estruturasDeControle;

import java.util.Scanner;

public class IfElseIfDesafio {

	public static void main(String[] args) {
		
		//digitar por exemplo domingo e o programa vai retornar 1, digitar quarta e o programa vai retornar 4
		//criar um scanner para pegar os dados do usuário
		//o usuário vai digitar o dia da semana e vc vai retornar o número associado a aquele dia
		//usar if, else, else if
		
		Scanner semana = new Scanner (System.in);
		
		System.out.println("Digite o dia da semana: ");
		
		String diaDaSemana = semana.next();
				
		if(diaDaSemana.equalsIgnoreCase("Domingo"))
			System.out.println("1");
		else if(diaDaSemana.equalsIgnoreCase("Segunda") || diaDaSemana.equalsIgnoreCase("Segunda feira") 
				|| diaDaSemana.equalsIgnoreCase("Segunda-feira"))
			System.out.println("2");
		else if(diaDaSemana.equalsIgnoreCase("Terça") || diaDaSemana.equalsIgnoreCase("Terça feira") 
				|| diaDaSemana.equalsIgnoreCase("Terça-feira"))
			System.out.println("3");
		else if(diaDaSemana.equalsIgnoreCase("Quarta") || diaDaSemana.equalsIgnoreCase("Quarta feira") 
				|| diaDaSemana.equalsIgnoreCase("Quarta-feira"))
			System.out.println("4");
		else if(diaDaSemana.equalsIgnoreCase("Quinta") || diaDaSemana.equalsIgnoreCase("Quinta feira") 
				|| diaDaSemana.equalsIgnoreCase("Quinta-feira"))
			System.out.println("5");
		else if(diaDaSemana.equalsIgnoreCase("Sexta") || diaDaSemana.equalsIgnoreCase("Sexta feira")
				|| diaDaSemana.equalsIgnoreCase("Sexta-feira"))
			System.out.println("6");
		else if(diaDaSemana.equalsIgnoreCase("Sábado") || diaDaSemana.equalsIgnoreCase("Sabado"))
			System.out.println("7");
		else
			System.out.println("Dia inválido");
		
		//também pode ser feito assim:
		//if("domingo".equalsIgnoreCase(dia))
		//pq vai usar string com string também
		//não se usa == com string, tem que usar os comandos da string
		
		semana.close();

	}

}
