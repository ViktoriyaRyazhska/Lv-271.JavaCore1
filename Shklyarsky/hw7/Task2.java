package hw7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task2 {

	public static void main(String[] args) {

		Map<String, String> per = new HashMap<>();
		per.put("Boklan", "Orest");
		per.put("Stupka", "Dmytro");
		per.put("Musienko", "Olena");
		per.put("Levitskiy", "Yaroslav");
		per.put("Li", "Pavlo");
		per.put("Halaburad", "Sofiya");
		per.put("Besedin", "Orest");
		per.put("Lehin", "Vasya");
		per.put("Zabuzko", "Oksana");
		per.put("Deres", "Lyubko");

		for (Map.Entry<String, String> entry : per.entrySet()) {
			System.out.println(entry.getValue() + " " + entry.getKey());
		}

		boolean contain = false;
		for (Map.Entry<String, String> entry : per.entrySet()) {
			String first = entry.getValue();
			String second = entry.getKey();
			for (Map.Entry<String, String> entry2 : per.entrySet()) {
				if (entry2.getValue().equals(first) && !entry2.getKey().equals(second)) {
					contain = true;
				}
			}
		}
		System.out.println("");
		if (contain) {
			System.out.println("there are two or more person with same name");
		} else {
			System.out.println("Every person has unique name");
		}
		System.out.println("");

		String del = "Orest";

		Set<String> remove = new HashSet<>();
		for (Map.Entry<String, String> entry : per.entrySet()) {
			if (entry.getValue().equals(del)) {
				remove.add(entry.getKey());
			}
		}
		for (String key : remove) {
			per.remove(key);
		}

		for (Map.Entry<String, String> entry : per.entrySet()) {
			System.out.println(entry.getValue() + " " + entry.getKey());
		}
	}
}
