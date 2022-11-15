package Selineum_parameterization;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Num_As_String {
	public static void main(String[] args) throws Throwable {
		//create object of file input stream class
		FileInputStream fis=new FileInputStream("C:\\Program Files\\Google\\Drive");
		//use create method to open excel sheet
		String value=WorkbookFactory.create(fis).getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		System.out.println(value);

}
}