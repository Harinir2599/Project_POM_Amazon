package packageofpomamazon.Project_POM_Amazon;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HOmePage {
	WebDriver driver;
	//step1
	@FindBy(id="twotabsearchtextbox")
	WebElement searchtf;
	 
	@FindBy(xpath="//a[@class='nav-a nav-a-2   nav-progressive-attribute']")
	WebElement signin_home;
	
	@FindBy(xpath="//a[@id='nav-link-accountList']") 
	WebElement accountandlist_hoverover;
	
	@FindBy(xpath="//span[normalize-space()='Sign Out']") 
	WebElement signout;
	
	
	//step 2
	public void searching() {
		searchtf.sendKeys("lipstick"+Keys.ENTER);
	}
	 
	
	public void sigin () {
		signin_home.click();	
	}
	
	public void hoverover_signout(WebDriver driver) { 
		Actions a = new Actions(driver);
	 a.moveToElement(accountandlist_hoverover).perform(); }
	
	public void sign_out() { 
      signout.click();
 }
	
	
	//step 3 
	public HOmePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
