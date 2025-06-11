package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatoraxse {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers");
		
		driver.manage().window().maximize();
		
		// self - select the current node
		driver.findElement(By.xpath("//a[contains(text(),'Raghav Productivity')]/self::a"));
		
		// parent - select the parent of the current node (always )
		driver.findElement(By.xpath("//a[contains(text(),'Raghav Productivity')]/parent::td"));
		
		////ancestor- select select all ancestors(parents grant parents)
		driver.findElement(By.xpath("//a[contains(text(),'Raghav Productivity')]/ancestor::tr"));
		
		// child - select alll the child of the current node( one or many)
		driver.findElement(By.xpath("//a[contains(text(),'Raghav Productivity')]/ancestor::tr/child::td"));
		
		//descendant - select all childern grand childrens of current node (if we write td then only td tag name will capture if we write * then it will cover all the descendant)
		driver.findElement(By.xpath("//a[contains(text(),'Raghav Productivity')]/ancestor::tr/descendant::*"));
		
		// Following - Selects everything in the document after the closing tag of the current node
		driver.findElement(By.xpath("//a[contains(text(),'Raghav Productivity')]/ancestor::tr/following::tr"));
		
		// Following-sibling - select all siblings after the current node
		driver.findElement(By.xpath("//a[contains(text(),'Raghav Productivity')]/ancestor::tr/following-sibling::tr"));
		
		// preceding - selects all the nodes that appear before the current node in the document(here company include)
		driver.findElement(By.xpath("//a[contains(text(),'Raghav Productivity')]/ancestor::tr/preceding::tr"));
		
		// preceding siblings - select the sibling above(before) the current node (here exclude company see the page)
		driver.findElement(By.xpath("//a[contains(text(),'Raghav Productivity')]/ancestor::tr/preceding-sibling::tr"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
