package arrays;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<UsuarioListCollections> usuarios = new HashSet<UsuarioListCollections>();
		
		usuarios.add(new UsuarioListCollections("Pedro"));
		usuarios.add(new UsuarioListCollections("Ana"));
		usuarios.add(new UsuarioListCollections("Guilherme"));
		
		System.out.println(usuarios.contains(new UsuarioListCollections("Guilherme")));

	}
}
