package hw7;

import java.util.HashSet;
import java.util.Set;

public class Task1 {

	public static void main(String[] args) {

		Set<String> result;

		Set<String> first = new HashSet<>();
		Set<String> second = new HashSet<>();

		first.add("A");
		first.add("B");
		first.add("C");

		second.add("B");
		second.add("A");
		second.add("D");

		result = union(first, second);
		System.out.println(result);

		result = intersect(first, second);
		System.out.println(result);
	}

	public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
		Set<T> result = new HashSet<>();
		result.addAll(set1);
		result.addAll(set2);
		return result;
	}

	public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
		Set<T> result = new HashSet<>();
		for (T t : set1) {
			if (set2.contains(t)) {
				result.add(t);
			}
		}
		return result;
	}

}
