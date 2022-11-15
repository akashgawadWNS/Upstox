package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
@Test(enabled =false)//intentionally we have ignored tc1
public void Tc1() {
	Reporter.log("runnig tc2",true);
}
}
