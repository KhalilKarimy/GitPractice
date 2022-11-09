package launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();
		
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		
		
		String PageTitle = driver.getTitle();
		System.out.println("Page Title is: " + PageTitle);
		
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is: " +CurrentUrl);
		
		String PageSource = driver.getPageSource();
		System.out.println("PageSource is: " +PageSource);
		
		//driver.close();
		//driver.quit();
		
		
		
		
}}