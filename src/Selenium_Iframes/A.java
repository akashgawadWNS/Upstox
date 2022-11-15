package Selenium_Iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shankar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		//maximize the browser
		driver.manage().window().maximize();
		//switch to first frame
		driver.switchTo().frame("packageListFrame");
		//take any element on first frame and print it
		String text1=driver.findElement(By.xpath("//a[text()='org.openqa.selenium.chrome']")).getText();
		System.out.println(text1);
		//now we need to switch from 1st frame to main webpage
		driver.switchTo().defaultContent();//now again we came on main webpage
		
		//switch to second frame
		Thread.sleep(4000);
		driver.switchTo().frame("packageFrame");
		//take any element on second page and print it
		String text2=driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).getText();
		Thread.sleep(4000);
		System.out.println(text2);
		
		//switch to third frame
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		//take ant element and print it
		String text3=driver.findElement(By.xpath("//th[text()='Interface']")).getText();
		System.out.println(text3);
		
	
		
	}
}
