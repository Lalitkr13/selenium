package seleniumMethodBySpeed;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction2 {

	public static void main(String[] args) throws InterruptedException {

  // How to copy and paste 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
	    WebElement firstname= driver.findElement(By.id("input-firstname"));
	    firstname.sendKeys("Lalit Kumar");
	    Thread.sleep(3000);
	    WebElement lastName = driver.findElement(By.id("input-lastname"));
	    
	    Actions act = new Actions(driver);
	    // we have to copy for that ctr+a and then ctr+c then ctr+v
	    //CTR+A
	    act.keyDown(Keys.CONTROL);
	    act.sendKeys("a");
	    act.keyUp(Keys.CONTROL);
	    act.perform();
	    Thread.sleep(2000);
	    
	    // CTR+C
	    act.keyDown(Keys.CONTROL);
	    act.sendKeys("c");
	    act.keyUp(Keys.CONTROL);
	    act.perform();
	    
	    //TAB
	    act.sendKeys(Keys.TAB).perform();
	    
	    // CTR+V
	    act.keyDown(Keys.CONTROL);
	    act.sendKeys("v");
	    act.keyUp(Keys.CONTROL);
	    act.perform();
	    Thread.sleep(3000);
	    
	    System.out.println(firstname.getAttribute("value"));
	    
	    if(firstname.getAttribute("value").equals(lastName.getAttribute("value"))) {
	    	System.out.println("first name and last name is same");
	    }else {
	    	System.out.println("test case fail");
	    }
	  driver.close();
	  
	    
	    
	    
	    
	    
		

	}

}
