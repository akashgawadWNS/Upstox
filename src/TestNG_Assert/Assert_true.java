package TestNG_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_true {
	@Test
	public void Tc4() {
		Reporter.log("Tc4 is running",true);
		boolean actR=false;
		Assert.assertTrue(actR);//tc is pass

}
}