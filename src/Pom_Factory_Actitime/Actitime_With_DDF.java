package Pom_Factory_Actitime;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_With_DDF {
	public static void main(String[] args) {
		//set the properties
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\Shankar\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//Enter UN 
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		//Enter Password
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		//click on login btn
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//verify the text present on home page
		String expText="Enter Time-Track";
		String actText=driver.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
		if(actText.equals(expText)) {
			System.out.println("TC is pass");
		}
		else {
			System.out.println("Tc Is fail");
		}
	}

}
