package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Bom dia X";
		//tudo que é definido em roxo/negrito é palavra reservada da linguagem
		//quando se tem um tipo que não é primitivo, vc consegue usar o "."
		//exemplo, quando vc escreve "s." vão aparecer opções de código para escolher
		
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!");
		System.out.println(s);
		
		System.out.println("Leo".toUpperCase());
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X".replace("X", "Gui");
		System.out.println(y);
		//pode colocar o código em linhas separadas, pode quebrar ele antes ou depois do "." que vai funcionar normalmente
		//exemplo: 
		//String y = "Bom dia X"
		//.replace("X", "Gui");
		//System.out.println(y);
		
		String z = "Bom dia X".replace("X", "Gui").toLowerCase().concat("!!");
		System.out.println(z);

		//tipos primitivos não tem o operador "."
	}
}
