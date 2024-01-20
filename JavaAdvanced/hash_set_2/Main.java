package hash_set_2;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
	
	private static HashSet<Integer> fullHashSet() {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.addAll(Arrays.asList(new Integer[] {1,9,4,12,6,6}));
		return hashSet;
	}
	
	public static void main(String[] args) {
		Integer number = 2;
		System.out.println(fullHashSet().contains(number));
	}
}
