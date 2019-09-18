package VerificationItem.java;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import AbstractTest.java.ConnexionWowHead;
import OutilsProjet.java.PageAccueil;
import OutilsProjet.java.PageLardeur;
import OutilsProjet.java.PagePremierResultat;

public class WowHeadTest {

	
	@Test
	public void wowHeadTest () throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Installation\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println(" -------------------- Chargement de la page WowHead -------------------");
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
		
		driver.close();
	}
}
	
	
	

