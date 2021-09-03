package jenkinstraining;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UITest {

	@Parameters("Browser")
	@Test
	public void firstTest(String browsername) {
		
		WebDriver driver = null;
		
		if(browsername.contains("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else 
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		Assert.assertEquals(driver.getTitle(), "Google");
		
		driver.quit();
		
	}
	
}
