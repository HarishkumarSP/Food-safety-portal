package controller;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		System.out.println("Choose your choice");
		System.out.println("1. User");
		System.out.println("2. Admin");
		int choice;
		Scanner sc = new Scanner(System.in);
		boolean options = false;
		do {
		choice = sc.nextInt(); 
		switch(choice) {
		case 1:
			User user = new User();
			user.userPortal();
			break;
		case 2:
			Admin admin = new Admin();
			admin.adminPortal();
			break;
		default:
			System.out.println("Enter your correct option");
			options=true;
			break;
		}
		}while(options);
		
	}

}

