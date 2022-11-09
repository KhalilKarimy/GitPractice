package locatorInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ID_ClassName {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    WebElement element1 = driver.findElement(By.id("search"));
	    element1.click();
	    Thread.sleep(4000);
	    WebElement element2 = driver.findElement(By.id("searchInput"));
	    element1.click();
	    
	    
	    String str1 = "computer";
     
        //element2.sendKeys(str1);
        element2.sendKeys("tv");
        WebElement element3 = driver.findElement(By.className("search__btn"));
        element3.click();
        
	    Thread.sleep(4000);

	    driver.close();
		
	}

}
