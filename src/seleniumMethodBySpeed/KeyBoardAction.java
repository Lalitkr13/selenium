package seleniumMethodBySpeed;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/key_presses");
		driver.manage().window().maximize();
		// Actions------> class
		// Action ------> interface
		//.Perform()----> execute the compiled action
		//.build()----> compiles the action in to single step
		Actions act = new Actions(driver);
		// for send key we have to first find xpath
		//act.sendKeys("lalit");
		//Thread.sleep(2000);
		act.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.NUMPAD4).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.NUMPAD5).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ZENKAKU_HANKAKU).perform();
		Thread.sleep(2000);
		
		

	}

}
