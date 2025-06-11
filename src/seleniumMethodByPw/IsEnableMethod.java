package seleniumMethodByPw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableMethod {

	public static void main(String[] args) throws InterruptedException {
		
		// we can check enable/disable status of elements/operational elements
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		driver.manage().window().maximize();
		 Thread.sleep(2000);
		
		boolean Firstname = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).isEnabled();
		System.out.println("first name is enable  :" +Firstname);
		
       boolean male =  driver.findElement(By.xpath("//input[@id=\"gender-male\"]")).isEnabled();
       System.out.println("is male radio button enabled : " +male);
       
       driver.findElement(By.xpath("//input[@id=\"Newsletter\"]")).click();
       Thread.sleep(2000);
       
       boolean chekbox = driver.findElement(By.xpath("//input[@id=\"Newsletter\"]")).isEnabled();
       System.out.println("checkbox enable  :"+chekbox);
       
      boolean register =  driver.findElement(By.xpath("//button[@name=\"register-button\"]")).isEnabled();
       System.out.println("register button is enablesd   :"+register);
       
   	driver.get("https://testautomationpractice.blogspot.com/");
	Thread.sleep(2000);
	boolean simpleAlrtBtn = driver.findElement(By.xpath("//button[@id='alertBtn']")).isEnabled();
	System.out.println("is buton enabled  : " + simpleAlrtBtn);
       
       driver.close();
        
	}

}
