package genricUtility;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class ListenerUtility extends BaseClass implements ITestListener{
	@Override
	public void onTestFailure(ITestResult result) {
		
		String methodName=result.getName();
		test.log(Status.FAIL,methodName+" is failed");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/"+methodName+jLib.getSystemTime()+".png");
		
	}

}
