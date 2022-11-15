package selenium_screenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class screenshot_of_particular_element {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shankar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.whatsapp.com/");
		//find particular element and store refrence variable
		WebElement particular=driver.findElement(By.xpath("//img[@alt=\"WhatsApp Main Page\"]"));
		File src= particular.getScreenshotAs(OutputType.FILE);
		 File dest=new File("C:\\\\Users\\\\Shankar\\\\Desktop\\\\screenshot demo\\logo.jpg");
		 Files.copy(src, dest);

}
}