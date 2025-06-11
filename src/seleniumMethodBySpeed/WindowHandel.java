package seleniumMethodBySpeed;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandel {

	public static void main(String[] args) throws InterruptedException {

      WebDriver driver = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://www.flipkart.com/");
      driver.manage().window().maximize();
     // Thread.sleep(3000);
      driver.findElement(By.xpath("//div[text()='Top Rated Styles!']")).click();
     // Thread.sleep(3000);
      driver.findElement(By.xpath("//div[@data-id='SFFHAPDFWWQCGANZ']//a[@title='Men Slides'][normalize-space()='Men Slides']")).click();
    //  Thread.sleep(3000);
      driver.findElement(By.xpath("//a[contains(text(),'Mechanical Engineering (JE) Chapterwise & Sub-Topi')]")).click();
     // Thread.sleep(3000);
       Set<String>windowsID  = driver.getWindowHandles();
      // Thread.sleep(3000);
       
       Iterator<String>IT = windowsID.iterator();
       
       String parent = IT.next();
       String child1 = IT.next();
       String child2 = IT.next();
       
       System.out.println(parent);
       System.out.println(child1);
       System.out.println(child2);
      
       
       
    driver.quit();
	}

}
