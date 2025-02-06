package packageofpomamazon.Project_POM_Amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart {
WebDriver driver;
	
	@FindBy(id="add-to-cart-button")
	WebElement cart_button;
	
	@FindBy(id="nav-cart")
	WebElement item_cart;
	
	@FindBy(id="//button[@aria-label='Increase quantity by one']")
	WebElement increment;
	
	public void cart() {
		cart_button.click();
	}
	public void item_in_cart() {
		item_cart.click();
	}
	public void product_increment() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(increment)).click();
	}
	
	public Cart(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
}
