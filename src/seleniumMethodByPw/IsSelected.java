package seleniumMethodByPw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
      public static void main(String[] args) throws InterruptedException {
    	  // we can use to check the element is selected or not
    	  
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		Thread.sleep(2000);
		
	WebElement male_rd =	driver.findElement(By.xpath("//input[@id='gender-male']"));
	WebElement female_rd=	driver.findElement(By.xpath("//input[@id='gender-female']"));
	
	System.out.println("before selection-------");
	System.out.println(male_rd.isSelected());
	System.out.println(female_rd.isSelected());
	
	// selecting a male 
	male_rd.click();
	Thread.sleep(2000);
	
	System.out.println("after selecting male ----");
	System.out.println(male_rd.isSelected());
	System.out.println(female_rd.isSelected());
	
	
	
	
driver.close();
	}

}
