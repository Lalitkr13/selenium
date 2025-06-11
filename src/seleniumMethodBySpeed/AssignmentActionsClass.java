package seleniumMethodBySpeed;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentActionsClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		
		WebElement text1 = driver.findElement(By.xpath("(//div[@style=\"position: relative; top: 0px;\"])[1]"));
		
		WebElement text2 = driver.findElement(By.xpath("(//div[@style=\"position: relative; top: 0px;\"])[2]"));
		
		Actions act = new Actions(driver);
		
		text1.click();
		Thread.sleep(2000);
        act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
        
        text2.click();
        act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
      
      //  act.sendKeys(Keys.BACK_SPACE).perform();
        act.sendKeys(Keys.DELETE).perform();
        act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
        Thread.sleep(3000);
        
       String s1 = text1.getText();
      // System.out.println(s1);
       
       String s2 = text2.getText();
       
       if(s1.equals(s2)) {
    	   System.out.println("test case pass");
       }else {
    	   System.out.println("test case fail");
       }
        driver.close();
        
	}

}
