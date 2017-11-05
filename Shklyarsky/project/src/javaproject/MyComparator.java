package javaproject;

import java.util.Comparator;

public class MyComparator implements Comparator<Customer> {

	public int compare(Customer o1, Customer o2) {
		return o2.insurance - o1.insurance;
	}
}
