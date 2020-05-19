package service;

import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import model.Food;

public class ExcelGenerator {
	FileOutputStream out;
	
	public HSSFWorkbook excelGenerate(Food foodItems, ArrayList<Food> foodList)  {
		// TODO Auto-generated method stub
		try{
			String filename = "D:\\food.xls";
			HSSFWorkbook workbook=new HSSFWorkbook();
			HSSFSheet sheet =workbook.createSheet("Food safety portal"); 
			HSSFRow rowhead=sheet.createRow(0);
			rowhead.createCell(0).setCellValue("FoodName");
			rowhead.createCell(1).setCellValue("Manufacture Date");
			rowhead.createCell(2).setCellValue("Expire Date");
			rowhead.createCell(3).setCellValue("Validity period");
			
			int i=0;
			for(Food foodItems1:foodList){
				int j=i+1;
				HSSFRow row=sheet.createRow(j);
				row.createCell(0).setCellValue(foodItems1.getFoodName());
				row.createCell(1).setCellValue(foodItems1.getManDate());
				row.createCell(2).setCellValue(foodItems1.getExpDate());
				row.createCell(3).setCellValue(foodItems1.getPeriod());
				i++;
			}
			out=new FileOutputStream(filename);
			workbook.write(out);
			out.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
	}
}