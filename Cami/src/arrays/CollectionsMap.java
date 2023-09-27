package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CollectionsMap {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		usuarios.put(1, "Roberto"); //no map, ao invés de .add, se usa o .put 
		//o put tanto adiciona um valor de uma chave, quanto substitui caso o dado já exista
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet()); //pega os dois valores ao mesmo tempo
		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.containsValue("Rebeca"));
		System.out.println(usuarios.get(3));
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(4, "Gui"));
		
		//métodos de como percorrer a chave
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		//método de como percorrer os valores
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		//outra forma de percorrer os dois dados
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ");
			System.out.println(registro.getValue());
		}
	}
}
