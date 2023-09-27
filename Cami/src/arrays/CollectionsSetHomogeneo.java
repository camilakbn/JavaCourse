package arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionsSetHomogeneo {

	public static void main(String[] args) {

		Set<String> listaAprovados = new HashSet<>(); //essa lista é obrigatoriamente do tipo String

		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");

		for(String candidato: listaAprovados) {
			System.out.println(candidato); //o hashset não respeita a ordem		
		}

		SortedSet<Integer> nums = new TreeSet<>(); //o treeSet respeita a ordem dos objetos

		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);

		for(int n: nums) {
			System.out.println(n);
		}
	}
}
