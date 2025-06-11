package seleniumMethodBySpeed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NvigateMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://online.actitime.com/lsahu/timetrack/enter.do");
		Thread.sleep(2000);
		driver.navigate().to("https://the-internet.herokuapp.com/tables");
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.close();

	}

}
