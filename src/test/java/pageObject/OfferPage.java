package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
	  WebDriver driver;
      By searchElement = By.id("search-field");
      By productNameWebElement = By.cssSelector("tbody tr td:first-child");
      
      public OfferPage(WebDriver driver) {
    	  this.driver = driver;
    	  
      }
      
      public String getProductName(String productName) {
    	  driver.findElement(searchElement).sendKeys(productName);
		  return driver.findElement(productNameWebElement).getText();
    	  
      }
}
