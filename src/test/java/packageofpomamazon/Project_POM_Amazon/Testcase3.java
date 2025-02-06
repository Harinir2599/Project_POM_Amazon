package packageofpomamazon.Project_POM_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;


public class Testcase3 {
	@Test
	public void Adding_to_cart() {
		//EdgeOptions options = new EdgeOptions();
		//options.addArguments("--inprivate");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		HOmePage h = new HOmePage(driver);
		h.sigin();

		LoginPage l = new LoginPage(driver);
		l.username();
		l.sign_continue();
		l.password();
		l.pass_submit();

		h.searching();

		Addtowishlist a = new Addtowishlist(driver);

		a.shoe_product(driver);

		Cart c = new Cart(driver);
		c.cart();
		c.item_in_cart();
		c.product_increment();

		h.hoverover_signout(driver);
		h.sign_out();

	}

}
