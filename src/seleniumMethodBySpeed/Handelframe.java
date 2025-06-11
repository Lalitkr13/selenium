package seleniumMethodBySpeed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handelframe {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://speedwaytech.co.in/testing-02/Frames/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	// first we switch to parent frame by using diffrent types of method
	driver.switchTo().frame("frame1");// here we go first on parent frame
	// now locate element inside this frame
	 driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("welcome");
	 Thread.sleep(3000);
	 //switch to parent frame
	 //driver.switchTo().defaultContent();
	 //now from parent frame to its child frame
	 driver.switchTo().frame("frame3");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
	 Thread.sleep(3000);
	 // again switch to parent frame from child
	 driver.switchTo().defaultContent();
	 //switch to another frame
	 driver.switchTo().frame("frame2");
	 // now find element inside this frame
	WebElement dropdown =  driver.findElement(By.id("animals"));
	Thread.sleep(2000);
	 Select s1= new Select(dropdown);
	 s1.selectByIndex(0);
	 Thread.sleep(2000);
	 s1.selectByValue("avatar");
	 Thread.sleep(2000);
	 driver.close();
	 

	}
	
	 
	}


