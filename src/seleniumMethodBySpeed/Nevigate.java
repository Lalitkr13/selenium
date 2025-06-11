package seleniumMethodBySpeed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nevigate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://www.flipkart.com/clo/~cs-r64irud5se/pr?sid=clo&collection-tab-name=Men%27s+Clothings&pageCriteria=default&p%5B%5D=facets.ideal_for%255B%255D%3DMen&p%5B%5D=facets.brand%255B%255D%3DAdrenex&p%5B%5D=facets.brand%255B%255D%3DBillion&p%5B%5D=facets.brand%255B%255D%3DDUCATI&p%5B%5D=facets.brand%255B%255D%3DGLOBAL%2BNOMAD&p%5B%5D=facets.brand%255B%255D%3DM7%2BBy%2BMetronaut&p%5B%5D=facets.brand%255B%255D%3DMARVEL%2BBy%2BMetronaut&p%5B%5D=facets.brand%255B%255D%3DMETRONAUT&p%5B%5D=facets.brand%255B%255D%3DMETRONAUT%2BPLUS&p%5B%5D=facets.brand%255B%255D%3DNAUTICA&p%5B%5D=facets.brand%255B%255D%3DPROVOGUE&p%5B%5D=facets.brand%255B%255D%3DPROWL&p%5B%5D=facets.brand%255B%255D%3DSLAZENGER&p%5B%5D=facets.brand%255B%255D%3DSvatantra&p%5B%5D=facets.brand%255B%255D%3DANOUK&p%5B%5D=facets.brand%255B%255D%3DFrench%2BConnection&p%5B%5D=facets.brand%255B%255D%3DHARVARD&p%5B%5D=facets.brand%255B%255D%3DHERE%2526NOW&p%5B%5D=facets.brand%255B%255D%3DHouse%2Bof%2BPataudi&p%5B%5D=facets.brand%255B%255D%3DHRX%2Bby%2BHrithik%2BRoshan&p%5B%5D=facets.brand%255B%255D%3DINVICTUS&p%5B%5D=facets.brand%255B%255D%3DKook%2BN%2BKeech&p%5B%5D=facets.brand%255B%255D%3DKook%2BN%2BKeech%2BDisney&p%5B%5D=facets.brand%255B%255D%3DKook%2BN%2BKeech%2BMarvel&p%5B%5D=facets.brand%255B%255D%3DM%2526H%2BEasy&p%5B%5D=facets.brand%255B%255D%3DMast%2B%2526%2BHarbour&p%5B%5D=facets.brand%255B%255D%3DMinions%2Bby%2BKook%2BN%2BKeech&p%5B%5D=facets.brand%255B%255D%3DModa%2BRapido&p%5B%5D=facets.brand%255B%255D%3DMr%2BBowerbird&p%5B%5D=facets.brand%255B%255D%3DRoadster&p%5B%5D=facets.brand%255B%255D%3DSangria&p%5B%5D=facets.brand%255B%255D%3DSztori&p%5B%5D=facets.brand%255B%255D%3DTaavi&p%5B%5D=facets.brand%255B%255D%3DWROGN&param=76821");
          driver.manage().window().maximize();
          Thread.sleep(3000);
          driver.navigate().to("https://www.flipkart.com/");
          Thread.sleep(3000);
          driver.navigate().forward();
          Thread.sleep(3000);
          driver.navigate().back();
          Thread.sleep(3000);
          driver.navigate().refresh();
          Thread.sleep(3000);
          driver.close();
         


	}

}
