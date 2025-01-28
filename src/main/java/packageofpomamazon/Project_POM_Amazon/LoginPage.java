package packageofpomamazon.Project_POM_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement un;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement continue_button;
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement pass;

	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement pass_button;


	public void username() {
		un.sendKeys("9025371260");
	}
	public void sign_continue() {
		continue_button.click();
	}
	public void password() {
		pass.sendKeys("Tejas@2025");
	}
	public void pass_submit() {
		pass_button.click();
	}

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
