package locatorInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkText_PartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	   // WebElement forgotpass = driver.findElement(By.linkText("Forgot password?"));
	   // forgotpass.click();
	    
	    //WebElement forgotpass2 = driver.findElement(By.partialLinkText("Forgot"));
	   // forgotpass2.click();
	   
	    WebElement forgotpass23 = driver.findElement(By.partialLinkText("password?"));
	    forgotpass23.click();
	    
	    
	    
	    Thread.sleep(4000);
	    driver.close();

	}

}
