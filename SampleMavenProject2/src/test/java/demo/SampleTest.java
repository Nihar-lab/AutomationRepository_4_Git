package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void launch() {
		Reporter.log("SampleTest Class Executed",true);
	}
}