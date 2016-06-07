package Snapshot.AWSTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LaunchAppOnRealDevice {

	

	@Test
	public void testMethod() throws MalformedURLException,
			InterruptedException {

		/*
		 * File classpathRoot = new File(System.getProperty("user.dir")); File
		 * appDir = new File(classpathRoot, "../../../data/app/Amazon")
		 */;
		// File app = new File("F:/Documents/apk",
		// "com.whatsapp_v2.12.525-451010_Android-2.1.apk");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "Micromax A300");
		capabilities.setCapability("platformVersion", "4.4.2");
		capabilities.setCapability("platformName", "Android");
		// capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage",
				"in.amazon.mShop.android.shopping");
		capabilities.setCapability("appActivity",
				"com.amazon.mShop.home.HomeActivity");
		AndroidDriver<MobileElement> driver;
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),
				capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.className("android.widget.Button")).click();
		driver.findElement(By.className("android.widget.EditText")).sendKeys(
				"shivalikaphatak14@gmail.com");
		WebElement password=driver.findElement(
				By.xpath("//android.view.View[@content-desc='Amazon password']/following-sibling::android.view.View/android.widget.EditText"));
		Thread.sleep(2000);
		/*driver.findElement(By.name("Submit")).click();
		Thread.sleep(10000);*/
		driver.quit();

	}

}
