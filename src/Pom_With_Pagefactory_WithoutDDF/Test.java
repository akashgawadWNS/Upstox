package Pom_With_Pagefactory_WithoutDDF;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\Shankar\\\\\\\\\\\\\\\\Downloads\\\\\\\\\\\\\\\\chromedriver_win32\\\\\\\\\\\\\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/login.do");
	//object 1st 
	LoginPage l=new LoginPage(driver);
	l.enterUN();
	l.enterPWD();
	l.clickLoginBtn();
	//object 2nd
	HomePage h=new HomePage(driver);
	h.verifytext();
	
}
	

}
