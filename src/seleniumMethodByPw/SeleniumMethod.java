package seleniumMethodByPw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethod {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/documentation/webdriver/bidi/cdp/network/");
    System.out.println(driver.getTitle());
	}

}
