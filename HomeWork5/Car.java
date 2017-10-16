package HomeWork5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Car {
	private int year;
	private int cap;
	
	public Car() {}
	public Car(int year, int cap) {
		this.year = year;
		this.cap = cap;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getCap() {
		return cap;
	}
	public void setCap(int cap) {
		this.cap = cap;
	}
	@Override
	public String toString() {
		return "Car [year=" + year + ", cap=" + cap + "]";
	}
	
	public static void main (String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		Car[] cr = new Car[4];
		cr[0] = new Car(1993,1000);
		cr[1] = new Car(1994,2000);
		cr[2] = new Car(1996,3000);
		cr[3] = new Car(1998,4500);
		
		System.out.println("Enter the year: ");
		for(int i = 0; i < cr.length; i++) {
			int y = Integer.parseInt(br.readLine());
			if (y == cr[0].year) {
				System.out.println("Engine capacity of this car: " + cr[0].cap);
			}
			else if(y == cr[1].year) {
				System.out.println("Engine capacity of this car: " + cr[1].cap);
			}
			else if(y == cr[2].year) {
				System.out.println("Engine capacity of this car: " + cr[2].cap);
			}
			else if(y == cr[3].year) {
				System.out.println("Engine capacity of this car: " + cr[3].cap);
			}
			else {
				System.out.println("We have no car of this year.");
			}
		}
		
		
		
		
	}
	
	

}
