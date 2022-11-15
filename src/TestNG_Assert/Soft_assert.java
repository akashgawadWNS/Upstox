package TestNG_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_assert {
	@Test
	public void Tc1() {
		Reporter.log("Tc1 is running",true);
		String expR="Hi";
		String actR="Bye";//object of Softassert 
		SoftAssert s=new SoftAssert();
		s.assertEquals(expR, actR);//verification 1
		System.out.println("I am after failed verification1");//verification2
		//mandatory
		s.assertAll();
	}
	@Test
	public void Tc2() {
		Reporter.log("Hii hello");

}
}