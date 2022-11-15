package Selineum_parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class String_data_fetching {
public static void main(String[] args) throws Throwable {
	//create object of file input stream class
	FileInputStream fis=new FileInputStream("C:\\Program Files\\Google\\Drive");
	//use create method to open excel sheet
	String value = WorkbookFactory.create(fis).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(value);
}
}
