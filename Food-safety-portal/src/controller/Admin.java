package controller;

import java.io.IOException;
import java.util.Scanner;

import model.Food;
import service.FoodCalc;


public class Admin extends Login {
	public boolean adminPortal() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("=========================================================");
		System.out.println("===============Food safety portal========================");
		System.out.println("===============Welcome Admin!========================");
		System.out.println("Enter username");
		String name = sc.nextLine();
		System.out.println("Enter Password");
		String password = sc.nextLine();
		String s = name;
		String p = password;
		admin(s,p);
		boolean ch = true;
		while (ch) {
			System.out.println("--------------Select your option------------------");
			System.out.println(
					"1. Add Food\n2. View the list of added foods\n3. View Food with manufactured date\n4. View Food with expiry date\n5.Generate Excel File\n6.Exit");
			int option = sc.nextInt();
			switch (option) {
			case 1: 
				FoodCalc fc =new FoodCalc();
				fc.addfood();
				break;
				
			case 2:
				FoodCalc fc1 = new FoodCalc();
				fc1.display();
				break;
			
			case 3: 
				FoodCalc fc2 = new FoodCalc();
				fc2.displayman();
				break;
			
			case 4: 
				FoodCalc fc3 = new FoodCalc();
				fc3.displayExpairy();
				break;
			
			case 5:
				FoodCalc fc4 = new FoodCalc();
				fc4.generateexcellsheet();
				break;
			
			case 6: 
				ch = false;
				break;
			
			}
		}
		return ch;
	}
}
