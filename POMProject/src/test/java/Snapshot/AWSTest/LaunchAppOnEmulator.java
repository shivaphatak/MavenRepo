package Snapshot.AWSTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LaunchAppOnEmulator {

	public static void main(String[] args) throws IOException {
		LaunchAppOnEmulator LE=new LaunchAppOnEmulator();
		try {
			LE.appiumStart();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Android Emulator");
		capabilities.setCapability("browserName", "Android");
		capabilities.setCapability("platformVersion", "4.3");
		capabilities.setCapability("platformName", "Android");

		//capabilities.setCapability("appPackage", "com.android.camera");
		//capabilities.setCapability("appActivity", "com.android.camera.Camera");
		capabilities.setCapability("appPackage",
				"in.amazon.mShop.android.shopping");
		capabilities.setCapability("appActivity",
				"com.amazon.mShop.home.HomeActivity");

		AndroidDriver driver = new AndroidDriver(new URL(
				"http://127.0.0.1:4723/wd/hub"), capabilities);
		System.out.println("Application Opened");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("in.amazon.mShop.android.shopping:id/action_bar_burger_icon")).click();
		
		// Runtime.getRuntime().exec("adb shell input keyevent 115");
	}

	
	public void appiumStart() throws ExecuteException, IOException, InterruptedException
	{
		String nodePath = "C:/Users/shivalikap/Desktop/node.exe";
		String appiumJSPath = "C:/Program Files (x86)/Appium/node_modules/appium/bin/appium.js";
		/*CommandLine command = new CommandLine("cmd");
		command.addArgument("/c"); 
		//command.addArgument(nodePath); 
		command.addArgument(appiumJSPath);
		
		command.addArgument("--address"); 
		command.addArgument("127.0.0.1");
		
		command.addArgument("--port"); 
		command.addArgument("4723"); 
		command.addArgument("--no-reset"); 
		command.addArgument("--log");
		
		command.addArgument("D://appiumLogs.txt");
		
		DefaultExecuteResultHandler resultHandler = new DefaultExecuteResultHandler(); 
		DefaultExecutor executor = new DefaultExecutor(); 
		executor.setExitValue(1); 
		executor.execute(command, resultHandler);
		Thread.sleep(15000);*/
		
		AppiumDriverLocalService service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().
                usingPort(2856).usingDriverExecutable(new File(nodePath)).
                withAppiumJS(new File(appiumJSPath)));
        service.start();
        Thread.sleep(25000);
        String service_url = service.getUrl().toString();
	}
}
