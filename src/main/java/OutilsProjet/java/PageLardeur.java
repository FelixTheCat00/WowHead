package OutilsProjet.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageLardeur extends PageAccueil{

	
	@FindBy(how = How.XPATH, using="//a[@class='listview-cleartext']")
	public WebElement returnPage;
	
	@FindBy(how = How.XPATH, using="//span[@class='q']")
	public WebElement niveauObjet;
	
	@FindBy(how = How.XPATH, using="//span[@class='q1']")
	public WebElement pieds;
	
	public PageLardeur(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	

	 List<WebElement> tableauLardeur = driver.findElements(By.xpath("//tbody[@class='clickable']/tr"));
	
	public void checkLardeur() throws InterruptedException {
		for(int i=1;i<=tableauLardeur.size();i ++) {
			if (i==3) {
				
			}else {
			WebElement e = (WebElement) driver.findElement(By.xpath("(//tbody[@class='clickable']/tr)["+ i +"]"));
			Thread.sleep(5000);
			e.click();
			Thread.sleep(5000);
			System.out.println("The element number :"+i+" est passé.");
			returnPage.click();
			}
			
		} 
		
	}
}


