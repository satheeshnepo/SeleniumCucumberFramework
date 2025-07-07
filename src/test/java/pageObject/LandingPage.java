package pageObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By search = By.cssSelector("[placeholder='Search for Vegetables and Fruits']");
	private By productName = By.cssSelector("h4.product-name");
	private By topDeals = By.cssSelector("[href='#/offers']");
	By cartIcon = By.cssSelector("[alt='Cart']");
	By increment = By.cssSelector(".increment");
	By numberOfProducts = By.cssSelector("input[type='number']");
	By addToCard = By.xpath("//button[contains(text(),'ADD TO CART')]");
	
	public void searchItem(String productName) {
		driver.findElement(search).sendKeys(productName);
	}
	
	public String getProductName() {
		return driver.findElement(productName).getText();
	}
	
	public void selectTopDealsPage() {
		driver.findElement(topDeals).click();
	}
	
    public String getTotalNumberOfProductsAdded() {
    	return driver.findElement(numberOfProducts).getAttribute("value");
    }
    

}
