package pracTasks4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task3 {
	
	public enum Continental {
		EUROPE, NORTHAMERICA, SOUTHAMERICA, AFRICA
		
	}
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	
	public static void main (String[] args) throws IOException {
		
		
		Continental cont;
		String country = null;
		country = br.readLine();
		
		
		switch(country.toLowerCase()){
		case "Ukraine": case "Germany": case "Poland":
			System.out.println(cont = Continental.EUROPE); break;
		case "Canada": case "Cuba": case "Costa Rica":
			System.out.println (cont = Continental.NORTHAMERICA); break;
		case "Argentina": case "Colombia": case "Ecuador":
			System.out.println (cont = Continental.SOUTHAMERICA); break;
		case "Egypt": case "Nigeria": case "Tunisia":
			System.out.println (cont = Continental.AFRICA); break;
			default:
				System.out.println("WRONG");
				System.exit(0);
		}
		
		
		
	}

}
