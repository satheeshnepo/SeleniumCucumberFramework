package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LandingPage;
import utills.TestContextSetup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LandingPageStepDefinition{
	WebDriver driver;
	String productName;
	String childProductName;
	TestContextSetup testContextSetup;
	LandingPage landingPage;
	
	public LandingPageStepDefinition(TestContextSetup testContextSetup) {
		
		this.testContextSetup = testContextSetup;
	}
	
	@Given("user must on Green card Landing page")
	public void user_must_on_green_card_landing_page() {
		landingPage = testContextSetup.pageObjectManager.getLandingPage();
		
		
	}
	@When("^user searched with shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   
	   landingPage.searchItem(shortName);
	   Thread.sleep(4000);
	   productName = landingPage.getProductName().split("-")[0].strip();
	   testContextSetup.productName = productName;
	   landingPage.selectTopDealsPage();
	
	   
	}
	@When("^user searched with shortname (.+) and extracted actual name of products$")
	public void user_searched_with_shortname_tom_and_extracted_actual_name_of_products(String shortName) throws InterruptedException {
		  landingPage.searchItem(shortName);
		   Thread.sleep(2000);
	 
	}


}
