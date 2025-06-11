package seleniumMethodByPw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.abhibus.com/");
	
	String date = "September 2025";
	String day ="1";
	
	
	driver.findElement(By.xpath("//input[@placeholder=\"Onward Journey Date\"]")).click();
	//String dat = driver.findElement(By.xpath("//div[contains(@class,'calendar')]/descendant::div[@class=\" col\"]")).getText();
     // System.out.println(dat);
      
    // driver.findElement(By.xpath("//span[@class=\"calender-month-change\"]")).click();
     // String dat1 = driver.findElement(By.xpath("//div[contains(@class,'calendar')]/descendant::div[@class=\" col\"]")).getText();
     // System.out.println(dat1);
      
      //driver.findElement(By.xpath("(//span[@class=\"calender-month-change\"])[2]")).click();
     // String dat2 = driver.findElement(By.xpath("//div[contains(@class,'calendar')]/descendant::div[@class=\" col\"]")).getText();
     // System.out.println(dat2);
      
//      if(date.equals(dat2)) {
//    	 // System.out.println("actaul and expected are same");
//    	  driver.findElement(By.xpath("//a[text()="+day+"]")).click();
//    	  Thread.sleep(3000);
	
     // }
	while(true) {
		String s = driver.findElement(By.xpath("//div[contains(@class,'calendar')]/descendant::div[@class=' col']")).getText();
		
	if (s.equals(date)) {
		driver.findElement(By.xpath("//div[@class='container date ']/a[text()='" + day + "']")).click();
		break;
	}else  {
		driver.findElement(By.xpath("//*[@id='jaurney-date']/div/div[2]/div[1]/div[3]/span")).click();
		
	}
      
      
	}
	}
}
