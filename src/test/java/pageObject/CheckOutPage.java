package pageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutPage {
	WebDriver driver;
	WebDriverWait wait;
	
	By cartIcon = By.cssSelector("[alt='Cart']");
	By increment = By.cssSelector(".increment");
	By numberOfProducts = By.cssSelector("input[type='number']");
	By addToCard = By.xpath("//button[contains(text(),'ADD TO CART')]");
	By checkOutButton = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By promoButton = By.cssSelector(".promoBtn");
	By placeOrder = By.xpath("//button[contains(text(),'Place Order')]");
	By checkOutProductName = By.cssSelector("tbody tr td:nth-child(2) p");
	
	
	public CheckOutPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(3));
	}
	

	public void incrementTheProducts(int incrementValue) {
		int i =0;
		if(i == incrementValue) {
			driver.findElement(increment).click();
		}
		else
			while( i <= incrementValue) {
				driver.findElement(increment).click();
				i++;
				
			}
		
	}
	public void clickAddToCart() {
	    	driver.findElement(addToCard).click();
	}
	public void clickCheckOutButton() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(checkOutButton));
		driver.findElement(checkOutButton).click();
		Thread.sleep(3000);
	}
	
	public boolean VerifyPromoBtn() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(promoButton));
		return driver.findElement(promoButton).isDisplayed();
	}
	public boolean VerifyPlaceOrderButton() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(placeOrder));
		return driver.findElement(placeOrder).isDisplayed();
	}
	public void clickCartButton() {
		driver.findElement(cartIcon).click();
	}
	
	public String verifyProductName(String productName) {
		return driver.findElement(checkOutProductName).getText().split("-")[0].trim();
	}
	

}

