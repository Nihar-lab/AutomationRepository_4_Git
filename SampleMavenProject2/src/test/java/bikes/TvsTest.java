package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TvsTest {
	@Test
	public void page() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tvsmotor.com/");
		Reporter.log("Tvs page Executed",true);
	}

}


