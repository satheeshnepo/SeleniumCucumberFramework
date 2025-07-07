package pageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

   public WebDriver driver;
   
   public PageObjectManager(WebDriver driver) {
	   this.driver = driver;
   }
   
   public LandingPage getLandingPage() {
	   return new LandingPage(this.driver);
   }
   
   
   public OfferPage getOfferPage() {
	   return new OfferPage(this.driver);
   }
   
   public CheckOutPage getCheckOutPage() {
	   return new CheckOutPage(this.driver);
   }
}
