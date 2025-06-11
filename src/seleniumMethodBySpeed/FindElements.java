package seleniumMethodBySpeed;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://magento.softwaretestingboard.com/");
		
		List<WebElement> Ele = driver.findElements(By.xpath("//div[@class='footer content']//a"));
		
		System.out.println(Ele.size());
		 
		for(WebElement e1 :Ele ) {
			System.out.println(e1.getText());
			}
		List<WebElement>Ele2=driver.findElements(By.linkText("Subscribe"));
		System.out.println(Ele2.size());
		
		
		List<WebElement>Ele3=driver.findElements(By.linkText("Search Term"));
		System.out.println("The size of element : "+Ele3.size());
	
		
		
		
		 driver.close();
	}

}
