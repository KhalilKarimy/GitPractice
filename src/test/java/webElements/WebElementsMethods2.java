package webElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsMethods2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		//sendKeys();
		//will send keys(charSequence) to an input field
		WebElement emailField = driver.findElement(By.id("email"));
		emailField.sendKeys("email@gmail.com");
		
		//Clear();
		//will clear any text that is present in a input field
		emailField.clear();
		
		//click();
		//would click on a webelement (usually a button, dropdown, check box, radio button, etc)
		WebElement createNewAcct = driver.findElement(By.xpath("//a[text()='Create new account']"));
		createNewAcct.click();
		Thread.sleep(2000);

		//isDisplayed
		//isEnabled
		//isSelected
		//the three above methods are mainly used to check and see if radio button and/or check boxes are
		//displayed, enabled and/or selected. and when we automate the process, we have check for those
		//conditions and make sure the buttons are satisfying the requirement
		WebElement radioBttnFemale = driver.findElement(By.xpath("//input[@value='1']"));
//		radioBttnFemale.click();
		if(radioBttnFemale.isDisplayed() && radioBttnFemale.isEnabled() && !radioBttnFemale.isSelected()) {
			radioBttnFemale.click();
			System.out.println("Radio button is clicked");
		}else {
			System.out.println("Radio button failed one of the conditions");
		}
		
		
		
		if(radioBttnFemale.isDisplayed()) {
			System.out.println("Is displayed");
			if(radioBttnFemale.isEnabled()) {
				System.out.println("Is enabled");
				if(!radioBttnFemale.isSelected()) {
					System.out.println("Is not selected");
				}
			}
		}else {
			System.out.println("One of the condition was not satisified");
		}
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		if(firstName.isDisplayed() && firstName.isEnabled()) {
			firstName.sendKeys("John");
			System.out.println("John name was sent to the input field");
		}else {
			System.out.println("FirstName field failed one or more conditions");
		}
		

		Thread.sleep(6000);
		driver.close();
		
	}

}
