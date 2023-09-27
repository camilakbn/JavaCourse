package estruturasDeControle;

public class IfDesafio {

	public static void main(String[] args) {
		
		//encontre o erro no código abaixo
		
		double nota = 1.3;
		
		if(nota >= 9.0); {
			System.out.println("Quadro de honra!");
			System.out.println("Você é fera!");
		}
		
		//o erro está no ponto-vírgula ";" após o if, pois colocando esse ; o if não vai está conectado ao corpo
		//o ponto-vírgula é uma sentença de código válida, e isso faz ela separar o if do corpo
		//as estruturas de controle (if, outras que vou aprender) não são terminadas com ponto-vírgula (tem uma excessão)
		
		}

	}
