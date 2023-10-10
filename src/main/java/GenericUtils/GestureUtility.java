package GenericUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class GestureUtility {
	AndroidDriver driver;
	public GestureUtility(AndroidDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickGesture(WebElement element)
	{
		((JavascriptExecutor)driver).executeScript("mobile: clickGesture", ImmutableMap.of("elementId", ((RemoteWebElement)element).getId()));
	}
	
	public void longClickGesture(WebElement element)
	{
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of("elementId", ((RemoteWebElement)element).getId(),
				"duration", 2000 ));
	}
	
	public void scrollGesture(String value)
	{
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+value+"\"));"));
	}
	
	public void swipeGesture(int left, int top, int wid, int height, String dir)
	{
		((JavascriptExecutor)driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"left", left, "top", top, "width", wid, "height", height,
				"direction", dir
				));
	}
	
	public void pinchOpen(WebElement element)
	{
		((JavascriptExecutor)driver).executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement)element).getId(),
				"percent", 0.75 ));
	}
	
	public void pinchClose(WebElement element, int percent)
	{
		((JavascriptExecutor)driver).executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement)element).getId(),
				"percent", percent ));
	}
	
	public void dragAndDrop(WebElement element, int endX, int endY)
	{
		((JavascriptExecutor)driver).executeScript("mobile: dragAndDropGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement)element).getId(),
				"endX", endX,
				"endY", endY ));
	}

}
