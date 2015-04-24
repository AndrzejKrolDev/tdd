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
	}

	
	
}
