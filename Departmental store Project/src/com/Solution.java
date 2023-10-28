package com;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		System.out.println("Welcome to XYZ Departmental Store");
		System.out.println("------------------------------------");
		
		Scanner scan = new Scanner(System.in);
		DepartmentalStore store = new DepartmentalStore();
		
		store.addProduct();	//1. adding Products into DB
		
		int choice = 1;
		while(choice==1) {
			store.displayProduct();	//2. Displaying Products from DB
			store.buyProduct();	//3. Buying Products
			System.out.println("Enter 1 to continue or any other number to checkout");
			choice = scan.nextInt();
			System.out.println("------------------------------------------");
		}
		store.checkOut();	//4. checking out from Store 
	}
}