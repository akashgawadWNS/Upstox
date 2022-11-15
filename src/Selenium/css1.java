package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css1 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Shankar\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	//enter username
	driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
	//enter password
	driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
}
}
