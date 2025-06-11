package seleniumMethodByPw;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitMethodsImplicit {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// only one time then no need to write again
		//use this just after the driver object is create
		//it will not wait till maximum time if the element is available of action is perform befor 10 sec
		// it aaplicable for all elemnts whenever we call driver it applicate
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
         // here we can use thred.sleep also
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("lalit");// without using wait method we get exception of nosuchelement
		
	}

}
