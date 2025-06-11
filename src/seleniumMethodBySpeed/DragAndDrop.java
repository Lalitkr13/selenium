package seleniumMethodBySpeed;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://speedwaytech.co.in/testing-02/Drag-n-Drop/");
	
	WebElement from = driver.findElement(By.id("box5"));
	WebElement to = driver.findElement(By.id("box105"));
	
	Actions act = new Actions(driver);
	
	act.dragAndDrop(from, to).perform();
	Thread.sleep(2000);
	
	WebElement from1 = driver.findElement(By.id("box6"));
	WebElement to1 = driver.findElement(By.id("box104"));
    act.dragAndDrop(from1, to1).perform();
    Thread.sleep(2000);
    
    driver.close();
	}

}
