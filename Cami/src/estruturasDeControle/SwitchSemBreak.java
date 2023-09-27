package estruturasDeControle;

public class SwitchSemBreak {

	public static void main(String[] args) {

		//99% das vezes que for usar o swtch, vai usar o break
		//if e while são expressões booleanas
		//for(;boolean;)
		//o switch vai receber diretamente um valor
		//quando ele entra em um case, se não tiver o break ele vai executar todos os outros abaixo

		String faixa = "preta";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			break;
		default:
			System.out.println("Não sei nada");
		}

		System.out.println("Fim!");
		
	}

}
