package service;

import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import model.Food;

public class FoodCalc {
	private String newExpDate;
	Scanner sc=new Scanner(System.in);
	static ArrayList<Food> foodItems = new ArrayList<Food>(){ {
		add(new Food("Milk","02/03/2020","12/03/2020","The food will be valid for 10 Days"));
		add(new Food("Bread","02/03/2020","22/05/2020","The food will be valid for 20 Days"));
		add(new Food("Butter","02/03/2020","17/03/2020","The food will be valid for 15 Days"));
	}
	};
	public void addfood() {
		
		System.out.println("Enter food name");
		String foodName = sc.nextLine();
		System.out.println("Enter it's manufactured date");
		String manDate = sc.nextLine();
		System.out.println("Enter it's expiry date");
		String expDate = sc.nextLine();
		System.out.println("Enter the period of the food");
		String period = sc.nextLine();
		Food book = new Food(foodName, manDate, expDate,period);
		
		foodItems.add(book);
	}
	public void display() {
		for (Food str : foodItems) {
			System.out.println("foodName=" + str.getFoodName() + "\tManuFactureDate=" + str.getManDate()+" \t expiryDate=" + str.getExpDate()+"");
		}
	}
	public void displayExpairy() {
		for (Food str : foodItems) {
			System.out.println("foodName=" + str.getFoodName() + "\t expiryDate=" + str.getExpDate()+" ");
		}
		
	}
	public void displayman() {
		for (Food str : foodItems) {
			System.out.println("foodName=" + str.getFoodName() + "\tManuFactureDate=" + str.getManDate()+" ");
		}
		
	}
	public void displayperiod() {
		System.out.println("enter the food name to know validity period");

		String check=sc.nextLine();
		switch(check) {
		case "Milk":
			System.out.println("The food will be valid for 10 Days");
			break;
		case "Bread":
			System.out.println("The food will be valid for 20 Days");
			break;
		case "Butter":
			System.out.println("The food will be valid for 15 Days");
			break;
		}
			
		
}
	Food fooditems;
	public void generateexcellsheet() throws IOException {
		ExcelGenerator excel = new ExcelGenerator();
		System.out.println();
		HSSFWorkbook hwb = excel.excelGenerate(fooditems, foodItems);
	}
	public static HashMap<String, String> manFoodDetail = new HashMap<String, String>();
	public static HashMap<String, String> expFoodDetail = new HashMap<String, String>();
	
}
