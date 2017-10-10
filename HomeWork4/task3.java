package HomeWork4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task3 {
	public enum HTTPError{
		Forbidden, Badrequest, Unauthorized, PaymentRequired
	}
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		HTTPError er = HTTPError.Forbidden;
		int ernumber = Integer.parseInt(br.readLine());
		
		switch(ernumber) {
		case 400:
			System.out.println("Name of this error: " + (er = HTTPError.Badrequest)); break;
		case 401:
			System.out.println("Name of this error: " + (er = HTTPError.Unauthorized)); break;
		case 402:
			System.out.println("Name of this error: " + (er = HTTPError.PaymentRequired)); break;
		case 403:
			System.out.println("Name of this error: " + (er = HTTPError.Forbidden)); break;
			default:
				System.out.println("WRONG");
				System.exit(0);
		}
		
		
		
	}

}
