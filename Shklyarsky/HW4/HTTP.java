import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HTTP {

	public static void main(String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Type number of error!");
		HTTPError er=null;
		
		String error = br.readLine();
		
		switch (error){
			case "400":
				er = HTTPError.BadRequest;
				break;
			case "401":
				er = HTTPError.AuthorizationRequired;
				break;
			case "402":
				er = HTTPError.Forbidden;
				break;
			case "403":
				er = HTTPError.NotFound;
				break;
			default :
				System.out.println("Wrong number [400-403]?");
				break;
		}
		System.out.println(er);

		
		
	}
	
}
