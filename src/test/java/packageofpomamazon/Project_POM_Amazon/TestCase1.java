package packageofpomamazon.Project_POM_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
//login -> search -> logout
public class TestCase1 {
	@Test
	public void logintoamazon_search_logout() {
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
		h.hoverover_signout(driver);
		h.sign_out();
		
		
		
		
	}

}
