package seleniumMethodByPw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalIsDisplayMethod {

	public static void main(String[] args) throws InterruptedException {
		
		// this method is used to check display status of the element
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// findElement is WebElement type return
		
		//WebElement logo = driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
	    //boolean status = logo.isDisplayed();
		//System.out.println(status);
		
		           //OR
		//System.out.println("Display status of logo :"+logo.isDisplayed() );
		
		               //OR
		boolean status1 = driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]")).isDisplayed();
		System.out.println("is display  :" +status1);
		
		
		boolean status2 = driver.findElement(By.xpath("//span[@class=\"cart-label\"]")).isDisplayed();
		System.out.println("shopping cart is displayed  ;" +status2);
		
		boolean status3 = driver.findElement(By.xpath("//button[@name=\"register-button\"]")).isDisplayed();
		System.out.println(status3);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		boolean simpleAlrtBtn = driver.findElement(By.xpath("//button[@id='alertBtn']")).isDisplayed();
		System.out.println("is simple alert button displayed  :"+simpleAlrtBtn );
		
		
          driver.close();
	}

}
