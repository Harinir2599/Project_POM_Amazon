package packageofpomamazon.Project_POM_Amazon;

import org.testng.annotations.Test;


import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

@Test
public class Testcase2 {
	
	public void product_wishlist() {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--inprivate");
		WebDriver driver = new EdgeDriver(options);
		
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
		a.add_to_wishlist();
		
		
		h.hoverover_signout(driver);
		h.sign_out();
		
}
}
