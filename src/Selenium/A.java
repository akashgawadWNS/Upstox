package Selenium;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shankar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com");
	
	//maximize
	driver.manage().window().maximize();
	
	//minimize
	Thread.sleep(3000);
	driver.manage().window().minimize();
	Thread.sleep(2000);
	//setsize
	Dimension d=new Dimension(100,200);
	driver.manage().window().setSize(d);
    Thread.sleep(1000);
	//setposition
	Point p=new Point (300,400);
	driver.manage().window().setPosition(p);
	Thread.sleep(2000);
	//pagesource
	String allelements=driver.getPageSource();
	System.out.println(allelements);
	
	String title=driver.getTitle();
	System.out.println(title);
}
}
