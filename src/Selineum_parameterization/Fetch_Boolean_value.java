package Selineum_parameterization;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Boolean_value {
	public static void main(String[] args) throws Throwable {
		//create object of file input stream class
		FileInputStream fis=new FileInputStream("C:\\Program Files\\Google\\Drive");
		//use create method to open excel sheet
		boolean value = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(1).getCell(0).getBooleanCellValue();
		System.out.println(value);

}
}