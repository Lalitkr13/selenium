package seleniumMethodBySpeed;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
	// 1 simple alert where only one option available  - ok
		
		driver.findElement(By.xpath("// button[text()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		      //or
		Alert simplealert = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println("this is simple alert  "+ simplealert.getText());
		simplealert.accept();
		Thread.sleep(3000);
		
		// 2 here two option available ok and cancel  so this is confirmation type
		
		driver.findElement(By.xpath("// button[text()='Click for JS Confirm']")).click();
		Thread.sleep(2000);
        //driver.switchTo().alert().accept();
		//Thread.sleep(3000);
		//driver.switchTo().alert().dismiss();
		//Thread.sleep(3000);
		Alert confirmation = driver.switchTo().alert();
		System.out.println("this is confirmation alert  :"+confirmation.getText());
		Thread.sleep(2000);
		confirmation.dismiss();
		Thread.sleep(2000);
		
		// 3 prompt alert - input text
		driver.findElement(By.xpath("// button[text()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		Alert prompt = driver.switchTo().alert();
		System.out.println("this is prompt alert :"+prompt.getText() );
		prompt.sendKeys("welcome");
		Thread.sleep(2000);
		prompt.accept();
		Thread.sleep(2000);
		
		String res = driver.findElement(By.id("result")).getText();
		if(res.contains("lalit")) {
			System.out.println("test case pas");
		}else {
			System.out.println("test case fail");
		}
		
		
		
		
		
		driver.close();
	}

}
