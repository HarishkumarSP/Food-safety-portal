package model;

import java.util.HashMap;

public class Food {
	
	private  String foodName;
	private  String manDate;
	private  String expDate;
	private String period;

	public Food(String foodName, String manDate, String expDate, String period) {
		super();
		this.foodName = foodName;
		this.manDate = manDate;
		this.expDate = expDate;
		this.period = period;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodname) {
		this.foodName = foodname;
	}

	public String getManDate() {
		return manDate;
	}

	public void setManDate(String manDate) {
		this.manDate = manDate;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
}
