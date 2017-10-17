import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarMain {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Car[] vehicle = new Car[4];
		
		for(int i = 0;i<vehicle.length;i++) {
			vehicle[i]=new Car();
			System.out.println("enter type engine and year for " +(i+1) + "car");
			vehicle[i].setType(br.readLine());
			vehicle[i].setEngine(Integer.parseInt(br.readLine()));
			vehicle[i].setYearProduction(Integer.parseInt(br.readLine()));
			}
		
		
		System.out.println("enter year of production");
		int year = Integer.parseInt(br.readLine());
		for(int i = 0;i<vehicle.length;i++) {
			if(year==vehicle[i].getYearProduction()) {
				System.out.println("this vehicle "+ vehicle[i].getType() +" is from " +vehicle[i].getYearProduction());
			}
		}
		
		Car temp = new Car();
		for(int i =0;i<vehicle.length-1;i++) {
			for(int j = i+1;j<vehicle.length;j++) {
				if( vehicle[i].getYearProduction()<vehicle[j].getYearProduction()) {
				temp = vehicle[i];
				vehicle[i]=vehicle[j];
				vehicle[j]=temp;
				}
			}	
		}
		System.out.println("by year");
		for(int i =0;i<vehicle.length;i++) {
		System.out.println(vehicle[i].toString());	
		}
	}

}
