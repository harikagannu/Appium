
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


public class Gestures  extends Base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		//Tap actions
		TouchAction t=new TouchAction(driver);
		Thread.sleep(2000);
		WebElement expandList=driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		t.tap(tapOptions().withElement(element(expandList))).perform();
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
	    WebElement pn=	driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		
		t.longPress(longPressOptions().withElement(element(pn))).release().perform();
		Thread.sleep(2000);
		System.out.println(driver.findElementById("android:id/title").isDisplayed());
	}

}
