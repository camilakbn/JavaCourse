package arrays;

import java.util.ArrayList;

public class CollectionsList {

	public static void main(String[] args) {

		/*LIST: pode ser heterog�neo (mas n�o � o melhor), pode ser homog�neo, aceita objetos duplicados, � ordenado, � indexado */

		ArrayList<UsuarioListCollections> lista = new ArrayList<>();

		UsuarioListCollections u1 = new UsuarioListCollections("Ana");
		lista.add(u1); //pode ser feito desse modo

		lista.add(new UsuarioListCollections("Carlos")); //ou desse modo
		lista.add(new UsuarioListCollections("Lia")); 
		lista.add(new UsuarioListCollections("Bia")); 
		lista.add(new UsuarioListCollections("Manu")); 

		System.out.println(lista.get(3)); //consegue acessar pelo �ndice
		
		System.out.println(lista.remove(1)); //remove pelo �ndice
		System.out.println(lista.remove(new UsuarioListCollections("Manu")));
		
		System.out.println(lista.contains(new UsuarioListCollections("Lia")));

		for(UsuarioListCollections u: lista) {
			System.out.println(u.nome);
		}		
	}
}
