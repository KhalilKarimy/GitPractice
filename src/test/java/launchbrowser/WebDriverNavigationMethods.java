package launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverNavigationMethods {
public static void main(String[] args) throws InterruptedException {
	
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://tek-retail-ui.azurewebsites.net/");
	Thread.sleep(2000);        
	
	//driver.navigate().to("https://www.facebook.com/");        
	//Thread.sleep(2000); 
	//driver.navigate().back(); 
	//Thread.sleep(2000);
	//driver.navigate().forward();        
	driver.navigate().refresh();     
	Thread.sleep(3000);    
	driver.navigate().refresh();       
	Thread.sleep(3000);       
	driver.navigate().refresh();    
	Thread.sleep(3000);      
	driver.navigate().refresh();
	
	
	
	
	
	
	
	
	
}
}
