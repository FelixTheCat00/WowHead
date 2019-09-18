package AbstractTest.java;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import OutilsProjet.java.AbstractPage;


public class ConnexionWowHead  {
	@Test
	public void wowHeadTest () throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installation\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://fr.wowhead.com");
		Thread.sleep(3000);
		driver.close();
	}
}
