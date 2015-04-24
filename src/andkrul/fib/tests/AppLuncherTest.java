package andkrul.fib.tests;

import org.junit.Assert;
import org.junit.Test;

import andkrul.fib.app.AppLuncher;

public class AppLuncherTest {

	@Test
	public  void checkGreatnessTest() {
		Assert.assertEquals(50,AppLuncher.checkGreatness(50, 30));
	}

	
	
}
