import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class HW {
	
	//first 

	public static void main(String[ ] args) throws IOException  {
		 BufferedReader br = new  BufferedReader(
				 new InputStreamReader(System.in));

		 System.out.println("Enter radius: ");
		 double one = Double.parseDouble(br.readLine());
		 System.out.println("Perimeter:" + (2*3.1415*one));
		 System.out.println("Area = " + Math.PI*one*Math.pow(one, 2));


	//second
		 
		 System.out.println("What is your name?");
		 String name = br.readLine();
		 System.out.println("Where are you live, "+ name +" ?");
		 String adres = br.readLine();
		 System.out.println("Whole information: "+ name +" "+ adres);


	//third

	 System.out.println("Country 1: ");
		 double one1 = Double.parseDouble(br.readLine());
		 System.out.println("Country 2: ");
		 double two1 = Double.parseDouble(br.readLine());
		 System.out.println("Country 3: ");
		 double three1 = Double.parseDouble(br.readLine());
		 
		 System.out.println("Talks continued t1: ");
		 double time1 = Double.parseDouble(br.readLine());
		 System.out.println("Talks continued t2: ");
		 double time2 = Double.parseDouble(br.readLine());
		 System.out.println("Talks continued t3: ");
		 double time3 = Double.parseDouble(br.readLine());
		 
		 System.out.println("1: " + (time1*one1)  );
		 System.out.println("2: " + (time2*two1) );
		 System.out.println("3: " + (time3*three1) );
		 System.out.println("1+2+3 = " + ((time1*one1)+ (time2*two1) + (time3*three1)) );




		 
	}

}
