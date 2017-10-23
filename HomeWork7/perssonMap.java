package HomeWork7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class perssonMap {
	public static void main(String[] args) throws IOException {
		Map<String, String> personMap = new HashMap<String, String>();

		personMap.put("Marchenko", "Vitalii");
		personMap.put("Ivanov", "Sergey");
		personMap.put("Sergeev", "Petr");
		personMap.put("Petrov", "Dmitriy");
		personMap.put("Nikolaev", "Petr");

		for (Map.Entry<String, String> h : personMap.entrySet()) {
			System.out.println(h.getKey() + " " + h.getValue());
		}

		System.out.println("");

		List<String> duplicates = new ArrayList<>();
		List<String> keys = new ArrayList<>();

		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			if (duplicates.contains(entry.getValue())) {
				keys.add(entry.getKey());
			} else {
				duplicates.add(entry.getValue());
			}
		}

		for (String key : keys) {
			System.out.println("Person with key " + key + " have duplicate name");
		}

		System.out.println(" ");
		System.out.println("Enter the lastName of person you want to delete: ");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		personMap.remove(br.readLine());
		System.out.println("Person with firstName - Sergey, removed. Result:");
		for (Map.Entry<String, String> del : personMap.entrySet()) {
			System.out.println(del.getKey() + " " + del.getValue());

		}

	}

}
