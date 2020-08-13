import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;


public class SwippingDemo extends Base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver=Capabilities();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		//driver.findElementByXPath("(//android.widget.TextView)[2]").click();
		//driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']").click();
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
	    driver.findElementByXPath("//*[@content-desc='9']").click();
	    TouchAction t=new TouchAction(driver);
	    Thread.sleep(2000);
	//long press //on element// 2 sec// move to another element and you release
	    WebElement first=driver.findElementByXPath("//*[@content-desc='15']");
	    WebElement second=driver.findElementByXPath("//*[@content-desc='45']");
	    t.longPress(longPressOptions().withElement(element(first))).moveTo(element(second)).release().perform();
	
		

	}

}
