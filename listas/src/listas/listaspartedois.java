package listas;

import java.util.ArrayList;
import java.util.List;

public class listaspartedois {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Maria Eduarda");
		list.add("Maria Ciarini");
		list.add("Maria Moura");
		list.add("Maria E C Moura");
		list.add("Dudinha");
		list.add(3, "Joãozinho");

		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("----------------");
		list.removeIf(x -> x.charAt(0) == 'M');

		System.out.println("Depois da remoção:");
		for (String x : list) {
			System.out.println(x);
		}

	}

}
