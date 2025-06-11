package seleniumMethodByPw;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	// explicit wait declaration
	WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	
	//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("lalit");
	//if we use this method then we dont need to find element by findelement method so we can ignore the above find element method
	WebElement textUsername = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
	textUsername.sendKeys("Admin");
	
	WebElement passWord = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"password\"]")));
	passWord.sendKeys("admin123");
	
    WebElement login = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type=\"submit\"]")));
     login.click();
	
	//this method is mainly used where synchronization problrm occure this method is element based 
	
	}

}
