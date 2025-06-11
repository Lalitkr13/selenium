package seleniumMethodByPw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
  // close() -- close single browser
		//quit()-- close multiple browser
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	driver.findElement(By.xpath("(//a[@target=\"_blank\"])[5]")).click();
	  Thread.sleep(5000);
		
      driver.close();// it closes the first window tab not the second one
       // driver.quit();// close all the brwoser window
      //https://testautomationpractice.blogspot.com/
       
       
       
	}

}
