package seleniumMethodBySpeed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignFlipkrt {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(3000);
        
       driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
        Thread.sleep(3000);
       
        driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("9098061518");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']")).click();
       
        
        
		
		
		
		
	}

}
