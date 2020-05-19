package controller;

import java.util.Scanner;

import service.FoodCalc;


public class User {
	public void userPortal() {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n 1.Display the food items\n 2.Your food with the validity period");
		System.out.println("Select your option");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.println("The available foods in our portal are!!!");
			FoodCalc fc = new FoodCalc();
			fc.display();
			userPortal();
			break;
		case 2:
			FoodCalc fc1 = new FoodCalc();
			fc1.displayperiod();
		}
	}

}
