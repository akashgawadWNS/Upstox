package Selenium_Dynamic_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Worldometer {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shankar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/country/uk");
		//print death cases
		String death= driver.findElement(By.xpath("(//div[@class='maincounter-number'])[2]")).getText();
		System.out.println(death);
		//print recover cases
		String recoverd=driver.findElement(By.xpath("(//div[@class='maincounter-number'])[3]")).getText();
		System.out.println(recoverd);
	}
}
