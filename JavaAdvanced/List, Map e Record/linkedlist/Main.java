package linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<Fruit> fruits = new LinkedList<Fruit>(Arrays.asList(
				new Fruit("mela"),
				new Fruit("arancia")
				));
		for (Fruit fruit : fruits) {
			System.out.println(fruit);
		}
		fruits.add(0, new Fruit("prugna"));
		fruits.add(fruits.size(), new Fruit("kiwi"));
		System.out.println("-----------------");
		for (Fruit fruit : fruits) {
			System.out.println(fruit);
		}
	}

}
