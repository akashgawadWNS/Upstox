package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Emailable {
	
		@Test
		public void Tc1() {
		Reporter.log("running tc1",true);
		}
		@Test
		public void Tc2() {
			Reporter.log("runnig tc2",true);
		}
		@Test
		public void Tc3() {
			Reporter.log("running tc3",true);
Assert.fail();//it is used to fail test case intentionally
		}
}
