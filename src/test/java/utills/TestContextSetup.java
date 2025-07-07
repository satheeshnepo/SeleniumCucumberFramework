package utills;

import org.openqa.selenium.WebDriver;

import pageObject.PageObjectManager;

public class TestContextSetup {
	public WebDriver driver;
	public String productName;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtils genericUtils;
	
	public TestContextSetup() throws Exception{
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.webDriverManager());
		genericUtils = new GenericUtils(testBase.webDriverManager());
	}


}
