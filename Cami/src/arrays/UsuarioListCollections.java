package arrays;

public class UsuarioListCollections {

	String nome;
	
	UsuarioListCollections(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Meu nome é " + this.nome + ".";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioListCollections other = (UsuarioListCollections) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}	
}
