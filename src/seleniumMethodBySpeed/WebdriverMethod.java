package seleniumMethodBySpeed;

import java.awt.Color;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethod {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		
		WebElement logobtn =	driver.findElement(By.id("nav-logo-sprites"));
		
		String btncolour = logobtn.getCssValue("color");
		
		System.out.println("colour of btn " +btncolour);
		
	
		
		
	}

}
