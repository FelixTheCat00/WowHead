package OutilsProjet.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPage {
	protected WebDriver driver;
	
	//WebDriverWait wait = new WebDriverWait(driver,20);
	//WebElement searchInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));

	
	@FindBy(how = How.XPATH, using="//input[@type='text']")
	public WebElement searchInput;

	@FindBy(how = How.XPATH, using="//a[@class='header-search-button fa fa-search']")
	private WebElement searchButton;
	
	@FindBy(how = How.XPATH, using="//span[contains(text(),'Continuer')]")
	private WebElement continueCookieButton;

	
	public AbstractPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public PagePremierResultat searchElement(String search) throws InterruptedException {
		Thread.sleep(5000);
		searchInput.sendKeys(search);
		searchButton.click();
		return PageFactory.initElements(driver, PagePremierResultat.class);
	}
	
	public void acceptCookie() throws InterruptedException {
		Thread.sleep(10000);
		if(continueCookieButton.isDisplayed()) {
		continueCookieButton.click();} else {}
		//return PageFactory.initElements(driver, PageAccueil.class);
	}
	
	

}
