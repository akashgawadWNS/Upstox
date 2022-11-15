package TestNG_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_Not_equals {
	@Test
	public void Tc2() {
		Reporter.log("Tc2 is running",true);
		String expR="Rinky";
		String actR="Rinky";
		Assert.assertNotEquals(expR,actR);

}
}