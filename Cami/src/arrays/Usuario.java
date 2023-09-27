package arrays;

public class Usuario {

	String nome;
	String email;

	@Override //se colocar "eq" e apertar ctrl + espa�o vai aparecer a op��o implementar o equals
	public boolean equals(Object objeto) { //o object � a classe mais gen�rica do java, tudo come�a a partir dela

		if(objeto instanceof Usuario) {

			Usuario outro = (Usuario) objeto; //foi feira uma convers�o do objeto em usu�rio

			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);

			return nomeIgual && emailIgual; //com esse equals implementado, vai dar verdadeiro nos equals no outro c�digo
		}

		else {
			return false;
		}
	}

	//o hashcode ser� abordado em outra aula
	public int hashCode() {
		return 0;
	}
}
