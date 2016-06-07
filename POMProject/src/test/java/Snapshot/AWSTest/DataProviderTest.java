package Snapshot.AWSTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class DataProviderTest {

	WebDriver driver;

	/*
	 * @DataProvider(name = "Data") public static Object[][] credentials() {
	 * return new Object[][] { { "shivalika", "shiva123" }, { "shivalika1",
	 * "shiva456" } }; }
	 * 
	 * @Test(dataProvider = "Data") public void test(String sUsername, String
	 * sPassword) {
	 * 
	 * driver = new FirefoxDriver();
	 * 
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * 
	 * driver.get("http://www.gmail.com");
	 * 
	 * driver.quit();
	 * 
	 * }
	 */

	@Test
	public void test() throws InterruptedException {

		HtmlUnitDriver driver = new HtmlUnitDriver(true);

		//driver.setJavascriptEnabled(false);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//div[@id='_eEe']/a[2]")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

	}

}
