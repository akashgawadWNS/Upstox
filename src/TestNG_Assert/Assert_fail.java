package TestNG_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_fail {
	@Test
	public void Tc1() {
		Reporter.log("running tc1");
	}
	@Test
	public void Tc2() {
		Reporter.log("running tc1");
		Assert.fail();
	}

}
