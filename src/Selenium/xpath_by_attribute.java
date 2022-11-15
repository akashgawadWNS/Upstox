package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_attribute {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shankar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	//enter username use formula x path by attribute
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	//enter password use formula x path  by attribute
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	//click on login button use formula x path by text()
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
}
}
