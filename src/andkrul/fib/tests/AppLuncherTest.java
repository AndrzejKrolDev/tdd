package andkrul.fib.tests;

import org.junit.Assert;
import org.junit.Test;

import andkrul.fib.app.AppLuncher;

public class AppLuncherTest {

	@Test
	public  void checkGreatnessTest() {
		Assert.assertEquals(50,AppLuncher.checkGreatness(50, 30));
		Assert.assertEquals(90,AppLuncher.checkGreatness(60, 90));
		Assert.assertEquals(100,AppLuncher.checkGreatness(50, 100));
		Assert.assertEquals(100,AppLuncher.checkGreatness(70, 100));
		
	}
	@Test
	public  void multiplyDigitsOfNumberTest() {
		Assert.assertEquals(6,AppLuncher.multiplyDigitsOfNumber(0, 3, "12345"));
		Assert.assertEquals(10,AppLuncher.multiplyDigitsOfNumber(2, 3, "12251"));
		Assert.assertEquals(120,AppLuncher.multiplyDigitsOfNumber(0, 5, "12345"));
		Assert.assertEquals(125,AppLuncher.multiplyDigitsOfNumber(5, 3, "555555555555"));
		
	}
	@Test
	public  void largestProductOfAdjacentDigitsTest() {
		Assert.assertEquals(60,AppLuncher.largestProductOfAdjacentDigits(3, "12345"));
		Assert.assertEquals(120,AppLuncher.largestProductOfAdjacentDigits(5, "12345"));
		Assert.assertEquals(1,AppLuncher.largestProductOfAdjacentDigits(8, "11111111111"));
		Assert.assertEquals(8,AppLuncher.largestProductOfAdjacentDigits(3, "222222222222"));
	}
	


	
	
}
