package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.CheckOutPage;
import pageObject.LandingPage;
import utills.TestContextSetup;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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

public class CheckOutPageStepDefinition{
	WebDriver driver;
	TestContextSetup testContextSetup;
	CheckOutPage checkOutPage;
	
	public CheckOutPageStepDefinition(TestContextSetup testContextSetup) {
		
		this.testContextSetup = testContextSetup;
		checkOutPage = testContextSetup.pageObjectManager.getCheckOutPage();
		
	}

	@Then("Verify user has ability to enter promo code and place the order")
	public void verify_promo_code_and_place_the_order() throws InterruptedException {
		assertTrue(checkOutPage.VerifyPlaceOrderButton());
		assertTrue(checkOutPage.VerifyPromoBtn());
		
	
		
	}
	@Then("^user proceeds to checkout and validate (.+) items in checkout page$")
	public void user_proceeds_to_checkout_validate_items(String productName) throws InterruptedException {
		checkOutPage.clickCheckOutButton();
//		assertEquals(checkOutPage.verifyProductName(productName),productName);
	}
	@When("^add (.+) items to cart$")
	public void add_items_to_cart(String quantity) {
		int quatity = Integer.parseInt(quantity);
		checkOutPage.incrementTheProducts(quatity);
		checkOutPage.clickAddToCart();
		checkOutPage.clickCartButton();
		
	}
	
	

}
