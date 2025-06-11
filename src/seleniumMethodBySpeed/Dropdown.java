package seleniumMethodBySpeed;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	WebElement leavingFrom = driver.findElement(By.xpath("//input[@placeholder=\"Leaving From\"]"));
//	 Select class on an <input> element, but Select only works with <select> dropdowns, like:
//		 <select>
//		   <option>Option 1</option>
//		   <option>Option 2</option>
//		 </select>
//		 But on AbhiBus, the "Leaving From" field is an <input> box (with auto-suggestions, not a <select> dropdown).
//	Select dd = new Select(singleElement);
//	List<WebElement>city =  dd.getOptions();
	
	// we have to use send key method
	
	leavingFrom.sendKeys("Raipur");
	Thread.sleep(3000);
	leavingFrom.click();
	Thread.sleep(3000);
	
	WebElement goingTo = driver.findElement(By.xpath("//input[@placeholder='Going To']"));
	Thread.sleep(3000);
	goingTo.click();
	Thread.sleep(3000);
	goingTo.sendKeys("Varanasi");
	Thread.sleep(3000);
	goingTo.click();
	Thread.sleep(3000);
	
	WebElement jurnyDate = driver.findElement(By.xpath("//input[@placeholder='Onward Journey Date']"));
	Thread.sleep(3000);
	jurnyDate.click();
	Thread.sleep(3000);
	
	
	
	
	
	
	
	
	
	
driver.close();
	}

}
