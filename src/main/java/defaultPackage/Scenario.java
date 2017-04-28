package defaultPackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Scenario {
	@Test
	public void test() throws MalformedURLException{
		try{
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability("deviceName", "5203ea5bee4f83b3");
			dc.setCapability("browserName", "Chrome");
			//dc.setCapability("platformVersion", "7.0");
			dc.setCapability("PlatformName", "ANDROID");
			//dc.setCapability("appPackage", "com.android.chrome");
			//dc.setCapability("appActivity", "org.chromium.chrome.browser.ChromeTabbedActivity");
			
			AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
//			WebDriverWait wait=new WebDriverWait(driver,30);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("http://gwdev.aaacarolinasinsurancesolutions.com/quote-portal/html/");
		}
		catch(Exception e){
			e.printStackTrace();

		}
	}

}
