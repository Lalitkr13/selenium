package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic {

	public static void main(String[] args) throws InterruptedException {
		// open browser
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@type,'email')]")).sendKeys("lalit");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[starts-with(text(),'Forgot')]")).click();
		
		Thread.sleep(2000);
		
		
		

	}

}
