package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Elements.Elements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefination extends Elements
{
	public Stepdefination(WebDriver driver) {
		super(driver);
	}

	@Given("User is on login page")
	public void user_is_on_login_page() 
	{
	    System.getProperty("webdriver.chrome.driver", "C:/Users/HP/eclipse-workspace/Cucumberjava/src/test/resources/drivers");
	    driver = new ChromeDriver();
	    dfind(Email);
	}

	@When("User enters valid rohithpatilmu@gmail.com and Rohithmu@{int}")
	public void user_enters_valid_rohithpatilmu_gmail_com_and_rohithmu(Integer int1) 
	{
	    
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
