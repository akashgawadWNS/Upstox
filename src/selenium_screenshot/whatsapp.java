package selenium_screenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class whatsapp {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shankar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.whatsapp.com/");
	//how to take scrrenshot
	TakesScreenshot ts=(TakesScreenshot)driver;
	//use get screenshot method and use src
	File src=ts.getScreenshotAs(OutputType.FILE);
	//create folder where we store the screenshot and give the path of this folder
	File dest=new File("C:\\Users\\Shankar\\Desktop\\screenshot demo\\whatsapp.png");
	//copy screenshot src to dest
	Files.copy(src, dest);
	
}
}
