package seleniumMethodBySpeed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadAndUpload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/testing-02/upload-and-download/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// how to download 
		driver.findElement(By.id("downloadButton")).click();
		Thread.sleep(3000);
		// how to upload a file ---->  pass file path to the sendkeys
		WebElement upload = driver.findElement(By.id("uploadFile"));
		Thread.sleep(3000);
		upload.sendKeys("C:\\Users\\LALIT\\Downloads\\EE-122 (1).pdf");
		Thread.sleep(3000);
		driver.close();

	}

}
