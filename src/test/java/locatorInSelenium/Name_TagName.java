package locatorInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Name_TagName {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	    WebElement element5 = driver.findElement(By.name("email"));
	    element5.sendKeys("khalilkarimy58@gmail.com");
	    WebElement element6 = driver.findElement(By.name("pass"));
	    element6.sendKeys("123456");
	    
	    WebElement element7 = driver.findElement(By.tagName("h2"));
	   String str7 = element7.getText();
	   System.out.println(str7);
	    
	    
	    
	    
	    Thread.sleep(4000);
	    driver.close();
	}

}
