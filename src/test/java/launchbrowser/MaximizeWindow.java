package launchbrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MaximizeWindow {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tek-retail-ui.azurewebsites.net/");
       
		driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.close();
        
       
       // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
       
	}

}
