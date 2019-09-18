package OutilsProjet.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PagePremierResultat extends PageAccueil{
	
	@FindBy(how = How.XPATH, using="//div[contains(text(),'PNJ')]")
	public WebElement ongletPNJ;
	
	@FindBy(how = How.XPATH, using="//td[@class='icon-boss-padded']")
	public WebElement teteDeMort;
	
	public PagePremierResultat(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public PagePremierResultat clickOngletPNJ() throws InterruptedException {
		Thread.sleep(5000);
		ongletPNJ.click();
		return PageFactory.initElements(driver, PagePremierResultat.class);
	}
	
	public PageLardeur clickOnTeteDeMort() throws InterruptedException {
		Thread.sleep(5000);
		teteDeMort.click();
		return PageFactory.initElements(driver, PageLardeur.class);
		}
}
