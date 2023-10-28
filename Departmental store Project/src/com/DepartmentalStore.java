package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DepartmentalStore {

	Scanner scan = new Scanner(System.in);

	/** key-> product id & value -> product object */
	Map<Integer, Product> db = new LinkedHashMap<Integer, Product>();

	int totalBill = 0;

	void addProduct() {
		db.put(1,  new Product("Chocolates", 20, 5));
		db.put(2,  new Product("Biscuits", 15, 10));
		db.put(3, new Product("IceCreams", 10, 30));
	}

	void displayProduct() {
		Set<Integer> keys = db.keySet();	//1 2 3
		for(int key:keys) {
			Product p = db.get(key);	// getting product based on key
			System.out.println("Enter "+key+" to order "+p.getName());
			System.out.println("Available Quantity: "+p.getQuantity());
			System.out.println("Cost: Rs."+p.getCost());
			System.out.println("--------------------------------------");
		}
	}

	void buyProduct() {
		System.out.println("Enter Choice: ");	// choice -> key
		int choice = scan.nextInt();

		Product p = db.get(choice);// Product p

		if(p!=null) {
			System.out.println("Enter Quantity:");
			int quantity = scan.nextInt();

			if(quantity<=p.getQuantity()) {

				//1. Calculating current product cost
				int productCost = quantity*p.getCost();

				//2. Update new quantity
				p.setQuantity(p.getQuantity()-quantity);

				//3. Adding current Product cost to the total bill
				totalBill = totalBill+productCost;

				System.out.println("Purchased "+quantity+" "+p.getName());
				System.out.println("Current Product Cost is Rs."+productCost);
				System.out.println("Total Bill as of now: Rs."+totalBill);
			}
			else {
				System.out.println("Insufficient Quantity!!!");
				System.out.println("Available Quantity is "+p.getQuantity());
			}
		}
		else {
			System.out.println("Invalid Choice, Kindly Enter Valid Choice");
		}
	}

	void checkOut() {
		System.out.println("Thank you for Shopping!!!");
		System.out.println("Your Total Bill is: "+totalBill);
	}
}

//google classroom : egn54v3
