package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_group_index {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shankar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
//enter username
	driver.findElement(By.xpath("(//input)[3]")).sendKeys("admin");
	//enter password
	driver.findElement(By.xpath("(//input)[4]")).sendKeys("manager");
}
}
