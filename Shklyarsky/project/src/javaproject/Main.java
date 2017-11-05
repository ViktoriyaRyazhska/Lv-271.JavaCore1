package javaproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The program allows logging into the system for two types of users (manager,
 * broker), which are able to add and delete corresponding person's information
 * (broker, customer), and copy relevant data into txt file.
 * 
 * @author Shklyarsky
 * @since 2017-11-05
 */

public class Main {

	public static void main(String[] args) throws IOException {

		String position;
		String action = null;
		String entryPass = null;
		String pass = null;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		User mng = new Manager();
		User brk = new Broker();

		User manager = new Manager("Alex", "123");

		Map<String, Broker> brokers = new HashMap<String, Broker>();
		brokers.put("Taras", new Broker(720, "+380789123456", "Kiev", "tar123"));
		brokers.put("Pavlo", new Broker(300, "+380127893456", "Kiev", "pav123"));
		brokers.put("Vasya", new Broker(500, "+3809876543219", "lviv", "vas123"));

		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer("Taras", "Lewandovski", 30000, 5, "17-08-22"));
		customers.add(new Customer("Taras", "Yarmolenko", 20000, 8, "17-07-09"));
		customers.add(new Customer("Pavlo", "Buyalskiy", 22000, 2, "16-12-30"));
		customers.add(new Customer("Pavlo", "Tomashivskyi", 45000, 15, "17-04-01"));
		customers.add(new Customer("Vasya", "Savchenko", 15000, 4, "17-06-15"));
		customers.add(new Customer("Vasya", "Sidorenko", 18000, 10, "17-03-18"));
		customers.add(new Customer("Vasya", "Moravskyi", 27000, 12, "17-05-30"));

		List<Customer> filteredCustomers = new ArrayList<Customer>();

		while (true) {
			System.out.println("Are you Manager or broker?");

			position = br.readLine().toLowerCase();

			switch (position) {
			case "manager":

				if (mng.passwordCheck()) {
					System.out.println(manager.toString());
					System.out.println("\nFor add new broker enter <add>.\nFor view list of brokers enter"
							+ " <view>.\nFor delete broker enter <delete>.");
					try {
						action = br.readLine().toLowerCase();
					} catch (IOException e) {
						e.printStackTrace();
					}
					switch (action) {

					case "add":
						String managerAdd = mng.addInfo();
						String[] arrM = managerAdd.split(" ");

						String eName = arrM[0].toString();
						int eSalary = Integer.parseInt(arrM[1]);
						String eNumber = arrM[2].toString();
						String eCity = arrM[3].toString();
						String ePassword = arrM[4].toString();

						brokers.put(eName, new Broker(eSalary, eNumber, eCity, ePassword));

						System.out.println("\nSuccesfully added ");

					case "view":
						String fileName = "BrokersInfo.txt";
						PrintWriter outputStream = new PrintWriter(fileName);
						outputStream.println("Name |   salary  |          phone number             |    City   | ");

						customers.sort(new MyComparator());

						for (String mp : brokers.keySet()) {

							String key = mp.toString();
							String value = brokers.get(mp).toString();

							outputStream.println(key + " " + value);
						}
						outputStream.println(
								"\n\n\n----------------------------------------------------------------------------"
										+ "---------------------------------\n                           Customer table  ");
						outputStream.println("------------------------------------------------------------------------"
								+ "-------------------------------------\n broker | customer | car price |"
								+ " years behind the wheel | date of deal | price of vehicle insurance ");
						outputStream.println(customers);
						outputStream.close();

						System.out.println("\nSuccesfully copied into txt file");
						break;

					case "delete":
						System.out.println("\nWhom you want to release?");

						String release = br.readLine();
						brokers.remove(release);
						break;

					default:
						System.out.println("enter corect info");
					}
				} else {
					System.out.println("Wrong password");
				}
				break;

			case "broker":
				System.out.println("\nEnter your name");
				String brokerLoginName = br.readLine();

				pass = brokers.get(brokerLoginName).getPassword().toString();
				System.out.println("\nEnter password");
				entryPass = br.readLine();

				Pattern p = Pattern.compile(pass);
				Matcher match = p.matcher(entryPass);

				if (match.matches()) {
					System.out
							.println("\nFor add new customer enter <add>.\nFor view list of customers enter <view>.\nFor "
									+ "delete customer enter <delete>.");
					try {
						action = br.readLine().toLowerCase();
					} catch (IOException e) {
						e.printStackTrace();
					}
					switch (action) {

					case "add":
						String brokerAdd = brk.addInfo();
						String[] arrB = brokerAdd.split(" ");

						String customerName = arrB[0].toString();
						int carPrice = Integer.parseInt(arrB[1]);
						int driverSkill = Integer.parseInt(arrB[2]);
						String dealDate = arrB[3].toString();

						customers.add(new Customer(brokerLoginName, customerName, carPrice, driverSkill, dealDate));

						System.out.println("\nSuccesfully added");
						break;

					case "view":
						for (int i = 0; i < customers.size(); i++) {
							if (customers.get(i).getBrokerName().equals(brokerLoginName)) {
								filteredCustomers.add(customers.get(i));
							}
						}
						filteredCustomers.sort(new MyComparator());

						String file = "CustomerInfo.txt";
						PrintWriter output = new PrintWriter(file);
						output.println(" broker | customer | car price | years behind the wheel | date of deal |"
								+ " price of vehicle insurance ");
						output.println(filteredCustomers);
						output.close();

						System.out.println("\nSuccesfully added into txt file");
						break;

					case "delete":
						System.out.println("\nWhom you want to delete?");

						String leaver = br.readLine();

						for (int i = 0; i < customers.size(); i++) {
							if (customers.get(i).getCustomerName().equals(leaver)) {
								if (customers.get(i).getBrokerName().equals(brokerLoginName)) {
									customers.remove(i);
									System.out.println("\n"+leaver + " succesfully deleted");
								} else {
									System.out.println("\nyou can only delete your customer");
								}
							}
						}
						break;
					default:
						System.out.println("\nEnter correct info");
					}
				} else {
					System.out.println("\nWrong password");
				}
				break;
			default:
				System.out.println("\nEnter correct data");
			}
			System.out.println("\nPress enter to go back to login");
			br.readLine();
		}
	}
}
