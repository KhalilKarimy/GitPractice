package webElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeSubmitMethod {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tek-retail-ui.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement signInBttn = driver.findElement(By.xpath("//button[@id='signinBtn']"));
		signInBttn.click();
		WebElement createNewAcct = driver.findElement(By.xpath("//button[@class='login__account-btn']"));
		createNewAcct.click();
		WebElement name = driver.findElement(By.xpath("//input[@id='nameInput']"));
		name.sendKeys("David Colunga");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		//make sure to user different email address when you are running this code
		email.sendKeys("davidcolunga101@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='passwordInput']"));
		password.sendKeys("DAVIDcolunga@2022");
		WebElement confirmPass = driver.findElement(By.xpath("//input[@id='confirmPasswordInput']"));
		confirmPass.sendKeys("DAVIDcolunga@2022");
		//submit();
		//would submit a form after all required fields are filled-out
		//you can use reference to locator of any of the elements on the form, and call
		//the .submit() method, and it would allow you to submit the form after all
		//required fields are filld-out
		name.submit();

	}

}
