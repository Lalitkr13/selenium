package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingaxesfb {

	public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/r.php?entry_point=login");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//div[@id='reg_form_box']"));
	
	// now find sign up button using this x path by axes method
	
	// method 1
	driver.findElement(By.xpath("//div[@id='reg_form_box']/child::div[11]/button"));
	
	// method 2
	driver.findElement(By.xpath("//div[@id='reg_form_box']/descendant::div[52]/button"));
	
	// method 3  we can not find this by using follwoing method because we choose self as a hole box ,inside box children present ,but by using following we scroll out of box
	
	
	// que -now find 

	}

}
