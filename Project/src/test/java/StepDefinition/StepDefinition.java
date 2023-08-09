package StepDefinition ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {

	 WebDriver driver;
	
		@Given("User is on the log in page")
		public void user_is_on_the_log_in_page() {
			System.out.println("User is on the log in page");
			
		    WebDriverManager.chromedriver().setup();
		    
		    driver = new ChromeDriver();  
		    driver.manage().window().maximize();
		    
		    driver.get("https://www.facebook.com/");
		}

		@When("User enters user name and password")
		
		public void user_enters_user_name_and_password() {
			
			System.out.println("User enters User name and password");
		   driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9738077291");
		   driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Nit@00420");
		   
		}

		@And("click on the log in button")
		public void click_on_the_log_in_button() {
			System.out.println("User clicks on log in button");
		  driver.findElement(By.xpath("//button[@name='login']")).click();
		}

		@Then("User should land on Home page")
		public void user_should_land_on_home_page() {
			System.out.println("User is on the Home page");
		
		    
		}
	

}
