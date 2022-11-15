package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
@Test(priority =2)
public void Tc1() {
Reporter.log("running tc1",true);
}
@Test(priority=3)
public void Tc2() {
	Reporter.log("runnig tc2",true);
}
@Test(priority =1)
public void Tc3() {
	Reporter.log("running tc3",true);

}
}
