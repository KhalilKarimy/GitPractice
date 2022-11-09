package webElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethod3 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//shrotcut for importing all of the required import (ctrl + shift + o)
		//getText();
		//getText() would get us the inner text of a webelement
		WebElement signinBttn = driver.findElement(By.id("signinBtn"));
		System.out.println("Element text: " + signinBttn.getText());
		System.out.println("original text: " + signinBttn.getAttribute("textContent"));
		
		//getTagName();
		System.out.println("Node tagName: " + signinBttn.getTagName());
		//getCssValue();
		WebElement searchBttn = driver.findElement(By.id("searchBtn"));
		System.out.println("Background color: " + searchBttn.getCssValue("background-color"));
		
		//getAttribute();
		System.out.println("Attribute: " + signinBttn.getAttribute("id"));
		System.out.println("Attribute: " + signinBttn.getAttribute("class"));
		WebElement search2 = driver.findElement(By.id("searchBtn"));
		System.out.println(search2.getDomProperty("innerHTML"));
		
		//getSize()
		WebElement tekschoolLogo = driver.findElement(By.xpath("//h1[text()='TEKSCHOOL']"));
		System.out.println("Size of Tekschool Logo: " +  tekschoolLogo.getSize());
		System.out.println("Height of Tekschool Logo: " +  tekschoolLogo.getSize().getHeight());
		System.out.println("Width of Tekschool Logo: " +  tekschoolLogo.getSize().getWidth());
		
		//getLocation();
		System.out.println("Location of Element: " + tekschoolLogo.getLocation());
		System.out.println("Location of Element X: " + tekschoolLogo.getLocation().getX());
		System.out.println("Location of Element Y: " + tekschoolLogo.getLocation().getY());
		
		Thread.sleep(4000);
		driver.close();
		
		
		
		

	}

}
