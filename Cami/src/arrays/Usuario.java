package arrays;

public class Usuario {

	String nome;
	String email;

	@Override //se colocar "eq" e apertar ctrl + espaço vai aparecer a opção implementar o equals
	public boolean equals(Object objeto) { //o object é a classe mais genérica do java, tudo começa a partir dela

		if(objeto instanceof Usuario) {

			Usuario outro = (Usuario) objeto; //foi feira uma conversão do objeto em usuário

			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);

			return nomeIgual && emailIgual; //com esse equals implementado, vai dar verdadeiro nos equals no outro código
		}

		else {
			return false;
		}
	}

	//o hashcode será abordado em outra aula
	public int hashCode() {
		return 0;
	}
}
