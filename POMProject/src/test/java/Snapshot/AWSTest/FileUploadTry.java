package Snapshot.AWSTest;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FileUploadTry {

	@Test
	public void fileUpload() throws InterruptedException, IOException
	{
		//Using Send Keys
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://imgup.net/");
		Thread.sleep(5000);
		driver.findElement(By.id("image_image")).sendKeys("C:\\Users\\shivalikap\\Desktop\\Tulips.jpg");
		
	/*	driver.get("http://postimage.org/");
		driver.findElement(By.id("uploadifive-file_upload")).click();
		Runtime.getRuntime().exec("F:\\Scripts\\AutoIT_Scripts\\MyFirst.exe");
		Thread.sleep(2000);
		*/
		/*driver.findElement(By.id("login-email")).sendKeys("Shiva123");
		driver.findElement(By.id("login-password")).sendKeys("Password@1");
		driver.findElement(By.xpath("//div[@class='form-group']/button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@class='dropdown']/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//i[@class='ti-user m-r-5']/..")).click();
		Thread.sleep(4000);*/
	}

	
}
