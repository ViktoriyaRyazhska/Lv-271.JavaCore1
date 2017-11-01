package homework.lesson7.task2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MyMap {

	public static void main(String[] args) {
		Map<String, String> personMap = new HashMap<String, String>();
		personMap.put("Snow", "Jhon");
		personMap.put("Carr", "Donald");
		personMap.put("Tramp", "Donald");
		personMap.put("Jimmy", "Carter");
		personMap.put("Kennedy", "John");
		personMap.put("Johnson", "Lyndon");
		personMap.put("Obama", "Barak");
		personMap.put("Klynton", "Bill");
		personMap.put("Reygan", "Ronald");
		personMap.put("Sitk", "Lynda");
		for (Iterator<Entry<String, String>> i = personMap.entrySet().iterator(); i.hasNext();) {
			HashMap.Entry entry = (Map.Entry) i.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
	}

}
;