package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KtmTest {
	@Test
	public void page() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ktm.com/en-in.html");
		Reporter.log("ktm page Executed",true);
	}

}
