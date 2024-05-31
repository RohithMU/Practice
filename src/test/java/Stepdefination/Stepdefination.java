package Stepdefination;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Elements.Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefination extends Elements
{
	static WebDriver driver;
	public Stepdefination() 
	{
		super(driver);
	}

	@Given("User is on login page")
	public void user_is_on_login_page() 
	{
	    System.getProperty("webdriver.chrome.driver", "C:/Users/rohit/Downloads/chrome-win64/chrome-win64/chrome.exe");
	    driver = new ChromeDriver();
	    driver.navigate().to("https://demowebshop.tricentis.com/");
	}
	@When("^User enters valid (.*) and (.*)$")
	public void user_enters_valid_rohithpatilmu_gmail_com_and_rohithmu(String username, String password) 
	{
		dfind(Login_In);
	    dfind(Email,username);
	    dfind(Password,password);
	}
	@And("User clicks on login button")
	public void user_clicks_on_login_button() 
	{
	    
	}

	@Then("User is able to navigate homepage")
	public void user_is_able_to_navigate_homepage() 
	{
	    
	}
}
