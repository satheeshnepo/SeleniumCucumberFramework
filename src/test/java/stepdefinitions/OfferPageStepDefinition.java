package stepdefinitions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObject.LandingPage;
import pageObject.OfferPage;
import utills.TestContextSetup;

//You have to follow two rules 
//Single Responsibility 
//loosly coupled



public class OfferPageStepDefinition {
	String childProductName;
	TestContextSetup testContextSetup;
	public OfferPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		
	}
	
	@Then("^user go and search same (.+) on offer page to check product exist$")
	public void user_go_and_search_same_shortname_on_offer_page_to_check_product_exist(String productName) {
		   testContextSetup.genericUtils.switchToChildWindow();
           OfferPage offerPage = testContextSetup.pageObjectManager.getOfferPage();
           childProductName = offerPage.getProductName(productName);
           
	}
	

	@Then("get matching both products")
	public void get_assertion_products_name() {
	    Assert.assertEquals(testContextSetup.productName, childProductName);
		
	}


}
