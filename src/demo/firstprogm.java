package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstprogm {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get ("https://www.eclipse.org/projects/archives.php");

	}

}
