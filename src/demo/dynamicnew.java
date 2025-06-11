package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicnew {

	public static void main(String[] args) {
		// browser open
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/viewcart?exploreMode=true&preference=FLIPKART");
		driver.findElement(By.xpath("(//div[text()='Remove'])[2]"));
		//a[text()='CAMPUS CAMP BONZAI Running Shoes For Men']/../../../..//a[text()='CAMPUS CAMP BONZAI Running Shoes For Men']
		
		

	}

}
