package HomeWork7;

import java.util.HashSet;
import java.util.Set;

public class parameterizedMethods {
	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(4);
		set2.add(5);
		
		set1.addAll(set2);
		for(int h : set1) {
			System.out.println(h);
		}
		System.out.println("");
		
		set1.retainAll(set2);
		for(int n : set1) {
			System.out.println(n);
		}
		
		
	}

}
