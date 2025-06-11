import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandels2 {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	      driver.get("https://www.flipkart.com/");
	      driver.manage().window().maximize();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//div[@class='_1yQHx8 _2UnIQ_ _3ak8Rd _1kAmyc']//div[4]//div[1]//div[1]//div[1]//a[1]//div[1]//div[1]//div[2]//div[2]")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//a[@title='WROGN Zero Men Printed Round Neck Cotton Blend Black T-Shirt']")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//a[normalize-space()='Men Solid Polo Neck Cotton Blend Black T-Shirt']")).click();
	      Thread.sleep(3000);
	       Set<String>windowsID  = driver.getWindowHandles();
	      
	       List<String>windowsIDList = new ArrayList(windowsID);
	       String parentId = windowsIDList.get(0);
           String child1Id = windowsIDList.get(1);
           String child2Id = windowsIDList.get(2);
           
           driver.switchTo().window(parentId);
           System.out.println("this is parent id  :" + parentId);
           System.out.println("this is parent window title  :" + driver.getTitle());
           System.out.println();
           
           driver.switchTo().window(child1Id);
           System.out.println("this is parent id  :" +child1Id );
           System.out.println("this is child1 window title  :" +driver.getTitle());
           System.out.println();
           
           driver.switchTo().window(child2Id);
           System.out.println("this is parent id  :" + child2Id);
           System.out.println("this is child1 window title  :" +driver.getTitle());
         
           driver.quit();
           
           
	}

}
