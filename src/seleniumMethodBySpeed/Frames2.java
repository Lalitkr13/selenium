package seleniumMethodBySpeed;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames2 {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://speedwaytech.co.in/testing-02/Frames/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// we can identify by seeing a frame tag in the inspect option first we have to go to fram then we can find any elemet
		// first we switch to parent frame by using diffrent types of method
		driver.switchTo().frame("frame1");// here we go first on parent frame
		// now locate element inside this frame
		 driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("welcome");
		 Thread.sleep(3000);
		 //switch to parent frame
		// driver.switchTo().defaultContent();  here we are already at parent frame this is nested frame
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
		 s1.selectByIndex(1);
		 Thread.sleep(2000);
		 s1.selectByValue("avatar");
		 Thread.sleep(2000);
		 driver.close();
//		 
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://speedwaytech.co.in/testing-02/Select/");
//
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//
//		driver.findElement(By.linkText("Frames")).click();
//		Thread.sleep(2000);
//
//		//Switch to iframe with name of frame
//		driver.switchTo().frame("iamframe");
//
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi This is Rohit");
//
//		//Switch to parent frame
//		//driver.switchTo().defaultContent();
//
//		driver.switchTo().frame("frame3");
//
//		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
//
//		//Switch to parent frame
//		driver.switchTo().defaultContent();
//
//		driver.switchTo().frame("frame2");
//
//		WebElement dropdown=driver.findElement(By.cssSelector(".col-lg-3"));
//
//		Select sl=new Select(dropdown);
//
//		sl.selectByValue("babycat");
//
//		Thread.sleep(3000);
//
//		driver.close();

	}

}
