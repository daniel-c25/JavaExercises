package hash_set_3;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
	
	private static HashSet<Integer> fullHashSet() {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.addAll(Arrays.asList(new Integer[] {1,9,4,12,6}));
		return hashSet;
	}
	
	public static void main(String[] args) {
		Integer number = 4;
		HashSet<Integer> hashSet = fullHashSet();
		if(hashSet.contains(number) == true){
			hashSet.remove(number);
			System.out.println(hashSet.toString());
		}else {
			System.out.println("Elemento non trovato");
		}
		hashSet.clear();
		System.out.println(hashSet.toString());
	}
}