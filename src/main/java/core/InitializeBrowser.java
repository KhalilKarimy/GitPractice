package core;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitializeBrowser {

	
	
	public static void launchBrowser(String url) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.close();
		
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		
		
		
	}
}
