package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Count {
@Test(invocationCount=10)
public void tc1() {
	Reporter.log("runnig tc1",true);
}
}
