import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;


public class Base {
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException{
	
	DesiredCapabilities cap= new DesiredCapabilities();
	
	cap.setCapability(MobileCapabilityType.DEVICE_NAME,"HarikaEmulator");
	cap.setCapability(MobileCapabilityType.APP,"C:\\Users\\harika\\AppiumAPK\\ApiDemos.apk");
	URL url=new URL("http://127.0.0.1:4723/wd/hub");
	AndroidDriver<AndroidElement>  driver=new AndroidDriver<>(url,cap);
	return driver;
	}
	

}
