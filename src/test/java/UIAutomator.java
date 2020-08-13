import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


public class UIAutomator extends Base {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    // driver.findElementByAndroidUIAutomator("attribute("value")")
	     
	     driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	     
	   //  Validate clickable feature for all options
	     // syntax driver.findElementsByAndroidUIAutomator("new UiSelector().property(value)");  
	      System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
		
		

	}

}
