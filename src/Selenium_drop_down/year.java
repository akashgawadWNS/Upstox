package Selenium_drop_down;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class year {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shankar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(4000);
	//click on create new account button
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	Thread.sleep(4000);
	
	//select the year
	WebElement year =driver.findElement(By.xpath("//select[@id='year']"));
	//create object of select class
	Select s=new Select(year);
	
	//select by text
	//s.selectByVisibleText("1996");
	
	//select by value
	//s.selectByValue("1995");
	
	//select by index
	s.selectByIndex(26);
	
	
}
}
