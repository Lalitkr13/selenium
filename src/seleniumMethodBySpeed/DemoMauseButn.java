package seleniumMethodBySpeed;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoMauseButn {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://speedwaytech.co.in/testing-02/buttons/");
		driver.manage().window().maximize();
		// simple click
		driver.findElement(By.id("pD03d")).click();
	     Thread.sleep(2000);
	     
	     Actions act = new Actions(driver); 
	     
	     // right click
	    WebElement rightClk =  driver.findElement(By.id("rightClickBtn"));
		act.contextClick(rightClk).perform(); // contextclick is nothing but right click
		Thread.sleep(2000);
		
		// double click
		WebElement doublClk = driver.findElement(By.id("doubleClickBtn"));
		act.doubleClick(doublClk).perform();
		Thread.sleep(2000);
		
		driver.close();
		
		
		

	}

}
