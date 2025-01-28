package packageofpomamazon.Project_POM_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart {
	WebDriver driver;
	
	@FindBy(id="add-to-cart-button")
	WebElement cart_button;
	
	@FindBy(id="nav-cart")
	WebElement item_cart;
	
	@FindBy(id="//span[@class='a-icon a-icon-small-add']")
	WebElement increment;
	
	public void add_to_cart() {
		cart_button.click();
	}
	public void item_in_cart() {
		item_cart.click();
	}
	public void product_increment() {
		increment.click();
	}
	public AddtoCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

}
