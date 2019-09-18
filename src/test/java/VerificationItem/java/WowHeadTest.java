package VerificationItem.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import AbstractTest.java.ConnexionWowHead;
import OutilsProjet.java.PageAccueil;
import OutilsProjet.java.PageLardeur;
import OutilsProjet.java.PagePremierResultat;

public class WowHeadTest {

	WebDriver driver;
	
	
	@Before
	public void setupTest() {
		
		String browser1 =System.getProperty("browser");
		
		switch(browser1) {
		
		  case "chrome":
			  System.setProperty("webdriver.chrome.driver", "C:\\Installation\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
		    break;
		  case "gecko":
			  System.setProperty("webdriver.chrome.driver", "C:\\Installation\\driver\\geckodriver.exe");
			   driver = new FirefoxDriver();
		    break;
		  case "ie":
			  System.setProperty("webdriver.chrome.driver", "C:\\Installation\\driver\\IEDriverServer.exe");
			  driver =  new InternetExplorerDriver();			
		}
	}
	
	@Test
	public void wowHeadTest () throws InterruptedException {
       
		driver.manage().window().maximize();
		driver.get("https://fr.wowhead.com");

		System.out.println("---------------------- Acceptation des cookies ------------------------");
		
		//Cliquer sur le bouton continuer du cookie
		PageAccueil accueil = PageFactory.initElements(driver, PageAccueil.class);
		accueil.acceptCookie();
		
		System.out.println(" ---------------- Accession à la page premier résultat -----------------");
		PagePremierResultat pagePremier = accueil.searchElement("Lardeur");
		pagePremier.clickOngletPNJ();
		
		System.out.println(" -------------------- Accession à la page lardeur ----------------------");
		PageLardeur pageLardeur = pagePremier.clickOnTeteDeMort();
		Thread.sleep(5000);
		System.out.println(" -------------------- Clique sur la page lardeur ----------------------");
		pageLardeur.checkLardeur();
		
		
	}
	
	@After public void close() {
		driver.close();
	}
	
}
	
	
	

