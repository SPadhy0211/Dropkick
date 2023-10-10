package GenericUtils;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class ListenerImpleClass implements ITestListener {

	public void onTestFailure(ITestResult result) {
		String failedMethod = result.getMethod().getMethodName();
		TakesScreenshot ts = (TakesScreenshot)BaseClassDropkick.sdriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/"+failedMethod+".png");
		try
		{
			Files.copy(src, dest);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
     
}
