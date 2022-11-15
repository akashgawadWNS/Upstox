package Selineum_parameterization;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_numeric_data {
	public static void main(String[] args) throws Throwable {
		//create object of file input stream class
		FileInputStream fis=new FileInputStream("C:\\Program Files\\Google\\Drive");
		//use create method to open excel sheet
		double value = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
		System.out.println(value);

}
}