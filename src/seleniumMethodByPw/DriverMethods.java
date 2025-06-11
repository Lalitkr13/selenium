package seleniumMethodByPw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Predicate;

public class DriverMethods {

	public static void main(String[] args) throws InterruptedException {
	    
		WebDriver driver = new ChromeDriver();
		
		// get url
		driver.get("https://www.orangehrm.com/");
		
		// get title
	System.out.println(driver.getTitle());
	
	//getPageSource()-- return source code of page
	//System.out.println(driver.getPageSource());
	
	//getWindowHandle()---returns ID of the single Browser window this is not constant always change 
	//String windowid = driver.getWindowHandle();
	//System.out.println("window id is "+windowid );//45BF58483E8EAD6FA14096984EFD31EB
	                                              //F2ED2D747176ABD6C9D2DE481EF16A6C
	
	//getCurrentUrl()
	System.out.println(driver.getCurrentUrl());
	
	
       
	
	
	
	
	
	
	
	
	driver.close();
	
	
	
	
	
	
	}

}
