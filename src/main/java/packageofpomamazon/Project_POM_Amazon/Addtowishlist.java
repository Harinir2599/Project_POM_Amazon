package packageofpomamazon.Project_POM_Amazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Addtowishlist {
	WebDriver driver;
	
	
	@FindBy(xpath="(//div[@class='a-section a-spacing-base'])[1]")
	WebElement product1;
	
	@FindBy(id="add-to-wishlist-button-submit")
	WebElement wishlist_button;
	
	
	@FindBy(xpath="//input[@aria-label='Continue shopping']")
	WebElement view_list;
	
	public void shoe_product(WebDriver driver) {
		
		
		product1.click();
		Set<String> pid =driver.getWindowHandles();
		Iterator<String> i = pid.iterator();
		String parent =i.next();
		String child=i.next();
		driver.switchTo().window(child);
		System.out.println("The parent session id"+parent);
		System.out.println("The child session id"+child);
	}
	public void add_to_wishlist() {
		wishlist_button.click();
	}
	
	public void view_list_button() {
		
		
		view_list.click();
	}
	public Addtowishlist( WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

}
