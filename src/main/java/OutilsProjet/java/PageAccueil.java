package OutilsProjet.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;




public class PageAccueil extends AbstractPage {
	
	@FindBy(how = How.XPATH, using="//span[contains(text(),'/Continuer'/)]")
	public WebElement cookieButtonContinuer;
	

	public PageAccueil(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public PageAccueil clickContinuer() {
		
		cookieButtonContinuer.click();
		return PageFactory.initElements(driver, PageAccueil.class);
	}
	

}
