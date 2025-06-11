package seleniumMethodBySpeed;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToGetTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();
		
		// how to find size of row---> first go to table then uder this go for tbody under tbody there is tr , for parent to child use // and within the same body use /
		int row = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr")).size();
		System.out.println("this is size of row  "+row);
		
		//size of column
		int colmn = driver.findElements(By.xpath("//table[@id='table1']//thead/tr/th")).size();
		System.out.println("this is size of column  "+colmn);
		
		String frstvalue = driver.findElement(By.xpath("//table[@id='table1']//tbody/tr[1]/td[1]")).getText();
		System.out.println("this is table first value  "+frstvalue );
		
		
		for(int r=1 ; r<=row ; r++) {
			for(int c =1 ; c<=colmn; c++ ) {
				String table = driver.findElement(By.xpath("//table[@id='table1']//tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print(table +"    ");
			}
			System.out.println();
				
		}
		
		driver.close();

	}

}
